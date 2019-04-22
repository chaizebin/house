package com.jk.model;

public class ContractBean {
    private Integer id;
    private String leaser;
    private String tenant;
    private String idnumber;
    private String contactaddress;
    private Integer contactnumber;
    private Integer rent;
    private Integer cash;
    private String begindate;
    private String enddate;
    private String housebelocated;
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaser() {
        return leaser;
    }

    public void setLeaser(String leaser) {
        this.leaser = leaser;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public Integer getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(Integer contactnumber) {
        this.contactnumber = contactnumber;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getHousebelocated() {
        return housebelocated;
    }

    public void setHousebelocated(String housebelocated) {
        this.housebelocated = housebelocated;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ContractBean{" +
                "id=" + id +
                ", leaser='" + leaser + '\'' +
                ", tenant='" + tenant + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", contactaddress='" + contactaddress + '\'' +
                ", contactnumber=" + contactnumber +
                ", rent=" + rent +
                ", cash=" + cash +
                ", begindate='" + begindate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", housebelocated='" + housebelocated + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
