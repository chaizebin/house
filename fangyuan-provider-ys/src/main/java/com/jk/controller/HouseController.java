package com.jk.controller;

import com.jk.model.*;
import com.jk.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:17
 * @Author: 袁硕
 * @Description:
 */
@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     *
     * @return
     */
    @GetMapping("selectHouse")
    @ResponseBody
    public List<HouseBean> selectHouse(HouseBean houseBean){

        return houseService.selectHouse(houseBean);
    }

    /*
    查询分页
     */
    @PostMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(@RequestParam("page") Integer page ,@RequestParam("rows") Integer rows,@RequestBody HouseBean houseBean){
        System.out.println(page+"--"+rows+houseBean);
        return houseService.selectHousePage(page,rows,houseBean);
    }


    /*
    单删
     */
    @DeleteMapping("deleteHouseById")
    @ResponseBody
    public void deleteHouseById( Integer id){
        System.out.println(id);
        houseService.deleteHouseById(id);
    }


    /*
    批删
     */
    @DeleteMapping("delAllHouse")
    @ResponseBody
    public void delAllHouse(String ss){
        System.out.println(ss+"------------------");
        houseService.delAllHouse(ss);
    }


    /*
    修改回显
     */
    @GetMapping("selectHouseById")
    @ResponseBody
    public HouseBean selectHouseById(Integer id){
        System.out.println(id);
        return  houseService.selectHouseById(id);
    }














}
