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

public class DeleteUserServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置字符编码
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				
				String userId = request.getParameter("userId");
				int id = Integer.valueOf(userId);
				//System.out.println(id);
				UserInfoPO po= new UserInfoPO();
				UserInfoService service=new UserInfoService();
				po.setUserId(id);
				
				try {
					service.delete(po);
					UserInfoService service1=new UserInfoService();
					List<UserInfoPO> list=new ArrayList<UserInfoPO>();
					try {
						list=service1.findAll();
						System.out.println(list.size());
						//将list信息存入request
						request.setAttribute("userList", list);
						//请求转发
						request.getRequestDispatcher("findAllUser.jsp").forward(request, response);
					} catch (Exception e) {
						
						request.getRequestDispatcher("error.jsp").forward(request, response);

						 PrintWriter out=response.getWriter();
						 out.println(e);
						 out.close();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}

}
