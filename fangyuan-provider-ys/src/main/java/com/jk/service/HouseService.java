package com.jk.service;

import com.jk.model.*;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:19
 * @Author: 袁硕
 * @Description:
 */
public interface HouseService {

    Map<String, Object> selectHousePage(Integer page, Integer rows);

    void deleteHouseById(Integer id);

    void delAllHouse(String ss);

    HouseBean selectHouseById(Integer id);





    void insertHouse(HouseBean houseBean);

    List<HouseAreaBean> selArea(Integer pid);

    List<HouseTypeBean> huxing();

    List<HouseOrientationBean> chaoxiang();

    List<HouseSubwayBean> selSubway(Integer pid);

    HouseBean updHouseInfoById(Integer id);

    void updateHouse(HouseBean houseBean);
}
