package com.dao.impl;

import com.dao.ArriveDao;
import com.entity.Arrive;
import com.util.DBUtil;

import java.sql.SQLException;

public class  ArriveDaoImpl extends DBUtil implements ArriveDao {


    @Override
    public int add(Arrive arrive) throws SQLException {
        String sql="insert into`goodsreceiptinfo`(`goodsRevertCode`,`driverName`,`checkGoodsRecord`,`receiveGoodsPerson`,`receiveGoodsDate`) values(?,?,?,?,?) ";

        return executeUpdate(sql,arrive.getGoodsRevertCode(),arrive.getDriverName(),arrive.getCheckGoodsRecord(),arrive.getReceiveGoodsPerson(),arrive.getReceiveGoodsDate());
    }
}
