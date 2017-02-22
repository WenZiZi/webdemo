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
import com.icss.service.FilesService;

public class findTypeFilesServlet extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//设置字符编码
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				FilesService service=new FilesService();
				String fileTypeId= request.getParameter("fileTypeId");
				int typeId = Integer.valueOf(fileTypeId);
				
				FilesPO po=new FilesPO();
				po.setFileTypeId(typeId);

				List<FilesPO> list=new ArrayList<FilesPO>();
			
				try {
					list=service.findByTypeId(po);
					System.out.println(list.size());
					
					//将list信息存入request
					request.setAttribute("FilesList", list);
					//请求转发
					//response.sendRedirect("showAllFiles.jsp");
					request.getRequestDispatcher("findTypeFiles.jsp").forward(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

}
