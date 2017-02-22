package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;

public class RegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html,charset=utf-8");
		
		//从页面获取参数
		String userName =request.getParameter("userName");
		String userPwd =request.getParameter("userPwd");
		String userRealName = request.getParameter("userRealName");
		
		
		
		UserInfoPO po= new UserInfoPO();
		UserInfoPO user = new UserInfoPO();
		UserInfoService service=new UserInfoService();
		user.setUserTypeId(2);
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setUserRealName(userRealName);
		
		try {
			//判断该用户名是否存在，不存在则写入数据库
			po=service.exist(userName);
			if (po==null) {
				service.add(user);
				//request.getRequestDispatcher("login.jsp").forward(request, response);
				PrintWriter out = response.getWriter();
				out.println("<script>alert('Successfully registered');window.location='login.jsp';</script>");
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('This user name already exists');window.location='reg.jsp';</script>");
				}	
			
		}catch (Exception e) {
			e.printStackTrace();
			//response.sendRedirect("error.jsp");
		}
		/*}else {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('注册失败');window.location='register.jsp';</script>");
			}	
		}*/
			
		
		
	}

}
