package com.icss.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.context.WebContext;

import com.icss.commons.ThymeleafAppUtil;

public class Hello extends HttpServlet {

	public Hello() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		WebContext ctx = new WebContext(request, response, request.getServletContext(),request.getLocale());

		ctx.setVariable("currentDate", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		ThymeleafAppUtil.render("index",ctx,response);
	}

	public void init() throws ServletException {

	}

}
