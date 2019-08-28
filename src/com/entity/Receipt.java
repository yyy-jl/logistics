package com.entity;
public class Receipt {
    private int ID;//ID
    private String sendGoodsCustomerNO;//发货客户编号
    private String sendGoodsCustomer;//发货客户
    private String sendGoodsCustomerTel;//发货客户电话
    private String sendGoodsCustomerAddr;//发货客户地址
    private String receiveGoodsCustomerNo;//收货客户编号
    private String receiveGoodsCustomer;//收货客户
    private String receiveGoodsCustomerTel;//收货客户电话
    private String receiveGoodsCustomerAddr;//收货客户地址
    private String sendGoodsDate;//发货日期
    private String sendGoodsAddr;//发货地址
    private String receiveGoodsAddr;//收货地址
    private String predeliveryDate;//预期交货日期
    private String factDealDate;//实际交货日期
    private String helpAcceptPayment;//代收货款
    private String acceptProcedureRate;//代收手续费率
    private String payMode;//付款方式
    private String fetchGoodsMode;//取货方式
    private String writeBillPerson;//填票人
    private String writeDate;//填写日期
    private String validity;//是否有效
    private boolean ifAudit;//是否审核
    private boolean ifSettleAccounts;//是否结账
    private boolean transferStation;//中转地
    private int transferFee;//中转费
    private int payKickback;//付回扣
    private int reduceFund;//减款
    private int moneyOfChangePay;//变更后金额
    private int carryGoodsFee;//送货费
    private int carriage;//运费
    private int insurance;//保险费
    private String employeeID;//职员编号
    private String remark;//备注
    private String acceptStation;//接货点
    public Receipt() {
    }
    public Receipt(int ID, String sendGoodsCustomerNO, String sendGoodsCustomer, String sendGoodsCustomerTel, String sendGoodsCustomerAddr, String receiveGoodsCustomerNo, String receiveGoodsCustomer, String receiveGoodsCustomerTel, String receiveGoodsCustomerAddr, String sendGoodsDate, String sendGoodsAddr, String receiveGoodsAddr, String predeliveryDate, String factDealDate, String helpAcceptPayment, String acceptProcedureRate, String payMode, String fetchGoodsMode, String writeBillPerson, String writeDate, String validity, boolean ifAudit, boolean ifSettleAccounts, boolean transferStation, int transferFee, int payKickback, int reduceFund, int moneyOfChangePay, int carryGoodsFee, int carriage, int insurance, String employeeID, String remark, String acceptStation) {
        this.ID = ID;
        this.sendGoodsCustomerNO = sendGoodsCustomerNO;
        this.sendGoodsCustomer = sendGoodsCustomer;
        this.sendGoodsCustomerTel = sendGoodsCustomerTel;
        this.sendGoodsCustomerAddr = sendGoodsCustomerAddr;
        this.receiveGoodsCustomerNo = receiveGoodsCustomerNo;
        this.receiveGoodsCustomer = receiveGoodsCustomer;
        this.receiveGoodsCustomerTel = receiveGoodsCustomerTel;
        this.receiveGoodsCustomerAddr = receiveGoodsCustomerAddr;
        this.sendGoodsDate = sendGoodsDate;
        this.sendGoodsAddr = sendGoodsAddr;
        this.receiveGoodsAddr = receiveGoodsAddr;
        this.predeliveryDate = predeliveryDate;
        this.factDealDate = factDealDate;
        this.helpAcceptPayment = helpAcceptPayment;
        this.acceptProcedureRate = acceptProcedureRate;
        this.payMode = payMode;
        this.fetchGoodsMode = fetchGoodsMode;
        this.writeBillPerson = writeBillPerson;
        this.writeDate = writeDate;
        this.validity = validity;
        this.ifAudit = ifAudit;
        this.ifSettleAccounts = ifSettleAccounts;
        this.transferStation = transferStation;
        this.transferFee = transferFee;
        this.payKickback = payKickback;
        this.reduceFund = reduceFund;
        this.moneyOfChangePay = moneyOfChangePay;
        this.carryGoodsFee = carryGoodsFee;
        this.carriage = carriage;
        this.insurance = insurance;
        this.employeeID = employeeID;
        this.remark = remark;
        this.acceptStation = acceptStation;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSendGoodsCustomerNO() {
        return sendGoodsCustomerNO;
    }

    public void setSendGoodsCustomerNO(String sendGoodsCustomerNO) {
        this.sendGoodsCustomerNO = sendGoodsCustomerNO;
    }

    public String getSendGoodsCustomer() {
        return sendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        this.sendGoodsCustomer = sendGoodsCustomer;
    }

    public String getSendGoodsCustomerTel() {
        return sendGoodsCustomerTel;
    }

    public void setSendGoodsCustomerTel(String sendGoodsCustomerTel) {
        this.sendGoodsCustomerTel = sendGoodsCustomerTel;
    }

    public String getSendGoodsCustomerAddr() {
        return sendGoodsCustomerAddr;
    }

    public void setSendGoodsCustomerAddr(String sendGoodsCustomerAddr) {
        this.sendGoodsCustomerAddr = sendGoodsCustomerAddr;
    }

    public String getReceiveGoodsCustomerNo() {
        return receiveGoodsCustomerNo;
    }

    public void setReceiveGoodsCustomerNo(String receiveGoodsCustomerNo) {
        this.receiveGoodsCustomerNo = receiveGoodsCustomerNo;
    }

    public String getReceiveGoodsCustomer() {
        return receiveGoodsCustomer;
    }

    public void setReceiveGoodsCustomer(String receiveGoodsCustomer) {
        this.receiveGoodsCustomer = receiveGoodsCustomer;
    }

    public String getReceiveGoodsCustomerTel() {
        return receiveGoodsCustomerTel;
    }

    public void setReceiveGoodsCustomerTel(String receiveGoodsCustomerTel) {
        this.receiveGoodsCustomerTel = receiveGoodsCustomerTel;
    }

    public String getReceiveGoodsCustomerAddr() {
        return receiveGoodsCustomerAddr;
    }

    public void setReceiveGoodsCustomerAddr(String receiveGoodsCustomerAddr) {
        this.receiveGoodsCustomerAddr = receiveGoodsCustomerAddr;
    }

    public String getSendGoodsDate() {
        return sendGoodsDate;
    }

    public void setSendGoodsDate(String sendGoodsDate) {
        this.sendGoodsDate = sendGoodsDate;
    }

    public String getSendGoodsAddr() {
        return sendGoodsAddr;
    }

    public void setSendGoodsAddr(String sendGoodsAddr) {
        this.sendGoodsAddr = sendGoodsAddr;
    }

    public String getReceiveGoodsAddr() {
        return receiveGoodsAddr;
    }

    public void setReceiveGoodsAddr(String receiveGoodsAddr) {
        this.receiveGoodsAddr = receiveGoodsAddr;
    }

    public String getPredeliveryDate() {
        return predeliveryDate;
    }

    public void setPredeliveryDate(String predeliveryDate) {
        this.predeliveryDate = predeliveryDate;
    }

    public String getFactDealDate() {
        return factDealDate;
    }

    public void setFactDealDate(String factDealDate) {
        this.factDealDate = factDealDate;
    }

    public String getHelpAcceptPayment() {
        return helpAcceptPayment;
    }

    public void setHelpAcceptPayment(String helpAcceptPayment) {
        this.helpAcceptPayment = helpAcceptPayment;
    }

    public String getAcceptProcedureRate() {
        return acceptProcedureRate;
    }

    public void setAcceptProcedureRate(String acceptProcedureRate) {
        this.acceptProcedureRate = acceptProcedureRate;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getFetchGoodsMode() {
        return fetchGoodsMode;
    }

    public void setFetchGoodsMode(String fetchGoodsMode) {
        this.fetchGoodsMode = fetchGoodsMode;
    }

    public String getWriteBillPerson() {
        return writeBillPerson;
    }

    public void setWriteBillPerson(String writeBillPerson) {
        this.writeBillPerson = writeBillPerson;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public boolean isIfAudit() {
        return ifAudit;
    }

    public void setIfAudit(boolean ifAudit) {
        this.ifAudit = ifAudit;
    }

    public boolean isIfSettleAccounts() {
        return ifSettleAccounts;
    }

    public void setIfSettleAccounts(boolean ifSettleAccounts) {
        this.ifSettleAccounts = ifSettleAccounts;
    }

    public boolean isTransferStation() {
        return transferStation;
    }

    public void setTransferStation(boolean transferStation) {
        this.transferStation = transferStation;
    }

    public int getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(int transferFee) {
        this.transferFee = transferFee;
    }

    public int getPayKickback() {
        return payKickback;
    }

    public void setPayKickback(int payKickback) {
        this.payKickback = payKickback;
    }

    public int getReduceFund() {
        return reduceFund;
    }

    public void setReduceFund(int reduceFund) {
        this.reduceFund = reduceFund;
    }

    public int getMoneyOfChangePay() {
        return moneyOfChangePay;
    }

    public void setMoneyOfChangePay(int moneyOfChangePay) {
        this.moneyOfChangePay = moneyOfChangePay;
    }

    public int getCarryGoodsFee() {
        return carryGoodsFee;
    }

    public void setCarryGoodsFee(int carryGoodsFee) {
        this.carryGoodsFee = carryGoodsFee;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }
}

