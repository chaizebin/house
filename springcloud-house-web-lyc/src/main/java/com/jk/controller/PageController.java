package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("queryTree")
    public String queryTree(){
        return "selectTree";
    }

    @RequestMapping("toAddGoods")
    public String toAddGoods(){
        return "addGood";
    }
    //跳支付宝页面
    @RequestMapping("toZhiFuBao")
    public String toZhiFuBao(){
        return "zhifubao";
    }
    @RequestMapping("map")
    public String map(){
        return "map";
    }
    //合租
    @RequestMapping("roommates")
    public String roommates(){
        return "roommates";
    }
    //查看房屋详情
    @RequestMapping("CheckTheDetails")
    public String CheckTheDetails(Integer id, HttpSession session){
        session.setAttribute("id",id);
        return "checkTheDetails";
    }
    //找房
    @RequestMapping("LookingRoom")
    public String LookingRoom(){
        return "lookingRoom";
    }
    //首页
    @RequestMapping("homePage")
    public String homePage(){
        return "homePage";
    }
}
