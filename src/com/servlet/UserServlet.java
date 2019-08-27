package com.servlet;

import com.alibaba.fastjson.JSON;
import com.newdu.entity.PageBean;
import com.newdu.entity.User;
import com.newdu.service.UserService;
import com.newdu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
			String username=request.getParameter("userName");
			String pwd =request.getParameter("password");
			User user=userService.login(username, pwd);

			if(user!=null) {

				session.setAttribute("user",user);
				session.setMaxInactiveInterval(5*60);//过期时间
				response.sendRedirect(request.getContextPath()+"/index.html");

			}else {
				response.sendRedirect(request.getContextPath()+"/login.html");
			}
		}else if(method.equals("regist")){
			String username=request.getParameter("userName");
			String pwd=request.getParameter("password");
			String registerName=request.getParameter("registerName");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String roleId=request.getParameter("role");
			String skin=request.getParameter("registerSkin");

			User user =new User(username,pwd,registerName,null,roleId,null,"1",skin,email,null,phone);
            session.setAttribute("user",user);
			if(userService.regist(user)>0){
				response.sendRedirect(request.getContextPath()+"/index.html");
			}else{
				response.sendRedirect(request.getContextPath()+"/login.html");

			}

		}
		else if(method.equals("show")){
    		User user =(User)session.getAttribute("user");
            String userJSON =JSON.toJSONStringWithDateFormat(user,"yyyy-MM-dd,HH:mm:ss");
			out.print(userJSON);

		}else if(method.equals("loginOut")){
			session.invalidate();//session失效
			response.sendRedirect(request.getContextPath()+"/login.html");

		}else if(method.equals("userList")){//不带分页
            List<User> userList =userService.getUserList();
            String UserListJson=JSON.toJSONStringWithDateFormat(userList,"yyyy-MM-dd,HH:mm:ss");
            out.print(UserListJson);
        }else if(method.equals("userListPage")){//分页
			int currentPage =request.getParameter("currentPage")==null?1:Integer.parseInt(request.getParameter("currentPage"));

 			PageBean<User>page=new PageBean<>();
 			page.setCurrentPage(currentPage);//设置当前页码
 			page.setTotalCount(userService.getUserCount());//设置总记录数
 			page.setPageData(userService.getUserListByPage(currentPage,page.getPageSize()));//设置数据列表
 			String userListPageJSON=JSON.toJSONStringWithDateFormat(page,"yyyy-MM-dd,HH:mm:ss");
			out.print(userListPageJSON);




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
