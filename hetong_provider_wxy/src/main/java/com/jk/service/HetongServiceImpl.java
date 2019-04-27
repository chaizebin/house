package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.ContractBean;
import com.jk.model.FyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@Service
public class HetongServiceImpl implements HetongService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void savecontract(@RequestBody ContractBean contractBean) {
        userMapper.savecontract(contractBean);
    }

    @Override
    public ContractBean selectcontractId(Integer id) {

        return userMapper.selectcontractId(id);
    }

    @Override
    public void updatecontract(ContractBean contractBean) {
        userMapper.updatecontract(contractBean);
    }



    @Override
    public HashMap<String, Object> queyrContract(Integer page, Integer rows, ContractBean contractBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total =userMapper.Concount(contractBean);
        int start = (page-1)*rows;
        List<ContractBean> list=userMapper.finquery(start,rows,contractBean);
        for(int i=0;list.size()<=0;i++){
            int hah=list.get(i).getRent()+list.get(i).getCash();
            list.get(i).setPrice(hah+"");
        }
        hashMap.put("total", total);
        hashMap.put("rows", list);

        return hashMap;
    }


    @Override
    public List<ContractBean> downProductlById() {

        return userMapper.downProductlById();
    }

    @Override
    public void delContract(Integer id) {
        userMapper.delContract(id);
    }

    @Override
    public List<FyBean> queryHousingInformation() {

        return userMapper.queryHousingInformation();
    }

}
