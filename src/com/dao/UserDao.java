package com.dao;

import com.entity.User;

import java.sql.SQLException;

public interface UserDao {
    User getUserByUsername(String username, String pwd) throws SQLException;

}
