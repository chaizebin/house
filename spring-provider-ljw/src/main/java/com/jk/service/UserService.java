package com.jk.service;

import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;


import java.util.List;


public interface UserService {


    UserBean phoneVerification(String userphone);

    List<RoommatesBean> queryHouseyuezu();

    void addimg(ImgBean imgBean);

    List<UserBean> queryUserList();

    void insUserList(UserBean userBean);

    void deleteGood(Integer userid);

    UserBean queryUserById(Integer userid);

    List<RoommatesBean> queryHouseyuezu2();
}
