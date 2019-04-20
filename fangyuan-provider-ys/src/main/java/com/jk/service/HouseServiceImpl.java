package com.jk.service;

import com.jk.mapper.HouseMapper;
import com.jk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:20
 * @Author: 袁硕
 * @Description:
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public Map<String, Object> selectHousePage(Integer page, Integer rows) {
        Map<String, Object> hashMap = new HashMap<String, Object>();
        //查询总条数
        long total = houseMapper.queryHouseTotal();
        int  start=(page-1)*rows;
        List<HouseBean> list=houseMapper.selectHouseList(start,rows);
        hashMap.put("total",total);
        hashMap.put("rows",list);
        return hashMap;
    }

    @Override
    public void deleteHouseById(Integer id) {
        houseMapper.deleteHouseById(id);
    }

    @Override
    public void delAllHouse(String ss) {
        Integer [] id={};
        String [] ids= ss.split(",");
        for (int i=0; i<ids.length;i++){
            System.out.println(ids[i]);
        }
        houseMapper.delAllHouse(ids);
    }

    @Override
    public HouseBean selectHouseById(Integer id) {
        return houseMapper.selectHouseById(id);
    }











}
