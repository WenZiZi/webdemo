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
	<title>修改登陆密码</title>
	<link type="text/css" rel="stylesheet" href="css/msg.css">
	<script type="text/javascript">
			     function init(){
	     	 //document.mainForm.username.focus();
	      }
	    function checkpwd() {
	        var p1 =document.mainForm.userPwdNew.value;//获取密码框的值
	        var p2 =document.mainForm.useruserPwdConfirm.value;//获取重新输入的密码值
	        if (p1 != p2) {//判断两次输入的值是否一致，不一致则显示错误信息
	            document.getElementById("msg").innerHTML = "两次输入密码不一致，请重新输入";//在div显示错误信息
	            return false;
	        } else {
	            document.getElementById("msg").innerHTML = ""; //密码一致，可以继续下一步操作 
	            return true;
	        }
	    }
	</script>
</head>

<body style="margin:0; padding:0; width: 100%;">
	<div style=" width:100%; background:#F7F7F7; height:30px; line-height:30px; padding-left:10px; font-family:'微软雅黑'; font-size:13px; border-bottom:solid 1px #D2D2D2;">当前位置：修改登陆密码</div>
	
	<form name="mainForm" action="restPwd" method="post">
  	  <table style="margin-top: 10px;" align="center" width="100%" border="0" cellspacing="5" cellpadding="0">
	    <tr>
	      <td width="30%" align="right">原来的密码：</td>
	      <td><input class="input pwd" style="width:30%;" type="password" name="userPwdOld"  placeholder="请输入2-20位的密码" required="required" pattern="^\w{2,20}$"/></td>
	    </tr>
	    <tr>
	      <td align="right">新的密码：</td>
	      <td><input class="input pwd" style="width:30%;" type="password" name="userPwdNew"  placeholder="请输入2-20位的密码" required="required" pattern="^\w{2,20}$"/></td>
	    </tr>
	    <tr>
	      <td align="right">再输一次新密码：</td>
	      <td><input class="input pwd" style="width:30%;" type="password" name="userPwdConfirm"  placeholder="请再次输入密码" required="required"/></td>
	    </tr>
	   	<tr>
           <div id="msg" style="color:red;"></div>
        </tr>                      
	    <tr>
	      <td align="right">&nbsp;</td>
	      <td><input class="btn" style="height:40px; line-height:40px; font-size:16px; padding:0 30px;" type="submit" value="我要修改登陆密码"/></td>
	    </tr>
	  </table>
	</form>
</body>
</html>
