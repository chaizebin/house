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
    private Integer houseNumber;//房屋编号
    private String coveredArea;//房屋建筑面积
    private String houseType;//户型
    private String typeName;
    private String orientation;//朝向
    private String orientationName;
    private String region;//区域
    private String subway;//地铁
    private String station;

    private Integer bigCity;//大城市
    private String bigCityName;

    private Integer city;//市
    private String cityName;

    private String provinceName;
    private Integer province;//省

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

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getOrientationName() {
        return orientationName;
    }

    public void setOrientationName(String orientationName) {
        this.orientationName = orientationName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
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
                ", houseNumber=" + houseNumber +
                ", coveredArea='" + coveredArea + '\'' +
                ", houseType='" + houseType + '\'' +
                ", typeName='" + typeName + '\'' +
                ", orientation='" + orientation + '\'' +
                ", orientationName='" + orientationName + '\'' +
                ", region='" + region + '\'' +
                ", subway='" + subway + '\'' +
                ", station='" + station + '\'' +
                ", bigCity=" + bigCity +
                ", bigCityName='" + bigCityName + '\'' +
                ", city=" + city +
                ", cityName='" + cityName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", province=" + province +
                '}';
    }
}
