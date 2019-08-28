package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

import java.sql.SQLException;

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
}
