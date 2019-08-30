package com.servlet;

import com.alibaba.fastjson.JSON;
import com.entity.Cargoreceipt;
import com.service.CargoreceiptService;
import com.service.impl.CargoreceiptServiceImpl;
import javafx.print.Printer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/CargoreceiptServlet")
public class CargoreceiptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html:charset:utf-8");
        String method=request.getParameter("method");
        HttpSession session=request.getSession();
        CargoreceiptService cargoreceiptService=new CargoreceiptServiceImpl();
        PrintWriter out=response.getWriter();
        if(method.equals("transportTable")){
            try {
                List<Cargoreceipt> Card=cargoreceiptService.getAllCode();
                String CardJson=JSON.toJSONString(Card);
                System.out.print(CardJson);
                out.print(CardJson);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

       /* try {
            if (method.equals("transportTable")){
                String Code=request.getParameter("goodsRevertBillCode");
                List<Cargoreceipt> cargoreceiptList=cargoreceiptService.getCargoreceiptByCode(Code);
                String cargoreceiptListJson=JSON.toJSONStringWithDateFormat(cargoreceiptList,"yyyy-MM-dd,HH:mm:ss");
                System.out.print(cargoreceiptListJson);
                out.print(cargoreceiptListJson);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        /*if(method.equals("transport")){
            String goodsRevertBillCode=request.getParameter("goodsRevertBillCode");
            Cargoreceipt cargoreceipt=cargoreceiptService.getCargoreceiptByCode(goodsRevertBillCode);
            cargoreceipt=(Cargoreceipt)session.getAttribute("cargoreceipt");
            String cargoreceiptJson=JSON.toJSONStringWithDateFormat(cargoreceipt,"yyyy-MM-dd HH:mm:ss");
            System.out.print(cargoreceiptJson);
            out.print(cargoreceiptJson);

        }*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
