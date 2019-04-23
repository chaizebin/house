package com.jk.service;

import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient("springcloud-server")
public interface UserService {

    @RequestMapping("phoneVerification/{userphone}")
    @ResponseBody
    UserBean phoneVerification(@RequestParam("userphone")String userphone);

    @GetMapping("queryHouseyuezu")
    List<RoommatesBean> queryHouseyuezu();

    @PostMapping("addimg")
    void addimg(@RequestBody ImgBean imgBean);
}
