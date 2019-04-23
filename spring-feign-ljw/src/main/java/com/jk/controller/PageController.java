package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-Cloud
 * @Date: 2019/4/10 23:02
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("todenglu")
    public String todenglu(){
     return "dengluyemian";
    }

    @RequestMapping("gerenzhongxin")
    public String gerenzhongxin(){
        return "gerenzhongxin";
    }

    @RequestMapping("toyuezufangzi")
    public String toyuezufangzi(){
        return "yuezufangzi";
    }

    @RequestMapping("addimgyemian")
    public String addimgyemian(){
        return "addimg";
    }

    @RequestMapping("tolist")
    public String tolist(){
        return "imglist";
    }

}
