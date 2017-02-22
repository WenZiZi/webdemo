package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;

public class ResetPwdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 从页面获取参数
		String userPwdOld = request.getParameter("userPwdOld");
		String userPwdNew = request.getParameter("userPwdNew");
		

		// session生命周期，只要浏览器没有被关闭就一直存在，除非是正常将其移除
		HttpSession session = request.getSession();
		// 得到登录时的用户信息
		UserInfoPO po = (UserInfoPO) session.getAttribute("user");
		PrintWriter out = response.getWriter();
		try {
			// 如果“输入的原密码”与“原密码”相同则可以修改新密码
			if (userPwdOld.equals(po.getUserPwd()) ) {
				UserInfoService service = new UserInfoService();
				po.setUserId(po.getUserId());
				po.setUserPwd(userPwdNew);

				po.setUserTypeId(po.getUserTypeId());
				po.setUserName(po.getUserName());
				po.setUserRealName(po.getUserRealName());

				service.modify(po);
				
				out.println("<script>alert('Resting Successful!');</script>");
				//request.getRequestDispatcher("/frame.jsp").forward(request,response);
			}else{
				out.println("<script>alert('Resting failed!');window.location='resetPwd.jsp';</script>");
			}
		} catch (Exception e) {
			//e.printStackTrace();
			
			out.println("<script>alert('failed!');</script>");
		}

	}

}
