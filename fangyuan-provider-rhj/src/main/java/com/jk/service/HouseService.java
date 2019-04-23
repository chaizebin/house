package com.jk.service;

import com.jk.model.*;

import java.util.List;
import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 19:51
 * @Author: 任豪杰
 * @Description:
 */
public interface HouseService {

    void insertHouse(HouseBean houseBean);

    List<HouseAreaBean> selArea(Integer pid);

    List<HouseTypeBean> huxing();

    List<HouseOrientationBean> chaoxiang();

    List<HouseSubwayBean> selSubway(Integer pid);

    HouseBean updHouseInfoById(Integer id);

    void updateHouse(HouseBean houseBean);

    Map<String, Object> selectHousePage(Integer page, Integer rows);

}
