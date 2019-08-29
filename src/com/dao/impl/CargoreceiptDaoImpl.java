package com.dao.impl;

import com.dao.CargoreceiptDao;
import com.entity.Cargoreceipt;
import com.util.DBUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CargoreceiptDaoImpl extends DBUtil implements CargoreceiptDao {
    @Override
    public List<Cargoreceipt> getCargoreceiptByCode(String goodsRevertBillCode) throws SQLException {
        String sql="select `goodsRevertBillCode`,` loadStation`,`startCarryTime`,`dealGoodsStation`,`arriveTime`,`receiveGoodsLinkman`,`linkmanPhone`,`receiveGoodsDetailAddr`,`carriageBanlanceMode`,`remark`,`driverId`,`ifBalance`,`backBillState`,`startAdvance`,`carryGoodsBillDeposit`,`carryGoodsInsurance`,`dispatchServiceFee`,`allCarriage`,`insurance`,`signTime`,`acceptStation`,`carriageMode`from cargoreceipt where goodsRevertBillCode=? ";
        List<Cargoreceipt> cargoreceiptList=new ArrayList<>();
        try {
            rs=executeQuery(sql,goodsRevertBillCode);
            Cargoreceipt cargoreceipt=null;
            while(rs.next()){
                cargoreceipt.setGoodsRevertBillCode(goodsRevertBillCode);
                cargoreceipt.setLoadStation(rs.getString("loadStation"));
                cargoreceipt.setStartCarryTime(rs.getDate("startCarryTime"));
                cargoreceipt.setDealGoodsStation(rs.getString("dealGoodsStation"));
                cargoreceipt.setArriveTime(rs.getDate("arriveTime"));
                cargoreceipt.setReceiveGoodsLinkman(rs.getString("receiveGoodsLinkman"));
                cargoreceipt.setLinkmanPhone(rs.getString("linkmanPhone"));
                cargoreceipt.setReceiveGoodsDetailAddr(rs.getString("receiveGoodsDetailAddr"));
                cargoreceipt.setCarriageBanlanceMode(rs.getString("carriageBanlanceMode"));
                cargoreceipt.setRemark(rs.getString("remark"));
                cargoreceipt.setDriverId(rs.getString("driverId"));
                cargoreceipt.setIfBalance(rs.getString("ifBalance"));
                cargoreceipt.setBackBillState(rs.getString("backBillState"));
                cargoreceipt.setStartAdvance(rs.getDouble("startAdvance"));
                cargoreceipt.setCarryGoodsBillDeposit(rs.getDouble("carryGoodsBillDeposit"));
                cargoreceipt.setCarryGoodsInsurance(rs.getDouble("carryGoodsInsurance"));
                cargoreceipt.setDispatchServiceFee(rs.getDouble("dispatchServiceFee"));
                cargoreceipt.setAllCarriage(rs.getDouble("allCarriage"));
                cargoreceipt.setInsurance(rs.getDouble("insurance"));
                cargoreceipt.setSignTime(rs.getDate("signTime"));
                cargoreceipt.setAcceptStation(rs.getString("acceptStation"));
                cargoreceipt.setCarriageMode(rs.getString("carriageMode"));
                cargoreceiptList.add(cargoreceipt);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return cargoreceiptList;
    }

    @Override
    public List<Cargoreceipt> getAllCode() throws SQLException {
        String sql="select goodsRevertBillCode from cargoreceipt";
        List<Cargoreceipt> CodeList=new ArrayList<>();
        try {
            rs=executeQuery(sql);
            Cargoreceipt card=null;

            while (rs.next()){
                card=new Cargoreceipt();
                card.setGoodsRevertBillCode(rs.getString("goodsRevertBillCode"));
                CodeList.add(card);
            }
        } finally {
            closeAll(conn,pstmt,rs);
        }
        return CodeList;
    }


}
