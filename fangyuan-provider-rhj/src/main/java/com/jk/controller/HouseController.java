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
public class HouseController {

    @Autowired
    private HouseService houseService;

   //查询
    @GetMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(Integer page , Integer rows){
        System.out.println(page+"--"+rows);
        return houseService.selectHousePage(page,rows);
    }


    //修改回显
/*    @GetMapping("updHouseInfoById/{id}")
    @ResponseBody
    public HouseBean updHouseInfoById(@PathVariable("id") Integer id){
        return houseService.updHouseInfoById(id);
    }*/

    //修改回显
    @RequestMapping("updHouseInfoById")
    @ResponseBody
    public HouseBean updHouseInfoById(@RequestBody Integer id){
        System.out.println(id);
        return houseService.updHouseInfoById(id);
    }

    //地铁线路
    @GetMapping("selSubway/{pid}")
    @ResponseBody
    public List<HouseSubwayBean> selSubway(@PathVariable("pid") Integer pid){
        return houseService.selSubway(pid);
    }

    //朝向
    @GetMapping("chaoxiang")
    @ResponseBody
    public List<HouseOrientationBean> chaoxiang(){
        return houseService.chaoxiang();
    }

    //户型
    @GetMapping("huxing")
    @ResponseBody
    public List<HouseTypeBean> huxing(){
        return houseService.huxing();
    }

    //区域
    @GetMapping("selArea/{pid}")
    @ResponseBody
    public List<HouseAreaBean> selArea(@PathVariable("pid") Integer pid){
        return houseService.selArea(pid);
    }

    //新增
    @RequestMapping("insertHouse")
    @ResponseBody
    public void insertHouse(@RequestBody HouseBean houseBean){
        if(houseBean.getId() == null){
            houseService.insertHouse(houseBean);
        }else{
            houseService.updateHouse(houseBean);
        }
    }
}
