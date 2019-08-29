package com.entity;

import java.util.Date;

/**
 * 货运回执单主表
 */
public class Cargoreceipt {
    private int goodId;//id
    private String goodsRevertBillCode; //货运回执单编号
    private String loadStation;  //装货地点
    private Date startCarryTime; //起运时间
    private String dealGoodsStation;	//交货地点
    private Date arriveTime; //到达时间
    private String receiveGoodsLinkman; //收货联系人
    private String linkmanPhone;  //收获联系人电话
    private String receiveGoodsDetailAddr;	//收货详细地址
    private String carriageBanlanceMode; //运费结算方式
    private String remark; //备注
    private String driverId; //司机编号
    private String ifBalance; //是否结算
    private String backBillState;//回执单状态
    private double startAdvance; //起运预付费用
    private double carryGoodsBillDeposit; //送货单回执押金
    private double carryGoodsInsurance; //承运人订装货物保证金
    private double dispatchServiceFee;//配载服务费
    private double allCarriage; //总运费
    private double insurance; //保险费
    private Date signTime; //签定时间
    private String acceptStation; //接货点
    private String carriageMode ;//运费计价方式

    public Cargoreceipt() {
    }

    public Cargoreceipt(String goodsRevertBillCode, String loadStation, Date startCarryTime, String dealGoodsStation, Date arriveTime, String receiveGoodsLinkman, String linkmanPhone, String receiveGoodsDetailAddr, String carriageBanlanceMode, String remark, String driverId, String ifBalance, String backBillState, double startAdvance, double carryGoodsBillDeposit, double carryGoodsInsurance, double dispatchServiceFee, double allCarriage, double insurance, Date signTime, String acceptStation, String carriageMode) {
        this.goodsRevertBillCode = goodsRevertBillCode;
        this.loadStation = loadStation;
        this.startCarryTime = startCarryTime;
        this.dealGoodsStation = dealGoodsStation;
        this.arriveTime = arriveTime;
        this.receiveGoodsLinkman = receiveGoodsLinkman;
        this.linkmanPhone = linkmanPhone;
        this.receiveGoodsDetailAddr = receiveGoodsDetailAddr;
        this.carriageBanlanceMode = carriageBanlanceMode;
        this.remark = remark;
        this.driverId = driverId;
        this.ifBalance = ifBalance;
        this.backBillState = backBillState;
        this.startAdvance = startAdvance;
        this.carryGoodsBillDeposit = carryGoodsBillDeposit;
        this.carryGoodsInsurance = carryGoodsInsurance;
        this.dispatchServiceFee = dispatchServiceFee;
        this.allCarriage = allCarriage;
        this.insurance = insurance;
        this.signTime = signTime;
        this.acceptStation = acceptStation;
        this.carriageMode = carriageMode;
    }

    public String getGoodsRevertBillCode() {
        return goodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        this.goodsRevertBillCode = goodsRevertBillCode;
    }

    public String getLoadStation() {
        return loadStation;
    }

    public void setLoadStation(String loadStation) {
        this.loadStation = loadStation;
    }

    public Date getStartCarryTime() {
        return startCarryTime;
    }

    public void setStartCarryTime(Date startCarryTime) {
        this.startCarryTime = startCarryTime;
    }

    public String getDealGoodsStation() {
        return dealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        this.dealGoodsStation = dealGoodsStation;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getReceiveGoodsLinkman() {
        return receiveGoodsLinkman;
    }

    public void setReceiveGoodsLinkman(String receiveGoodsLinkman) {
        this.receiveGoodsLinkman = receiveGoodsLinkman;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone;
    }

    public String getReceiveGoodsDetailAddr() {
        return receiveGoodsDetailAddr;
    }

    public void setReceiveGoodsDetailAddr(String receiveGoodsDetailAddr) {
        this.receiveGoodsDetailAddr = receiveGoodsDetailAddr;
    }

    public String getCarriageBanlanceMode() {
        return carriageBanlanceMode;
    }

    public void setCarriageBanlanceMode(String carriageBanlanceMode) {
        this.carriageBanlanceMode = carriageBanlanceMode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getIfBalance() {
        return ifBalance;
    }

    public void setIfBalance(String ifBalance) {
        this.ifBalance = ifBalance;
    }

    public String getBackBillState() {
        return backBillState;
    }

    public void setBackBillState(String backBillState) {
        this.backBillState = backBillState;
    }

    public double getStartAdvance() {
        return startAdvance;
    }

    public void setStartAdvance(double startAdvance) {
        this.startAdvance = startAdvance;
    }

    public double getCarryGoodsBillDeposit() {
        return carryGoodsBillDeposit;
    }

    public void setCarryGoodsBillDeposit(double carryGoodsBillDeposit) {
        this.carryGoodsBillDeposit = carryGoodsBillDeposit;
    }

    public double getCarryGoodsInsurance() {
        return carryGoodsInsurance;
    }

    public void setCarryGoodsInsurance(double carryGoodsInsurance) {
        this.carryGoodsInsurance = carryGoodsInsurance;
    }

    public double getDispatchServiceFee() {
        return dispatchServiceFee;
    }

    public void setDispatchServiceFee(double dispatchServiceFee) {
        this.dispatchServiceFee = dispatchServiceFee;
    }

    public double getAllCarriage() {
        return allCarriage;
    }

    public void setAllCarriage(double allCarriage) {
        this.allCarriage = allCarriage;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }

    public String getCarriageMode() {
        return carriageMode;
    }

    public void setCarriageMode(String carriageMode) {
        this.carriageMode = carriageMode;
    }
}
