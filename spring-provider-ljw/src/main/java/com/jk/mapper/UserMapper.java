package com.jk.mapper;

import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select(" SELECT * FROM house_user t where t.userphone = #{value} ")
    UserBean phoneVerification(String userphone);


    @Select(" SELECT a.id,b.url,a.price,a.type,a.distance from house_house a LEFT JOIN house_img b on a.houseId=b.houseId")
    List<RoommatesBean> queryHouseyuezu();

    @Insert("insert into house_img(url,imgName) values(#{url},#{imgName})")
    void addimg(ImgBean imgBean);
}
