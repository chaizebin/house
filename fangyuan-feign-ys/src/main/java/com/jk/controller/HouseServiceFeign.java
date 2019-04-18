package com.jk.controller;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 19:50
 * @Author: 任豪杰
 * @Description:
 */
@FeignClient("springcloud-server")
public interface HouseServiceFeign {

    @GetMapping("selArea/{pid}")
    List<HouseAreaBean> selArea(@PathVariable("pid") Integer pid);

    @RequestMapping("insertHouse")
    void insertHouse(@RequestBody HouseBean houseBean);

    @GetMapping("huxing")
    List<HouseTypeBean> huxing();

    @GetMapping("chaoxiang")
    List<HouseOrientationBean> chaoxiang();

    @GetMapping("selSubway/{pid}")
    List<HouseSubwayBean> selSubway(@PathVariable("pid") Integer pid);

    @GetMapping("updHouseInfoById/{id}")
    HouseBean updHouseInfoById(Integer id);
}
