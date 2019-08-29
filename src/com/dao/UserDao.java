package com.dao;

import com.entity.Receipt;
import com.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    //登录
    User getUserByUsername(String username, String pwd) throws SQLException;
    //填写接货单goodsBillCode
    List<Receipt> getReceiptByGoodsBillCode(String goodsBillCode) throws SQLException;
}
