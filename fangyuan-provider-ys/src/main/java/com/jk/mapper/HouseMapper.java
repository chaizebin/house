package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:22
 * @Author: 袁硕
 * @Description:
 */
public interface HouseMapper {
    long queryHouseTotal(@Param("houseBean") HouseBean houseBean);

    List<HouseBean> selectHouseList(@Param("start") Integer page, @Param("rows") Integer rows,@Param("houseBean") HouseBean houseBean);

    void deleteHouseById(@Param("id") Integer id);

    void delAllHouse(String[] ids);

    HouseBean selectHouseById(@Param("id") Integer id);

    List<HouseBean> selectHouse(HouseBean houseBean);
}
