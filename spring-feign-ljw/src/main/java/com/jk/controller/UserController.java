package com.jk.controller;

import com.jk.ConstantConf;


import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import com.jk.service.UserService;

import com.jk.utils.HttpClientUtil;
import com.jk.utils.Md5Util;
import com.jk.utils.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("user")
public class UserController {


    @Resource
    private RedisTemplate<String,Object> redisTemplate;


    //短信验证
    @RequestMapping("duanxinyanzheng")
    @ResponseBody
    public String duanxinyanzheng(String userphone,HttpServletRequest request) {

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("accountSid", ConstantConf.STRINGW);
        hashMap.put("to", userphone);
        String format = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        hashMap.put("timestamp", format);
        String md532 = Md5Util.getMd532(ConstantConf.STRINGW+ConstantConf.STRINGE+format);
        hashMap.put("sig", md532);
        hashMap.put("templateid", ConstantConf.STRINGT);
        Object object = redisTemplate.opsForValue().get(ConstantConf.STRINGDXYZ+"Verification");
        if (object!=null) {
            return "sss";
        }
        double random = Math.random();
        int Verification = (int)((random*9+1)*100000);
        HttpSession session = request.getSession();
        session.setAttribute("Verification", Verification);
        redisTemplate.opsForValue().set(ConstantConf.STRINGDXYZ+"Verification", Verification, ConstantConf.INTEGERDXYZTIME, TimeUnit.SECONDS);
		hashMap.put("param", Verification);
		String post = HttpClientUtil.post(ConstantConf.STRINGR, hashMap);
        String  va = "";
        va+=Verification;
        System.out.println(va);
        return va;
    }

    @Autowired
    private UserService userservice;
    //手机验证码
    @RequestMapping("phoneVerification")
    @ResponseBody
    public Integer phoneVerification(String userphone,String Verification ,HttpServletRequest request) {
        System.out.println(userphone);
        System.out.println(Verification);
        HttpSession session = request.getSession();
        String attribute = session.getAttribute("Verification").toString();
        System.out.println(attribute);
        //String attribute = redisTemplate.opsForValue().get(ConstantConf.STRINGDXYZ+"Verification").toString();
        if (!attribute.equals(Verification)) {
            return 2;//验证码不正确
        }
        UserBean userBean  =  userservice.phoneVerification(userphone);
        if (userBean==null) {
            return 1;//此手机号未注册
        }

        session.setAttribute(session.getId(), userBean);
        return 0;
    }

    //初始化名称展示
    @RequestMapping("inituserphone")
    @ResponseBody
    public String initusername(HttpServletRequest request){
        HttpSession session = request.getSession();
        UserBean userBean = (UserBean) session.getAttribute(session.getId());
        return userBean.getUserphone();
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
    public void addimg(ImgBean imgBean){
        userservice.addimg(imgBean);
    }


    /**
     * OSS阿里云上传图片
     */
    @RequestMapping("updaloadImg")
    @ResponseBody
    public String uploadImg(MultipartFile imgg)throws IOException {
        if (imgg == null || imgg.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgg);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        //System.out.println(split[0]);
        return split[0];
    }

}
