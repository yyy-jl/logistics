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
			String sendGoodsCustomerNo=request.getParameter("sendGoodsCustomerNo");
			Receipt receipt=userService.getReceiptByGoodsBillCode(sendGoodsCustomerNo);
			String ReceiptJson=JSON.toJSONStringWithDateFormat(receipt,"yyyy-MM-dd,HH:mm:ss");
			out.print(ReceiptJson);

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
