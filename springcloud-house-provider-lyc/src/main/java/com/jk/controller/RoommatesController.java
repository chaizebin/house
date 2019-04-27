package com.jk.controller;

import com.jk.model.CheckTheDetails;
import com.jk.model.LookingRoom;
import com.jk.model.RoommatesBean;
import com.jk.service.RoommatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RoommatesController {

    @Autowired
    private RoommatesService roommatesService;
    //合租
    @GetMapping("queryHousingInformation")
    @ResponseBody
    public List<RoommatesBean> queryHousingInformation(){
        return roommatesService.queryHousingInformation();
    }
    //查看详情
    @GetMapping("CheckTheDetails")
    @ResponseBody
    public List<CheckTheDetails> CheckTheDetails(@RequestParam(value = "id") int id){
       /* int id=(int) session.getAttribute("id");*/
        List<CheckTheDetails> list=roommatesService.CheckTheDetails(id);
        return list;
    }
    //找房
    @GetMapping("LookingRoom")
    @ResponseBody
    public List<LookingRoom> LookingRoom(){
        return roommatesService.LookingRoom();
    }
}
