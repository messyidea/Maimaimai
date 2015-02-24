<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>目录管理</title>
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
					<li ><a href="showUser.action">用户管理</a></li>
					<li><a href="Shoplist.action">店铺管理</a></li>
					<li class="active"><a href="Catlist.action">类别管理</a></li>

					<li><a href="#">帮助</a></li>
				</ul>
			</div>
			<div class="span7">
				<form class="form-inline" action="Cataddroot.action">
					<fieldset>
						<label>要增加的主类名</label>
						<p>
							<input type="text" name="name" />
						</p>
						
						<p>
							<button class="btn" type="submit">提交</button>
						</p>
					</fieldset>
				</form>
				<!-- 
      <div class="hero-unit">
        <h1>
          Hello, world!
        </h1>
        <p>
          这是一个可视化布局模板, 你可以点击模板里的文字进行修改, 也可以通过点击弹出的编辑框进行富文本修改. 拖动区块能实现排序.
        </p>
        <p>
          <a class="btn btn-primary btn-large" href="#">参看更多 ?</a>
        </p>
      </div>
       -->
			</div>
			<div class="span3 accordion-group well">
				<img class="accordion-group" alt="140x140" width="140" height="140"
					src="/Maimaimai/common/img/pic.jpg" class="img-circle" />
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
