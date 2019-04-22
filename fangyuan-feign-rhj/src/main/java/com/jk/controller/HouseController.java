package com.jk.controller;

import com.jk.model.*;
import com.jk.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 19:50
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(Integer page , Integer rows){
        System.out.println(page+"--"+rows);
        return houseService.selectHousePage(page,rows);
    }

    @RequestMapping("updHouseInfoById")
    @ResponseBody
    public HouseBean updHouseInfoById(Integer id){
        return houseService.updHouseInfoById(id);
    }

    @GetMapping("selSubway")
    @ResponseBody
    public List<HouseSubwayBean> selSubway(Integer pid){
        return houseService.selSubway(pid);
    }

    @GetMapping("chaoxiang")
    @ResponseBody
    public List<HouseOrientationBean> chaoxiang(){
        return houseService.chaoxiang();
    }

    @GetMapping("huxing")
    @ResponseBody
    public List<HouseTypeBean> huxing(){
        return houseService.huxing();
    }

    @GetMapping("selArea")
    @ResponseBody
    public List<HouseAreaBean> selArea(Integer pid){
       return houseService.selArea(pid);
    }

    @RequestMapping("insertHouse")
    @ResponseBody
    public void insertHouse(HouseBean houseBean){
        houseService.insertHouse(houseBean);
    }
}
