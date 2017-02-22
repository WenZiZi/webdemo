package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;

import com.icss.commons.ThymeleafAppUtil;
import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;
import org.thymeleaf.context.WebContext;

/**
 * 用户登录
 * @author UA101
 *
 */
public class LoginServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 doPost(request, response);
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 //设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//从页面获取参数
		String userName =request.getParameter("userName");
		String userPwd =request.getParameter("userPwd");
		UserInfoService service=new UserInfoService();
		UserInfoPO po=null;
		try {
			po=service.login(userName, userPwd);
			
			//判断登录是否成功
			if(po!=null){
				//request请求的内容仅在目标页面有效，一次
				//request.setAttribute("user", po);
				
				//session生命周期，只要浏览器没有被关闭就一直存在，除非是正常将其移除
				HttpSession session =request.getSession();
				session.setAttribute("user", po);
				//成功则调转到frame.jsp
				request.getRequestDispatcher("frame.jsp").forward(request, response);
			}else{
				PrintWriter out = response.getWriter();
				out.println("<script>alert('用户名或密码错误！');window.location='index.html';</script>");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// response.sendRedirect("error.jsp");
		}



	}

}
