package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    @GetMapping("findTree")
    @ResponseBody
    public List<TreeBean> findTree(){
        return treeService.findTree();
    }

}
