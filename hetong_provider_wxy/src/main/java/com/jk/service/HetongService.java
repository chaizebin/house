package com.jk.service;

import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

public interface HetongService {



    void savecontract(ContractBean contractBean);

    ContractBean selectcontractId(Integer id);

    void updatecontract(ContractBean contractBean);

    HashMap<String, Object> queyrContract(Integer page, Integer rows, ContractBean contractBean);

    List<ContractBean> downProductlById();

    void delContract(Integer id);

    List<FyBean> queryHousingInformation();
}
