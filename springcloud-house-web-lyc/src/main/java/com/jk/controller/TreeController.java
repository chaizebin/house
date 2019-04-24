package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.CheckTheDetails;
import com.jk.model.LookingRoom;
import com.jk.model.RoommatesBean;
import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("goto")
public class TreeController {
     @Autowired
    private TreeService treeService;

     @Resource
     private RedisTemplate<String,Object> redisTemplate;

     @Resource
     private MongoTemplate mongoTemplate;

     @GetMapping("findTree")
     @ResponseBody
     public List<TreeBean> findTree(){
         System.out.println("***********");
         String cakeys ="tree";  //redis库中创建的表名
         String listValue=(String)redisTemplate.opsForValue().get(cakeys);
         List<TreeBean> list=new ArrayList<TreeBean>();
         if(!StringUtils.isEmpty(listValue)) { //if  listValue非空
             System.out.println("走缓存啦");
             list=(List) JSON.parseArray(listValue);

         }else{
             //没有数据从mysql库中查找
             list = treeService.findTree();
             //list= redisTemplate.getForObject("http://springcloud-user-reg/commodtiy/queryCommodList",List.class);
             System.out.println(list+"走数据库");
             String   jsonString= JSON.toJSONString(list);
             redisTemplate.opsForValue().set(cakeys,jsonString,5, TimeUnit.MINUTES);
         }
         return list;
     }
     //合租
    @GetMapping("queryHousingInformation")
    @ResponseBody
    public List<RoommatesBean> queryHousingInformation(){
        System.out.println("11111111111111111111");
        return treeService.queryHousingInformation();
    }
    //查看详情
    @GetMapping("CheckTheDetails")
    @ResponseBody
    public List<CheckTheDetails> CheckTheDetails(){
        System.out.println("-------------------------------");
        return treeService.CheckTheDetails();
    }

    //收藏
    @PostMapping("Collection")
    @ResponseBody
    public void Collection(CheckTheDetails checkTheDetails){
        mongoTemplate.save(checkTheDetails,"checkTheDetails");
    }
    //找房
    @GetMapping("LookingRoom")
    @ResponseBody
    public List<LookingRoom> LookingRoom(){
        System.out.println("++++++++++++++++++++++++++");
        return treeService.LookingRoom();
    }
}
