package com.jk.service;

import com.jk.model.ContractBean;
import com.jk.model.FyBean;

import java.util.HashMap;
import java.util.List;

public interface HetongService {



    void savecontract(ContractBean contractBean);

    ContractBean selectcontractId(Integer id);

    void updatecontract(ContractBean contractBean);

    HashMap<String, Object> queyrContract(Integer page, Integer rows, ContractBean contractBean);

    List<ContractBean> downProductlById(Integer id);

    void delContract(Integer id);

    List<FyBean> queryHousingInformation();
}
