package com.icss.commons;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThymeleafAppUtil {
	 private static TemplateEngine templateEngine;

	    /**
	     * static代码块，加载初始模板设置：/WEB-INF/templates/**.html文件
	     */
	    static {
	        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
	        templateResolver.setTemplateMode("HTML5");
	        templateResolver.setPrefix("/WEB-INF/templates/");
	        templateResolver.setSuffix(".html");
//	        templateResolver.setCacheTTLMs(3600000L);
	        templateResolver.setCharacterEncoding("UTF-8");
	        templateEngine = new TemplateEngine();
	        templateEngine.setTemplateResolver(templateResolver);
	    }

    /**
	 * 返回视图
	 * 返回视图
	 * @param template
	 * @param ctx
	 * @param response
	 * @throws IOException
     */
	    public static void render(String template, WebContext ctx , HttpServletResponse response) throws IOException {
	    	//更改字符编码，防止前台中文乱码
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			templateEngine.process(template, ctx, response.getWriter());
	    }


}
