package com.jk.mapper;

import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select(" SELECT * FROM house_user t where t.userphone = #{value} ")
    UserBean phoneVerification(String userphone);


    @Select(" SELECT a.id,b.url,a.price,a.type,a.distance from house_house a LEFT JOIN house_img b on a.houseId=b.houseId")
    List<RoommatesBean> queryHouseyuezu();

    @Insert("insert into house_img(url,imgName) values(#{url},#{imgName})")
    void addimg(ImgBean imgBean);

    @Select("select * from house_user")
    List<UserBean> queryUserList();

    @Insert("insert into house_user(username,userphone,userpassword,userstate) values(#{username},#{userphone},#{userpassword},#{userstate})")
    void insUserList(UserBean userBean);

    @Delete("delete from house_user where userid=#{value}")
    void deleteGood(Integer userid);

    @Select("select * from house_user where userid=#{userid}")
    UserBean queryUserById(Integer userid);

    @Update("update house_user set username=#{username},userphone=#{userphone},userpassword=#{userpassword},userstate=#{userstate} where userid=#{userid}")
    void updateUserList(UserBean userBean);

}
