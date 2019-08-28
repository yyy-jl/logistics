package com.service;

import com.entity.Receipt;
import com.entity.User;

import java.sql.SQLException;

public interface UserService {
    //登录
    User login(String username, String pwd);
    //填写接货单goodsBillCode
    Receipt getReceiptByGoodsBillCode(String goodsBillCode);
}
