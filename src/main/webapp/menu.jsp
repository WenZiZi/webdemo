<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu.jsp' starting page</title>
    
	<link href="css/menu.css" rel="stylesheet" type="text/css">
<script src="js/jquery-1.8.3.min.js" language="javascript"></script>
<script language="javascript">
(function(){
	$(function(){
		$("._menu>li>a").click(function(){
			if($(this).is(":not(.on)")){
				$("._menu>li>a.on").removeClass("on");
				$(this).addClass("on");	
			}
		});
	});	
})(jQuery);
</script>
</head>

<body><% %>
<ul class="_menu" style="padding-top: 10px;">
	<li>
    	<a href="findAllFiles" target="mainFrame"><span class="ico_0"></span>全部文件</a>
    </li>
    <c:forEach items="${list }" var="vo">
	<li>
    	<a href="findTypeFiles?fileTypeId=${vo.fileTypeId }" target="mainFrame"><span class="ico_${vo.fileTypeId }"></span>${vo.fileTypeName }</a>
    </li>
	</c:forEach>
	<li>
    	<a href="./list/list6.jsp" target="mainFrame"><span class="ico_6"></span>分享</a>
    </li>
    <li>
    	<a href="./list/list7.jsp" target="mainFrame"><span class="ico_7"></span>回收站</a>
    </li>
    <li>
    	<a href="./list/list8.jsp" target="mainFrame"><span class="ico_8"></span>联系我们</a>
    </li>
    <li>
    	<a href="./list/list7.jsp" target="mainFrame"><span class="ico_9"></span>新建文件夹</a>
    </li>
</ul>

</body>
</html>