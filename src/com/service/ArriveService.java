package com.service;

import com.entity.Arrive;

import java.sql.SQLException;

public interface ArriveService {
    int add(Arrive arrive) throws SQLException;
}
