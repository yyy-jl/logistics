package com.service;

import com.entity.Receipt;
import com.entity.User;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    //登录
    User login(String username, String pwd);
    //填写接货单goodsBillCode
    List<Receipt> getReceiptByGoodsBillCode(String goodsBillCode);
    //增加填货单
    int editGoodsBillSumbit(Receipt receipt);
    //根据code查数据
    Receipt getDatabycode(int code);
}
