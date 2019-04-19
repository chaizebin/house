package com.jk.service;

import com.jk.model.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("springcloud-house-provider")
public interface TreeService {

    @GetMapping("findTree")
    List<TreeBean> findTree();

}
