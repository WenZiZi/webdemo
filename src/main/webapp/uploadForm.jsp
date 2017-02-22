<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%><%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>修改登陆密码</title>
<link type="text/css" rel="stylesheet" href="resources/style/msg.css">
</head>

<body style="margin:0; padding:0; width: 100%;">
<div style=" width:100%; background:#F7F7F7; height:30px; line-height:30px; padding-left:10px; font-family:'微软雅黑'; font-size:13px; border-bottom:solid 1px #D2D2D2;">当前位置：文件上传</div>

<form action="upload" method="post" enctype="multipart/form-data">
	<input type="hidden" name="userId" value="${user.userId }"/> 
  <table style="margin-top: 10px;" align="center" width="100%" border="0" cellspacing="5" cellpadding="0">
    <tr>
      <td width="30%" align="right">文件类别：</td>
      <td><select name="fileTypeId">
      <c:forEach items="${typeList }" var="vo">
      	<option value="${vo.fileTypeId }">${vo.fileTypeName }</option>
      	</c:forEach>
      </select></td>
    </tr>
    <tr>
      <td align="right">文件等级：</td>
      <td><select name="accessRightId">
      	<c:forEach items="${rightList }" var="aa">
      	<option value="${aa.accessRightId }">${aa.accessRightName }</option>
      	</c:forEach>
      </select> 
      </td>
    </tr>
    <tr>
      <td align="right">文件：</td>
      <td><input type="file" name="file"/></td>
    </tr>
    <tr>
      <td align="right">说明：</td>
      <td><textarea style="width:90%; background-image:none; text-indent:0px; height:100px; line-height:1.5; font-weight:normal;" class="input" name="fileContent"></textarea></td>
    </tr>
    <tr>
      <td align="right">&nbsp;</td>
      <td><input class="btn" style="height:40px; line-height:40px; font-size:16px; padding:0 30px;" type="submit" value="我要上传文件"/></td>
    </tr>
  </table>
  </form>
</body>
</html>
