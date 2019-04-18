package com.jk.controller;

import com.jk.model.*;
import com.jk.service.HouseServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:42
 * @Author: 袁硕
 * @Description:
 */
@Controller
@RequestMapping("houseFeign")
public class HouseController {

    @Autowired
    private HouseServiceFeign houseServiceFeign;

    @GetMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(Integer page , Integer rows){
        System.out.println(page+"--"+rows);
        return houseServiceFeign.selectHousePage(page,rows);
    }

    @DeleteMapping("deleteHouseById")
    @ResponseBody
    public void deleteHouseById(Integer id){
        System.out.println(id);
        houseServiceFeign.deleteHouseById(id);
    }
    @DeleteMapping("delAllHouse")
    @ResponseBody
    public void delAllHouse(String ss){
        System.out.println("删除id:--"+ss);
        houseServiceFeign.delAllHouse(ss);
    }

    @GetMapping("selectHouseById")
    @ResponseBody
    public HouseBean selectHouseById(Integer id){
        System.out.println(id);
        return houseServiceFeign.selectHouseById(id);
    }
    @PutMapping("updateHouse")
    @ResponseBody
    public  void updateHouse(@RequestBody HouseBean houseBean){
        System.out.println(houseBean);
        houseServiceFeign.updateHouse(houseBean);
    }




}
