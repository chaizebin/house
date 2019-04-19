package com.jk.service;

import com.jk.mapper.TreeMapper;
import com.jk.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService{
    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<TreeBean> findTree() {
        int pid=0;
        List<TreeBean> list=findNodes(pid);
        return list;
    }

    private List<TreeBean> findNodes(int pid) {
        List<TreeBean> list=treeMapper.findTreeByPid(pid);
        for (TreeBean tree : list) {
            Integer id = tree.getId();
            List<TreeBean> nodes = findNodes(id);
            if(nodes.size()<=0){
                tree.setSelectable(true);
            } else {
                tree.setSelectable(false);
                tree.setNodes(nodes);
            }
        }

        return list;
    }
}
