package com.jk.model;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 16:57
 * @Author: 任豪杰
 * @Description:
 */
public class HouseOrientationBean {
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
        return "HouseOrientationBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
