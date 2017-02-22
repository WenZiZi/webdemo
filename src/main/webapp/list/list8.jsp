<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>联系我们</title>
    

  </head>
  
  <body style="background:url('./images/bj.jpg');">
  <div align="center">
  <h3>如有问题和建议请联系我们。</h3>
    
    <br/>
    <a href="mailto:824773394@qq.com">联系我们</a>
    </div>
  </body>
</html>
