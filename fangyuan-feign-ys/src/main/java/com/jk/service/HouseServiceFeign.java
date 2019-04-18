package com.jk.service;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:46
 * @Author: 袁硕
 * @Description:
 */
@FeignClient("house-provider")
public interface HouseServiceFeign {

    @GetMapping("selectHousePage")
    Map<String, Object> selectHousePage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @DeleteMapping("deleteHouseById")
    void deleteHouseById(@RequestParam("id") Integer id);

    @DeleteMapping("delAllHouse")
    void delAllHouse(@RequestParam("ss") String ss);

    @GetMapping("selectHouseById")
    HouseBean selectHouseById(@RequestParam("id") Integer id);

    @PutMapping("updateHouse")
    void updateHouse(HouseBean houseBean);



    HouseBean updHouseInfoById(Integer id);

    List<HouseSubwayBean> selSubway(Integer pid);

    List<HouseOrientationBean> chaoxiang();

    List<HouseTypeBean> huxing();

    List<HouseAreaBean> selArea(Integer pid);

    void insertHouse(HouseBean houseBean);
}
