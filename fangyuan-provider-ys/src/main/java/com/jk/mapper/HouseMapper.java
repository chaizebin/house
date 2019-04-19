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






    @Insert("insert into house_house (houseNumber,coveredArea,houseType,orientation,subway,station,province,city)\n" +
            " values(#{houseNumber},#{coveredArea},#{houseType},#{orientation},#{subway},#{station},#{province},#{city})")
    void insertHouse(HouseBean houseBean);
    @Select("select * from house_area where pid = #{value}")
    List<HouseAreaBean> selArea(Integer pid);

    @Select("select * from house_type")
    List<HouseTypeBean> huxing();

    @Select("select * from house_orientation")
    List<HouseOrientationBean> chaoxiang();

    @Select("select * from house_subway where pid = #{value}")
    List<HouseSubwayBean> selSubway(Integer pid);

    @Select("select * from house_house where id=#{id}")
    HouseBean updHouseInfoById(Integer id);

    @Update("update house_house set houseNumber=#{houseNumber},coveredArea=#{coveredArea},houseType=#{houseType},orientation=#{orientation},subway=#{subway},station=#{station},province=#{province},city=#{city} where id=#{id}")
    void updateHouse(HouseBean houseBean);
}
