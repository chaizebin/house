package com.jk.service;

import com.jk.mapper.RoommatesMapper;
import com.jk.model.CheckTheDetails;
import com.jk.model.LookingRoom;
import com.jk.model.RoommatesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoommatesServiceImpl implements RoommatesService{
    @Autowired
    private RoommatesMapper roommatesMapper;

    @Override
    public List<RoommatesBean> queryHousingInformation() {
        return roommatesMapper.queryHousingInformation();
    }

    @Override
    public List<CheckTheDetails> CheckTheDetails() {
        return roommatesMapper.CheckTheDetails();
    }

    @Override
    public List<LookingRoom> LookingRoom() {
        return roommatesMapper.LookingRoom();
    }
}
