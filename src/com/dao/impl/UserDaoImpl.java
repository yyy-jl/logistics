package com.dao.impl;


import com.dao.UserDao;
import com.entity.User;
import com.util.DBUtil;

import java.sql.SQLException;

public class UserDaoImpl extends DBUtil implements UserDao {

    @Override
    public User getUserByUsername(String username, String pwd) throws SQLException {
        String sql="select a_account,a_password from admin where a_account=? and a_password=?";
        User user;
        try {
            rs=executeQuery(sql,username,pwd);
            user =null;
            if(rs.next()){
                user =new User();
                user.setA_account(rs.getString("a_account"));
                user.setA_password(rs.getString("a_password"));

            }
        }finally {
            closeAll(conn, pstmt, rs);
        }
        return user;
    }
}
