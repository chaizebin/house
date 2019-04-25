package com.jk.model;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 16:01
 * @Author: 袁硕
 * @Description:
 */
public class HouseBean {
    private Integer id;//房屋id
    private Integer houseId;//房id
    private String houseNumber;//房屋编号
    private String coveredArea;//房屋建筑面积
    private Integer price; //月租金
    private String floor;
    private String distance;//米
    private String housing;//小区

    private Integer startprice;
    private Integer endprice;

    private String url;

    private Integer houseType;//户型
    private String typeName;

    private Integer orientation;//朝向
    private String orientationName;

    private Integer subway;//地铁
    private String subwayName;

    private Integer station;//站点
    private String stationName;

    private Integer bigCity;
    private String bigCityName;

    private Integer city;//市
    private String cityName;

    private String provinceName;
    private Integer province;//省

    public Integer getStartprice() {
        return startprice;
    }

    public void setStartprice(Integer startprice) {
        this.startprice = startprice;
    }

    public Integer getEndprice() {
        return endprice;
    }

    public void setEndprice(Integer endprice) {
        this.endprice = endprice;
    }

    public String getDistance() {
        return distance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }



    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    public String getOrientationName() {
        return orientationName;
    }

    public void setOrientationName(String orientationName) {
        this.orientationName = orientationName;
    }

    public Integer getSubway() {
        return subway;
    }

    public void setSubway(Integer subway) {
        this.subway = subway;
    }

    public String getSubwayName() {
        return subwayName;
    }

    public void setSubwayName(String subwayName) {
        this.subwayName = subwayName;
    }

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getBigCity() {
        return bigCity;
    }

    public void setBigCity(Integer bigCity) {
        this.bigCity = bigCity;
    }

    public String getBigCityName() {
        return bigCityName;
    }

    public void setBigCityName(String bigCityName) {
        this.bigCityName = bigCityName;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "HouseBean{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", houseNumber='" + houseNumber + '\'' +
                ", coveredArea='" + coveredArea + '\'' +
                ", price=" + price +
                ", floor='" + floor + '\'' +
                ", distance='" + distance + '\'' +
                ", housing='" + housing + '\'' +
                ", url='" + url + '\'' +
                ", houseType=" + houseType +
                ", typeName='" + typeName + '\'' +
                ", orientation=" + orientation +
                ", orientationName='" + orientationName + '\'' +
                ", subway=" + subway +
                ", subwayName='" + subwayName + '\'' +
                ", station=" + station +
                ", stationName='" + stationName + '\'' +
                ", bigCity=" + bigCity +
                ", bigCityName='" + bigCityName + '\'' +
                ", city=" + city +
                ", cityName='" + cityName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", province=" + province +
                '}';
    }
}
