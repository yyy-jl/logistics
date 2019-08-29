package com.entity;

public class Arrive {
    private String goodsRevertCode;
    private  String driverName;
    private  String checkGoodsRecord;
    private  String receiveGoodsPerson;
    private  String receiveGoodsDate;

    public Arrive() {
    }

    public Arrive(String goodsRevertCode, String driverName, String checkGoodsRecord, String receiveGoodsPerson, String receiveGoodsDate) {
        this.goodsRevertCode = goodsRevertCode;
        this.driverName = driverName;
        this.checkGoodsRecord = checkGoodsRecord;
        this.receiveGoodsPerson = receiveGoodsPerson;
        this.receiveGoodsDate = receiveGoodsDate;
    }

    public String getGoodsRevertCode() {
        return goodsRevertCode;
    }

    public void setGoodsRevertCode(String goodsRevertCode) {
        this.goodsRevertCode = goodsRevertCode;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCheckGoodsRecord() {
        return checkGoodsRecord;
    }

    public void setCheckGoodsRecord(String checkGoodsRecord) {
        this.checkGoodsRecord = checkGoodsRecord;
    }

    public String getReceiveGoodsPerson() {
        return receiveGoodsPerson;
    }

    public void setReceiveGoodsPerson(String receiveGoodsPerson) {
        this.receiveGoodsPerson = receiveGoodsPerson;
    }

    public String getReceiveGoodsDate() {
        return receiveGoodsDate;
    }

    public void setReceiveGoodsDate(String receiveGoodsDate) {
        this.receiveGoodsDate = receiveGoodsDate;
    }
}
