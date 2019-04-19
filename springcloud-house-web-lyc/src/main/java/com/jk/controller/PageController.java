package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
