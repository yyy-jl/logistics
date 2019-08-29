package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.entity.Receipt;
import com.entity.User;
import com.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User login(String username, String pwd) {
        try {
            return new UserDaoImpl().getUserByUsername(username,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Receipt> getReceiptByGoodsBillCode(String goodsBillCode){
        try {
            return new UserDaoImpl().getReceiptByGoodsBillCode(goodsBillCode);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
