package com.servlet;

import com.entity.Arrive;
import com.service.ArriveService;
import com.service.impl.ArriveServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ArriveServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArriveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String method =request.getParameter("method");
        ArriveService arriveService=new ArriveServiceImpl();
        if (method.equals("add")){
            String goodsRevertCode=request.getParameter("goodsRevertCode");
            String  driverName=request.getParameter("driverName");
            String  checkGoodsRecord=request.getParameter("checkGoodsRecord");
            String  receiveGoodsPerson=request.getParameter("receiveGoodsPerson");
            String  receiveGoodsDate=request.getParameter("receiveGoodsDate");
            Arrive arrive=new Arrive(goodsRevertCode,driverName,checkGoodsRecord,receiveGoodsPerson,receiveGoodsDate);
            try {
                response.sendRedirect(arriveService.add(arrive))>0 ? request.getContextPath()+"/inform.html":request.getContextPath()+"/in";
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }
}
