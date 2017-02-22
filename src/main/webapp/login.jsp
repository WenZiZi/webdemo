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
	<title>云资源管理系统登录界面</title>
	    <link rel="shortcut icon" href="../favicon.ico"/> 
        <link rel="stylesheet" type="text/css" href="css/demologin.css" />
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom-login.css" />
  </head>
  
  <body>
  <div class="container">
<div style="text-align:center;clear:both;">
 <h1>欢迎来到快享云资源管理系统</h1>
</div>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <br />
                    <br />
                    <br />		
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="login" method="post" autocomplete="on" id="V"> 
                                <h1 aria-disabled="False">用户登录</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > 用户名: </label><br />
                                    <input id="username" name="userName" required="required" type="text" placeholder="请输入用户名"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> 密 码: </label><br />
                                    <input id="password" name="userPwd" required="required" type="password" placeholder="请输入密码" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">记住密码</label>
									<a href="javascript:alert('开发中...')" class="a1">忘记密码了？</a>
								</p>
								
                                <p class="login button"> 
                                    <input type="submit" value="登陆" /> 
								</p>	
					
				
                         <p class="change_link">
							没有注册 ?
							<a href="reg.jsp" class="to_register">注册</a>
						</p> 
							</form>  
                      </div>  
						
                    </div>
                </div>  
            </section>
        </div>
  
   <!--   <form action ="login" method="post">
    
    <label>用户名：</label>
    <input type="text" name="userName"/>
    <br/>
    <label>密&nbsp;&nbsp;码</label>
    <input type="password" name="userPwd"/>
    <br/>
    <input type="submit" value="登      录"/>
      
    </form>
    -->
  </body>
</html>
