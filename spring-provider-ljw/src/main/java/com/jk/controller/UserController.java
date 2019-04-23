package com.jk.controller;

import com.jk.ConstantConf;
import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
//@RequestMapping("user")
public class UserController {


    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    //短信验证
    @RequestMapping("duanxinyanzheng")
    @ResponseBody
    public String duanxinyanzheng(String userphone,HttpServletRequest request) {

        Object object = redisTemplate.opsForValue().get(ConstantConf.STRINGDXYZ+"Verification");
        if (object!=null) {
            return "sss";
        }
        double random = Math.random();
        int Verification = (int)((random*9+1)*100000);

        redisTemplate.opsForValue().set(ConstantConf.STRINGDXYZ+"Verification", Verification, ConstantConf.INTEGERDXYZTIME, TimeUnit.SECONDS);

        String  va = "";
        va+=Verification;
        System.out.println(va);
        return va;
    }

    @Autowired
    private UserService userservice;
    //手机验证码
    @RequestMapping("phoneVerification/{userphone}")
    @ResponseBody
    public UserBean phoneVerification(@RequestParam("userphone")String userphone) {
        UserBean userBean  =  userservice.phoneVerification(userphone);
        return userBean;
    }

    //房屋展示
    @GetMapping("queryHouseyuezu")
    @ResponseBody
    public List<RoommatesBean> queryHouseyuezu(){
        List<RoommatesBean> list = userservice.queryHouseyuezu();
        return list;
    }

    @PostMapping("addimg")
    @ResponseBody
    public void addimg(@RequestBody ImgBean imgBean){
        userservice.addimg(imgBean);
    }


}
