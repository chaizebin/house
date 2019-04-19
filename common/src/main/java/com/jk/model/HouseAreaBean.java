package com.jk.model;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 12:38
 * @Author: 任豪杰
 * @Description:
 */
public class HouseAreaBean {
    private Integer id;
    private  String name;
    private  Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "HouseAreaBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                '}';
    }
}
