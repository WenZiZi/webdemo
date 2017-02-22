
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="margin:0; padding:0; background-color:#F7F7F7;">
<div style="background-color:#000000; height:50px;box-shadow: 0 0 5px #333333; position:relative;">
	<div style=" background:url(images/111111111.gif) no-repeat 0 0; width:170px; height:30px; float:left; margin-top:10px; margin-left:10px;"></div>
	
    
    <div style=" float:left; width:700px; font-size:13px; font-family:'微软雅黑'; color:#eee; height:50px; line-height:50px; padding-left:20px;">&nbsp; 
    	欢迎<b style="color:#FFF;">${sessionScope.user.userRealName }</b>进入系统！
    	<a style="color:#FFF;" href="uploadForm" target="mainFrame">[文件上传]</a> 
    	<a style="color:#FFF;" href="resetPwd.jsp" target="mainFrame">[修改密码]</a>
    	<a style="color:#FFF;" href="resetUserInfo.jsp" target="mainFrame">[修改个人信息]</a> 
    	<c:if test="${sessionScope.user.userTypeId==1 }"><a style="color:#FFF;" href="findAllUser" target="mainFrame">[用户管理]</a></c:if>
    	<a style="color:#FFF;" href="logOut" target="_parent">[退出]</a>
    </div>
    <div style=" float:right; width:200px; font-size:12px; color:#eee; height:50px; line-height:50px;">
    	<input style="width:100px; height:24px; background-color:#EEE; border:none; line-height:24px;">
        <input style=" border:none; background-color:#CCC; color:#000; height:24px; line-height:24px;" type="submit" value="搜索"/>
    </div>
</div>
<div style="height:5px; background:url(images/aside-right-shadow.jpg) repeat-y left; width:210px; border-right: #C6C8CC solid 1px;"></div>
</body>
</html>

