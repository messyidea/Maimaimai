<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>管理中心</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

</head>
<body>
	<%@ include file="/common/header.jsp"%>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span2 accordion-group">
				<ul class="nav nav-list well">
					<li class="nav-header">管理中心</li>
					<li class="active"><a href="#">用户管理</a></li>
					<li><a href="Shoplist.action">店铺管理</a></li>
					<li><a href="Catlist.action">类别管理</a></li>
				</ul>
			</div>
			<div class="span7">
				<s:iterator value="dtolist" var="l1">
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="<s:if test="#l1.haveimg == '0'.toString()">/Maimaimai/common/img/pic.jpg</s:if><s:else>/Maimaimai/headimg/<s:property value="#l1.username" />.jpg</s:else>" />
						<div class="caption">
							<h5>
								用户名:<s:property value="#l1.username" />
							</h5>
							<h5>
								个性签名:<s:property value="#l1.userdesc" />
							</h5>
							<p>
								<a class="btn btn-primary" >删除用户</a> 
			
							</p>
						</div>
					</div>
				</li>
			</s:iterator>
			<!--  
			<table width="80%" border="1" align="center" class="table table-bordered">
				<s:iterator value="dtolist">
					<tr align="center">
						<td><s:property value="username" /></td>
						<td><s:property value="grade" /></td>
					</tr>
				</s:iterator>
			</table>
			-->
				
			</div>
			<div class="span3 accordion-group well">
				<img class="accordion-group" alt="140x140" width="140" height="140" src="<%
      String haveimg = (String)session.getAttribute("haveimg");
      	if(haveimg.equals("0")){
      		out.print("/Maimaimai/common/img/pic.jpg");
      	} else {
      		String local = "/Maimaimai/headimg/" + (String)session.getAttribute("username") + ".jpg";
      		out.print(local);
      	} 
      %>" class="img-circle" />
				<div>
					<p>
						<br> <span class="label">用户名：${username }</span>
					</p>
					<p>
						<span class="label">个性签名：${userdesc }</span>
					</p>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/common/foot.jsp"%>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
</body>

</html>
