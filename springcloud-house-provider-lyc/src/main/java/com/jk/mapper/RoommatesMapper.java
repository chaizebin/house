package com.jk.mapper;

import com.jk.model.CheckTheDetails;
import com.jk.model.LookingRoom;
import com.jk.model.RoommatesBean;

import java.util.List;

public interface RoommatesMapper {

    List<RoommatesBean> queryHousingInformation();

    List<CheckTheDetails> CheckTheDetails(int id);

    List<LookingRoom> LookingRoom();
}
