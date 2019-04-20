package com.jk.model;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:37
 * @Author: 袁硕
 * @Description:
 */
public class HouseTypeBean {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "HouseTypeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
