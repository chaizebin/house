package com.jk.service;

import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@FeignClient(value = "service-customer")
public interface HetongService {


    @RequestMapping ("savecontract")
    void savecontract(ContractBean contractBean);
    @RequestMapping ("selectcontractId")
    ContractBean selectcontractId(Integer id);
    @RequestMapping ("deletecontract")
    void deletecontract(Integer id);
    @DeleteMapping("deleteSite/{id}")
    String delCommodity(Integer id);

    @RequestMapping ("downProductlById")
    List<ContractBean> downProductlById();
    @PostMapping("queyrContract")
    HashMap<String, Object> queyrContract(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestBody ContractBean contractBean);
    @RequestMapping ("delContract")
    void delContract(@RequestBody Integer id);
    @RequestMapping ("queryHousingInformation")
    List<FyBean> queryHousingInformation();
}
