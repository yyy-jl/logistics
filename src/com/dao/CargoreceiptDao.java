package com.dao;

import com.entity.Cargoreceipt;

import java.sql.SQLException;
import java.util.List;

public interface CargoreceiptDao {
    List<Cargoreceipt> getCargoreceiptByCode(String goodsRevertBillCode) throws SQLException; //查询货运信息
    List<Cargoreceipt> getAllCode() throws SQLException;//查询所有货运单编号
}
