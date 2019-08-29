package com.service.impl;

import com.dao.ArriveDao;
import com.dao.impl.ArriveDaoImpl;
import com.entity.Arrive;
import com.service.ArriveService;

import java.sql.SQLException;

public class ArriveServiceImpl implements ArriveService {

    @Override
    public int add(Arrive arrive) throws SQLException {
        ArriveDao arriveDao=new ArriveDaoImpl();
        return arriveDao.add(arrive);
    }
}
