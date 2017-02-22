package com.icss.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.po.FilesPO;
import com.icss.service.FilesService;

public class DownloadServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		FilesService service = new FilesService();
		String fileId = request.getParameter("fileId");
		FilesPO po = new FilesPO();
		po.setFileId(fileId);
		FilesPO po1 = new FilesPO();
		try {
			po1=service.getUriPO(po);
			System.out.println(po1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fileUri = "/" + po1.getFileUri();
		//System.out.println(fileUri);
		
		//String fileUri = "/" + service.getUri(Integer.parseInt(request.getParameter("fileId")));
		// 文件下载
		// 获得绝对路径，创建文件对象
		String path = getServletContext().getRealPath(fileUri);
		File file = new File(path);

		// 通知浏览器以下载的方式打开
		response.setHeader("content-type", "application/octet-stream");
		response.setHeader("content-disposition", "attachment;filename="
				+ URLEncoder.encode(file.getName(), "utf-8"));
		// 创建和文件相关的输入流
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				file));

		// 获得response的输出流
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		// 流的对拷
		for (int data; (data = in.read()) != -1;) {
			out.write(data);
			
		}
	}

	}


