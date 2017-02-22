package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;

public class resetUserInfoServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置字符编码
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			
			PrintWriter out = response.getWriter();
			UserInfoPO user=(UserInfoPO)request.getSession().getAttribute("user");
			
			String userName =request.getParameter("username");
			String userRealName =request.getParameter("realname");
			
			user.setUserId(user.getUserId());
			user.setUserName(userName);
			user.setUserRealName(userRealName);
			
			UserInfoService service=new UserInfoService();
			if(service.resetuserinfo(user)){
				
				out.println("<script>alert('success！');</script>");
			}
			else{
				
				out.println("<script>alert('failsed！');</script>");
			}

	}

}