package com.icss.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.po.FileTypePO;
import com.icss.service.FileTypeService;

/**
 * 显示文件类型的Servlet
 * 
 * @author Lydia
 * 
 */
public class MenuServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		FileTypeService service=new FileTypeService();
		List<FileTypePO>  list=new ArrayList<FileTypePO>();
		//调用service中的方法
		try {
			list=service.findAll();
			System.out.println(list.size());
			request.setAttribute("list", list);
			request.getRequestDispatcher("menu.jsp").forward(request, response);
		} catch (Exception e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

}
