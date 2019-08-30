package com.dao;

import com.entity.Receipt;
import com.entity.User;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    //登录
    User getUserByUsername(String username, String pwd) throws SQLException;
    //填写接货单goodsBillCode
    List<Receipt> getReceiptByGoodsBillCode(String goodsBillCode) throws SQLException;
    //增加填货单
    int editGoodsBillSumbit(Receipt receipt) throws SQLException;
    //根据code查数据
    Receipt getDatabycode(int code) throws  SQLException;
}
