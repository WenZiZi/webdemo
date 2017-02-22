package com.icss.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.po.FilesPO;
import com.icss.po.UserInfoPO;
import com.icss.service.FilesService;
import com.icss.service.UserInfoService;

/**
 * 查询全部文件信息
 * @author Lydia
 *
 */
public class findAllFilesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//设置字符编码
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				FilesService service=new FilesService();
				List<FilesPO> list=new ArrayList<FilesPO>();
			
				try {
					//调用service中方法
					//list=service.file(1, 2);
					//int sum = service.findAll().size();
					list=service.findAll();
					System.out.println(list.size());
					//将list信息存入request
					request.setAttribute("userList", list);
					//请求转发
					request.getRequestDispatcher("findAllFiles.jsp").forward(request, response);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
	}

}









