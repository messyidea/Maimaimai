<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<head>
    <title>主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

  </head>
  <body>


	<%@ include file="/common/header.jsp"%>
	<legend></legend>
	
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2 accordion-group">
			<ul class="nav nav-list">
				<li class="nav-header">
				</li>
				<li class="active">
					<a href="index.action">所有商品</a>
				</li>
				<s:iterator value="rootcatlist" var="l1" status="sta">
					<li class="nav-header">
					<s:property value="#l1.name" />
					</li>
					
					<s:iterator value="soncatlist[#sta.index]" var="l2">
						<s:iterator>
							<a href="<s:url action="Indexshow" ><s:param name="id" value="#l2.id"/></s:url>">
								<s:property value="#l2.name" />
							</a>
						</s:iterator>
					</s:iterator>
					
				</s:iterator>
				
			</ul>
		</div>
		<div class="span10 accordion-group">
			<s:iterator value="itemlist" var="l3">
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="a.jpg" />
						<div class="caption">
							<h3>
								<s:property value="#l3.itemname" />
							</h3>
							<p>
								<s:property value="#l3.itemdesc" />
							</p>
							<p>
								<a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">加入购物车</a>
							</p>
						</div>
					</div>
				</li>
			</s:iterator>
				
			
		</div>

</div>

	<legend></legend>
    <%@ include file="/common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

