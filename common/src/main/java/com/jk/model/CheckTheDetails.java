package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

public class CheckTheDetails {
    private Integer id;
    private String  type;     //户型信息
    private String theSubway;    //蓝小区域信息
    private String name;         //标签name
    private Integer price;      //每月xx钱
    private String coveredArea;//建筑面积
    private String houseNumber; //编号
    private String houseType;//户型
    private String orientation;//朝向
    private String floor; //楼层
    private String distance;//距离

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheSubway() {
        return theSubway;
    }

    public void setTheSubway(String theSubway) {
        this.theSubway = theSubway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "CheckTheDetails{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", theSubway='" + theSubway + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", coveredArea='" + coveredArea + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", houseType='" + houseType + '\'' +
                ", orientation='" + orientation + '\'' +
                ", floor='" + floor + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
