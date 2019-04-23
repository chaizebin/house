package com.jk.mapper;


import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {

    void savecontract(ContractBean contractBean);

    ContractBean selectcontractId(Integer id);

    void updatecontract(ContractBean contractBean);

    List<ContractBean> downProductlById(@Param("id")String id);

    int Concount(ContractBean contractBean);

    List<ContractBean> finquery(@Param("start")int start,@Param("rows")Integer rows,@Param("contractBean")ContractBean contractBean);

    void delContract(Integer id);

    List<FyBean> queryHousingInformation();

}
