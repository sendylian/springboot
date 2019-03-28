package com.sendy.springboot;

import java.util.Date;

public class UserDesignWare {
    private Integer id;

    private Integer wareInfoId;

    private Integer userId;

    private Date addTime;

    private String wareUrl;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWareInfoId() {
        return wareInfoId;
    }

    public void setWareInfoId(Integer wareInfoId) {
        this.wareInfoId = wareInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getWareUrl() {
        return wareUrl;
    }

    public void setWareUrl(String wareUrl) {
        this.wareUrl = wareUrl == null ? null : wareUrl.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}