package com.jk.service;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 19:50
 * @Author: 任豪杰
 * @Description:
 */
@FeignClient("house-provider")
public interface HouseService {

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

    @RequestMapping("updHouseInfoById")
    HouseBean updHouseInfoById(@RequestBody Integer id);

    @GetMapping("selectHousePage")
    Map<String, Object> selectHousePage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

}
