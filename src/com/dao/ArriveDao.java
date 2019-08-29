package com.dao;

import com.entity.Arrive;

import java.sql.SQLException;

public interface ArriveDao {
    int add(Arrive arrive) throws SQLException;
}
