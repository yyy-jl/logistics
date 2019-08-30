package com.dao.impl;


import com.dao.UserDao;
import com.entity.Receipt;
import com.entity.User;
import com.util.DBUtil;


import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public List<Receipt> getReceiptByGoodsBillCode(String goodsBillCode) throws SQLException {
        List<Receipt> receipts =new ArrayList<>();
        String sql="select sendGoodsCustomer,sendGoodsCustomerTel,sendGoodsCustomerAddr,sendGoodsCustomerNO from receipt";
        Receipt receipt;
        try {
            rs=executeQuery(sql);
            receipt =null;
            while (rs.next()){
                receipt =new Receipt();

                receipt.setSendGoodsCustomer(rs.getString("sendGoodsCustomer"));
                receipt.setSendGoodsCustomerTel(rs.getString("sendGoodsCustomerTel"));
                receipt.setSendGoodsCustomerAddr(rs.getString("sendGoodsCustomerAddr"));
                receipt.setSendGoodsCustomerNO(rs.getString("sendGoodsCustomerNO"));
                receipts.add(receipt);
            }

        }finally {
            closeAll(conn, pstmt, rs);
        }
        return receipts;
    }

    @Override
    public int editGoodsBillSumbit(Receipt receipt) throws SQLException {

//        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
//        Date date=new Date();
//        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String punchTime = simpleDateFormat.format(date);
//        System.out.println(receipt.getSendGoodsDate());

        String sql="insert into receipt (sendGoodsCustomerNO,sendGoodsCustomer,sendGoodsCustomerTel,sendGoodsCustomerAddr,receiveGoodsCustomerNo," +
                "receiveGoodsCustomer,receiveGoodsCustomerTel,receiveGoodsCustomerAddr,sendGoodsDate,sendGoodsAddr,receiveGoodsAddr,predeliveryDate," +
                "factDealDate,helpAcceptPayment,acceptProcedureRate,payMode,fetchGoodsMode,writeBillPerson,writeDate,validity,ifAudit,ifSettleAccounts," +
                "transferStation,transferFee,payKickback,reduceFund,moneyOfChangePay,carryGoodsFee,carriage,insurance,employeeID,remark,acceptStation)" +
                " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return  executeUpdate(sql,receipt.getSendGoodsCustomerNO(),receipt.getSendGoodsCustomer(),receipt.getSendGoodsCustomerTel(),receipt.getSendGoodsCustomerAddr(),receipt.getReceiveGoodsCustomerNo()
                ,receipt.getReceiveGoodsCustomer(),receipt.getReceiveGoodsCustomerTel(),receipt.getReceiveGoodsCustomerAddr(),receipt.getSendGoodsDate(),receipt.getSendGoodsAddr(),receipt.getReceiveGoodsAddr(),receipt.getPredeliveryDate(),
                receipt.getFactDealDate(),receipt.getHelpAcceptPayment(),receipt.getAcceptProcedureRate(),receipt.getPayMode(),receipt.getFetchGoodsMode(),receipt.getWriteBillPerson(),receipt.getWriteDate(),receipt.getValidity(),receipt.getIfAudit(),receipt.getIfSettleAccounts(),
                receipt.isTransferStation(),receipt.getTransferFee(),receipt.getPayKickback(),receipt.getReduceFund(),receipt.getMoneyOfChangePay(),receipt.getCarryGoodsFee(),receipt.getCarriage(),receipt.getInsurance(),receipt.getEmployeeID(),receipt.getRemark(),receipt.getAcceptStation());
    }

    @Override
    public Receipt getDatabycode(int code) throws SQLException {
        String sql="select sendGoodsCustomer,sendGoodsCustomerTel,sendGoodsCustomerAddr,sendGoodsCustomerNO from receipt where sendGoodsCustomerNO=?";
        Receipt receipt;
        try {
            rs=executeQuery(sql,code);
            receipt =null;
            while (rs.next()){
                receipt =new Receipt();

                receipt.setSendGoodsCustomer(rs.getString("sendGoodsCustomer"));
                receipt.setSendGoodsCustomerTel(rs.getString("sendGoodsCustomerTel"));
                receipt.setSendGoodsCustomerAddr(rs.getString("sendGoodsCustomerAddr"));
                receipt.setSendGoodsCustomerNO(rs.getString("sendGoodsCustomerNO"));

            }

        }finally {
            closeAll(conn, pstmt, rs);
        }
        return receipt;
    }
}
