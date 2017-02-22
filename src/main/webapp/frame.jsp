<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>快享云盘系统</title>
    
	 
  </head>
  
   
    <frameset  rows="55,*" frameborder="0" framespacing="0" draggable="false">
		<frame name="topFrame" src="top.jsp" scrolling="no"/>
    	<frameset cols="211,*" frameborder="0" framespacing="0" draggable="false">
    		<frame name="menuFrame" src="menu"/>
    		<frame name="mainFrame" src="main.jsp"/>
    </frameset>
</frameset> 
  
</html>
