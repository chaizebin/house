package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 11:18
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("zhaofang")
    public String zhaofang(){
        return "zhaofang";
    }

    @RequestMapping("updHouse")
    public String updHouse(){
        return "updHouse";
    }

    @RequestMapping("selHouse")
    public String selHouse(){
        return "house";
    }

    @RequestMapping("addHouse")
    public String addHouse(){
        return "addHouse";
    }
}
