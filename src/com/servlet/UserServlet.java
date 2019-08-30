package com.servlet;



import com.alibaba.fastjson.JSON;
import com.entity.Receipt;
import com.entity.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.lang.Boolean;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset:utf-8");
        HttpSession session =request.getSession();
		String method =request.getParameter("method");

		UserService userService=new UserServiceImpl();
        PrintWriter out =response.getWriter();

		if (method.equals("login")) {
			String username=request.getParameter("loginId");
			String pwd =request.getParameter("password");
			User user=userService.login(username, pwd);

			if(user!=null) {

				session.setAttribute("user",user);
				session.setMaxInactiveInterval(5*60);//过期时间
				response.sendRedirect(request.getContextPath()+"/index.html");

			}else {
				response.sendRedirect(request.getContextPath()+"/login.html");
			}
		}else if(method.equals("editGoodsBill")){
//			Receipt receipt=userService.getReceiptByGoodsBillCode("1");
//            String sendGoodsCustomerNo=request.getParameter("sendGoodsCustomerNo");

            List<Receipt> receipt=userService.getReceiptByGoodsBillCode("0");
			String ReceiptJson=JSON.toJSONStringWithDateFormat(receipt,"yyyy-MM-dd,HH:mm:ss");
			out.print(ReceiptJson);

		}else if(method.equals("editGoodsBillSumbit")){
			String sendGoodsCustomerNo=request.getParameter("sendGoodsCustomerNo");
			int code=Integer.parseInt(request.getParameter("sendGoodsCustomerNo"));
			Receipt s_customer=userService.getDatabycode(code);
			String sendGoodsCustomer=s_customer.getSendGoodsCustomer();
			String sendGoodsCustomerTel=s_customer.getSendGoodsCustomerTel();
			String sendGoodsCustomerAddr=s_customer.getSendGoodsCustomerAddr();
//			String sendGoodsCustomer=request.getParameter("sendGoodsCustomer");
//			String sendGoodsCustomerTel=request.getParameter("sendGoodsCustomerTel");
//			String sendGoodsCustomerAddr=request.getParameter("sendGoodsCustomerAddr");
			String receiveGoodsCustomerCode=request.getParameter("receiveGoodsCustomerCode");
			String receiveGoodsCustomer=request.getParameter("receiveGoodsCustomer");
			String receiveGoodsCustomerTel=request.getParameter("receiveGoodsCustomerTel");
			String receiveGoodsCustomerAddr=request.getParameter("receiveGoodsCustomerAddr");

			String sendGoodsDate=request.getParameter("sendGoodsDate");
			String sendGoodsAddr=request.getParameter("sendGoodsAddr");
			String receiveGoodsAddr=request.getParameter("receiveGoodsAddr");
			String predeliveryDate=request.getParameter("predeliveryDate");
			String factDealDate=request.getParameter("factDealDate");
			String helpAcceptPayment=request.getParameter("helpAcceptPayment");
			String acceptProcedureRate=request.getParameter("acceptProcedureRate");
			String payMode=request.getParameter("payMode");
			String fetchGoodsMode=request.getParameter("fetchGoodsMode");
			String writeBillPerson=request.getParameter("writeBillPerson");
			String writeDate=request.getParameter("writeDate");
			String validity=request.getParameter("validity");

//			boolean ifAudit= Boolean.parseBoolean(request.getParameter("ifAudit"));
			String ifAudit="未审核";
//			boolean ifSettleAccounts= Boolean.parseBoolean(request.getParameter("ifSettleAccounts"));
			String ifSettleAccounts="未结账";
			boolean transferStation= Boolean.parseBoolean(request.getParameter("transferStation"));

			String checkSettle=request.getParameter("checkSettle");//未选


			int reduceFund=Integer.parseInt(request.getParameter("reduceFund"));//减款

//			int transferFee=Integer.parseInt(request.getParameter("transferFee"));//中转费
			int transferFee=0;
			int payKickback=Integer.parseInt(request.getParameter("payKickback"));
//			int moneyOfChangePay=Integer.parseInt(request.getParameter("moneyOfChangePay"));//变更后金额
			int moneyOfChangePay=0;
			int carryGoodsFee=Integer.parseInt(request.getParameter("carryGoodsFee"));
			int carriage=Integer.parseInt(request.getParameter("carriage"));
			int insurance=Integer.parseInt(request.getParameter("insurance"));
//			String employeeCode=request.getParameter("employeeCode");//职员编号
			String employeeCode=null;
			String remark=request.getParameter("remark");
			String acceptStation=request.getParameter("acceptStation");
			Receipt receipt=new Receipt(sendGoodsCustomerNo,sendGoodsCustomer,sendGoodsCustomerTel,sendGoodsCustomerAddr,receiveGoodsCustomerCode,receiveGoodsCustomer,
					receiveGoodsCustomerTel,receiveGoodsCustomerAddr,sendGoodsDate,sendGoodsAddr,receiveGoodsAddr,predeliveryDate,factDealDate,helpAcceptPayment,acceptProcedureRate,
					payMode,fetchGoodsMode,writeBillPerson,writeDate,validity,ifAudit,ifSettleAccounts,transferStation,transferFee,payKickback,reduceFund,moneyOfChangePay,carryGoodsFee,
					carriage,insurance,employeeCode,remark,acceptStation);
			userService.editGoodsBillSumbit(receipt);


        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
