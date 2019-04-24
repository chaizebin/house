package com.jk.model;

public class LookingRoom {

    private Integer id;
    private String url; //房间图片
    private String type; //房间类型
    private String distance; //房间距离地铁站距离
    private String coveredArea;//建筑面积
    private String floor; //楼层
    private String orientation;//朝向
    private Integer price;      //每月xx钱

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LookingRoom{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", distance='" + distance + '\'' +
                ", coveredArea='" + coveredArea + '\'' +
                ", floor='" + floor + '\'' +
                ", orientation='" + orientation + '\'' +
                ", price=" + price +
                '}';
    }
}
