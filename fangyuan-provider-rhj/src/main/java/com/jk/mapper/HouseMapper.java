package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 19:51
 * @Author: 任豪杰
 * @Description:
 */
public interface HouseMapper {

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

    @Insert("insert into house_house (houseNumber,coveredArea,price,houseType,orientation,subway,station,province,city,bigCity,housing,meter,floor)\n" +
            " values(#{houseNumber},#{coveredArea},#{price},#{houseType},#{orientation},#{subway},#{station},#{province},#{city},#{bigCity},#{housing},#{meter},#{floor})")
    void insertHouse(HouseBean houseBean);

    @Select("select count(*) from house_house")
    long queryHouseTotal();

    @Select("select\n" +
            "      t.id,\n" +
            "      t.houseId,\n" +
            "      t.houseNumber,\n" +
            "      t.coveredArea,\n" +
            "      t.price,\n" +
            "      hi.url,\n" +
            "      t.floor,\n" +
            "      t.distance,\n" +
            "      t.meter,\n" +
            "      t.housing,\n" +
            "      tt.name as typeName,\n" +
            "      ho.name as orientationName,\n" +
            "      sb.subwayName as subwayName,\n" +
            "      sb1.subwayName as stationName,\n" +
            "      ta1.name as provinceName,\n" +
            "      ta2.name as cityName,\n" +
            "      ta3.name as bigCityName,\n" +
            "      lb.name as lableName\n" +
            "          from house_house t\n" +
            "              left join house_img hi on t.houseId = hi.houseId\n" +
            "              left join house_subway sb on t.subway = sb.id\n" +
            "              left join house_subway sb1 on t.station = sb1.id\n" +
            "              left join house_type tt on t.houseType=tt.id\n" +
            "              left join house_area ta1 on t.province=ta1.id\n" +
            "              left join house_area ta2 on t.city=ta2.id\n" +
            "              left join house_area ta3 on t.bigCity=ta3.id\n" +
            "              left join house_orientation ho on t.orientation=ho.id\n" +
            "              left join house_label lb on t.lable=lb.id\n" +
            "           limit  #{start},#{rows}")
    List<HouseBean> selectHouseList(@Param("start") Integer page, @Param("rows") Integer rows);

}
