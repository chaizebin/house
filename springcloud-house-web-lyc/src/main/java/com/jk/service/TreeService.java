package com.jk.service;

import com.jk.model.CheckTheDetails;
import com.jk.model.LookingRoom;
import com.jk.model.RoommatesBean;
import com.jk.model.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("springcloud-house-provider")
public interface TreeService {

    @GetMapping("findTree")
    List<TreeBean> findTree();

    @GetMapping("queryHousingInformation")
    List<RoommatesBean> queryHousingInformation();

    @GetMapping("CheckTheDetails")
    List<CheckTheDetails> CheckTheDetails(@RequestParam(value = "id")int id);

    @GetMapping("LookingRoom")
    List<LookingRoom> LookingRoom();


}
