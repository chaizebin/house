package com.jk.model;


/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:38
 * @Author: 袁硕
 * @Description:
 */
public class HouseSubwayBean {
    private Integer id;
    private String subwayName;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubwayName() {
        return subwayName;
    }

    public void setSubwayName(String subwayName) {
        this.subwayName = subwayName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "HouseSubwayBean{" +
                "id=" + id +
                ", subwayName='" + subwayName + '\'' +
                ", pid=" + pid +
                '}';
    }
}
