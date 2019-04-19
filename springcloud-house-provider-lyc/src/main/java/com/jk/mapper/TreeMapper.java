package com.jk.mapper;

import com.jk.model.TreeBean;

import java.util.List;

public interface TreeMapper {

    List<TreeBean> findTreeByPid(int pid);
}
