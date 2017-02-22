<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en" class="no-js"> 
<!--<![endif]-->

  <head>
  <base href="<%=basePath%>">
	<title>用户注册界面</title>
	    <link rel="shortcut icon" href="../favicon.ico"/> 
        <link rel="stylesheet" type="text/css" href="css/demologin.css" />
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom-login.css" />
		
		<script type="text/javascript">
			     function init(){
	     	 //document.mainForm.username.focus();
	      }
	    function checkpwd() {
	        var p1 =document.mainForm.userPwd.value;//获取密码框的值
	        var p2 =document.mainForm.userPwd_confirm.value;//获取重新输入的密码值
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
  
  <body>
  <div class="container">
<div style="text-align:center;clear:both;">
 
</div>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <br />
                    <div id="wrapper">
                        <div id="register" class="animate form">
                            <form name="mainForm" action="register" method="post" autocomplete="on"> 
                                <h1> 用户注册 </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u"><span style="color:red;">*</span>&nbsp;用 户 名:</label>
                                    <input id="usernamesignup" name="userName" required="required" type="text" placeholder="请输入用户名" />
                                </p>
                                <p> 
                                    <label for="userPwd" class="youpasswd" data-icon="p"><span style="color:red;">*</span>&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码 :</label> 
                                    <input id="userPwd" name="userPwd" required="required" type="password" placeholder="请输入密码"/>
                               </p>
                                <p> 
                                    <label for="userPwd_confirm" class="youpasswd" data-icon="p"><span style="color:red;">*</span>&nbsp;确认密码 :</label>
                                    <input id="userPwd_confirm" name="userPwd_confirm" required="required" type="password" placeholder="再输入一次密码" onchange="checkpwd()"/>
                                </p>
                                <div id="msg" style="color:red;"></div>
                                <p> 
                                    <label for="userRealname" class="rname" data-icon="e">&nbsp; 邮&nbsp;&nbsp;&nbsp;&nbsp;箱:</label>
                                    <input id="userRealname" name="userRealName" required="required" type="text" placeholder="请输入邮箱地址" />
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="注册"/> 
								</p>
	
						
                                <p class="change_link">  
									已有账户 ?
									<a href="login.jsp" class="to_register"> 登陆 </a>
								</p>
   					</form>                   
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
  
  </body>
</html>