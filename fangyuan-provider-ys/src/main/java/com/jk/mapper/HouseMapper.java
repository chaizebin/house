package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:22
 * @Author: 袁硕
 * @Description:
 */
public interface HouseMapper {
    long queryHouseTotal();

    List<HouseBean> selectHouseList(@Param("start") Integer page, @Param("rows") Integer rows);

    void deleteHouseById(@Param("id") Integer id);

    void delAllHouse(String[] ids);

    HouseBean selectHouseById(@Param("id") Integer id);







}
