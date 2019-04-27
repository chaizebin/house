package com.jk.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="1809_house")
public class RoommatesBean {

    private Integer id;
    private String url; //房间图片
    private String type; //房间类型
    private String price; //房间价格
    private String distance; //房间距离地铁站距离

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RoommatesBean{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
