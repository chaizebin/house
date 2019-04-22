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
 * @Date: 2019/4/16 19:51
 * @Author: 任豪杰
 * @Description:
 */
@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public void insertHouse(HouseBean houseBean) {
        houseMapper.insertHouse(houseBean);
    }

    @Override
    public List<HouseAreaBean> selArea(Integer pid) {
        return houseMapper.selArea(pid);
    }

    @Override
    public List<HouseTypeBean> huxing() {
        return houseMapper.huxing();
    }

    @Override
    public List<HouseOrientationBean> chaoxiang() {
        return houseMapper.chaoxiang();
    }

    @Override
    public List<HouseSubwayBean> selSubway(Integer pid) {
        return houseMapper.selSubway(pid);
    }

    @Override
    public HouseBean updHouseInfoById(Integer id) {
        return houseMapper.updHouseInfoById(id);
    }

    @Override
    public void updateHouse(HouseBean houseBean) {
        houseMapper.updateHouse(houseBean);
    }

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

}
