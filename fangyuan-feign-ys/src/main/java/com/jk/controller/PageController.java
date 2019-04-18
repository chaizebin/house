package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:41
 * @Author: 袁硕
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toList")
    public String toList(){
        return "list";
    }
}
