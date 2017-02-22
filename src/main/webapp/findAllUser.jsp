<%@ page language="java" import="java.util.*,com.icss.po.UserInfoPO"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
    <title>查看所有用户信息</title>
     <%
     	List<UserInfoPO> list=(List<UserInfoPO>)request.getAttribute("userList");
      %>
<style type="text/css">
	table{
		font-size:14px;
		padding-top:5px;
		width:700px; 
		text-align:center;
		 
		
	}
	td{
		border: 1px solid blue;
	}
	th{
		border: 1px solid blue;
		margin-top: 0px;
	}


</style>
  </head>
  
  <body>
   <table cellspacing="0">
    		<tr>
     			<td>用户编号</td>
     			<td>用户名</td>
     			<td>密码</td>
     			<td>真实姓名</td>
     			<td>操作</td>
     		</tr>
     	<%
     	
     		for(UserInfoPO po:list){ 
     	 %>
     	 <tr>
     	 		<td> <%=po.getUserId() %></td>
    			<td><%=po.getUserName() %></td>
    			<td><%=po.getUserPwd() %></td>
    			<td><%=po.getUserRealName() %></td>
    			<td>
    			
    			<a href="DeleteUser?userId=<%=po.getUserId()%>">删除</a>
    			<a href="javascript:alert(<%=po.getUserName() %>);">查看</a>
    			
    			</td>
     	 </tr>
     	 <%} %>
     	 
    <!-- 迭代循环，jsp中自带了c标签 -->
  <!-- 
   <c:forEach items="${userList }" var="user" >
    		<tr>
    			<td>${user.userId }</td>
    			<td>${user.userName }</td>
    			<td>${user.userPwd }</td>
    			<td>${user.userRealName }</td>
    		</tr>
    </c:forEach> 	
    	</table>
    --> 	
  </body>
</html>
