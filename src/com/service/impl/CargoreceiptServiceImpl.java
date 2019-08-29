package com.service.impl;

import com.dao.CargoreceiptDao;
import com.dao.impl.CargoreceiptDaoImpl;
import com.entity.Cargoreceipt;
import com.service.CargoreceiptService;

import java.sql.SQLException;
import java.util.List;

public class CargoreceiptServiceImpl implements CargoreceiptService {

    @Override
    public List<Cargoreceipt> getCargoreceiptByCode(String goodsRevertBillCode) throws SQLException {
        CargoreceiptDao cargoreceiptDao=new CargoreceiptDaoImpl();
        return cargoreceiptDao.getCargoreceiptByCode(goodsRevertBillCode);
    }

    @Override
    public List<Cargoreceipt> getAllCode() throws SQLException {
        CargoreceiptDao cargoreceiptDao=new CargoreceiptDaoImpl();
        return cargoreceiptDao.getAllCode();
    }
}
