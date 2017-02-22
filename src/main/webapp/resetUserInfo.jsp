<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>修改个人信息</title>
<link type="text/css" rel="stylesheet" href="css/msg.css">
</head>

<body style="margin:0; padding:0; width: 100%;">
<div style=" width:100%; background:#F7F7F7; height:30px; line-height:30px; padding-left:10px; font-family:'微软雅黑'; font-size:13px; border-bottom:solid 1px #D2D2D2;">当前位置：修改个人信息</div>

<form action="resetUserInfo" method="post">
  <table style="margin-top: 10px;" align="center" width="100%" border="0" cellspacing="5" cellpadding="0">
    <tr>
      <td width="30%" align="right">用户名：</td>
      <td><input class="input username" style="width:30%;" type="text" name="username" value="${sessionScope.user.userName}" required="required"/></td>
    </tr>
    <tr>
      <td align="right">真实姓名：</td>
      <td><input class="input realname" style="width:30%;" type="text" name="realname" value="${sessionScope.user.userRealName}" /></td>
    </tr>
    <tr>
      <td align="right">邮箱地址：</td>
      <td><input class="input email" style="width:30%;" type="text" name="email" /></td>
    </tr>
   
    <tr>
<td align="right"><input class="btn" style="height:40px; line-height:40px; font-size:13px; padding:0 20px;" type="reset" value="取消"/></td>
<td align="left"><input class="btn" style="height:40px; line-height:40px; font-size:13px; padding:0 20px;" type="submit" value="确定修改"/></td>
    </tr>
  </table>
  </form>
</body>
</html>
