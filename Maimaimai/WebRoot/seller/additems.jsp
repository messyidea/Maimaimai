<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>卖家中心</title>
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
					<li class="active"><a href="#">订单管理</a></li>
					<li><a href="#">添加物品</a></li>
					<li><a href="/Maimaimai/seller/itemmanagement.jsp">物品管理</a></li>

				</ul>
			</div>
			<div class="span7">
				<form class="form-inline" action="Itemadd.action">
					<fieldset>
						<label>名称</label>
						<p>
							<input type="text" name="itemname" />
						</p>
						<label>数量</label>
						<p>
							<input type="text" name="itemname" />
						</p>
						<label>其它信息</label>
						<p>
							<input type="text" name="itemname" />
						</p>	
						<p>
							<button class="btn" type="submit">提交</button>
						</p>
					</fieldset>
				</form>			 
			</div>
			<div class="span3 accordion-group well">
				<img class="accordion-group" alt="140x140" width="140" height="140"
					src="/Maimaimai/common/img/pic.jpg" class="img-circle" />
				<div>
					<p>
						<br> <span class="label">店铺名：${shopname }</span>
					</p>
					<p>
						<span class="label">店铺描述：${userdesc }</span>
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
