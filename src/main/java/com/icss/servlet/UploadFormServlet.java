package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.service.AccessRightService;
import com.icss.service.FileTypeService;
/**
 * 获取文件类型和进入权限
 * @author Lydia
 *
 */
public class UploadFormServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		 
	}

 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 //设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		AccessRightService service=new AccessRightService();
		FileTypeService  typeService=new FileTypeService();
		try {
			//将查询的所有文件类型存入request中
			request.setAttribute("typeList", typeService.findAll());
			//将查询的所有进入权限存入request中
			request.setAttribute("rightList", service.findALl());
			//页面跳转至文件上传页面
			request.getRequestDispatcher("/uploadForm.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
