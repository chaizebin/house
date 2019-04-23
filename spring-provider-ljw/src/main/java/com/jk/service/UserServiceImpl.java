package com.jk.service;


import com.jk.mapper.UserMapper;
import com.jk.model.ImgBean;
import com.jk.model.RoommatesBean;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean phoneVerification(String userphone) {
        return userMapper.phoneVerification(userphone);
    }

    @Override
    public List<RoommatesBean> queryHouseyuezu() {
        return userMapper.queryHouseyuezu();    }

    @Override
    public void addimg(ImgBean imgBean) {
        userMapper.addimg(imgBean);
    }

    @Override
    public List<UserBean> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public void insUserList(UserBean userBean) {
        if(userBean.getUserid() == null){
            userMapper.insUserList(userBean);
        }else{
            userMapper.updateUserList(userBean);
        }

    }

    @Override
    public void deleteGood(Integer userid) {
        userMapper.deleteGood(userid);
    }

    @Override
    public UserBean queryUserById(Integer userid) {
        return userMapper.queryUserById(userid);
    }
}
