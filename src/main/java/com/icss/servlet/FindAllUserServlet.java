package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;
/**
 * 查询所有用户信息
 * @author Lydia
 *
 */
public class FindAllUserServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 doPost(request, response);
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		UserInfoService service=new UserInfoService();
		List<UserInfoPO> list=new ArrayList<UserInfoPO>();
		try {
			//调用service中方法
			list=service.findAll();
			System.out.println(list.size());
			//将list信息存入request
			request.setAttribute("userList", list);
			//请求转发
			request.getRequestDispatcher("findAllUser.jsp").forward(request, response);
		} catch (Exception e) {
			 
		}
		 
	}

}
