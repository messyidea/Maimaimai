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
		<div class="span12 text-center">
			<form class="form-search" action="Itemsearch.action">
				<input class="input-medium search-query" type="text" name="searchinfo"/> <button type="submit" class="btn">查找</button>
			</form>
		</div>
		<legend></legend>
		<div class="span12">
			<s:iterator value="itemlist" var="l3">
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="/Maimaimai/itemimg/<s:property value="#l3.id" />.jpg" />
						<div class="caption">
							<h3>
								<s:property value="#l3.itemname" />
							</h3>
							<p>
								<s:property value="#l3.itemdesc" />
							</p>
							<p>
								<a class="btn btn-primary" href="<s:url action="Itemshow" ><s:param name="id" value="#l3.id"/></s:url>">浏览</a> 
								<a class="btn" href="<s:url action="Shopcaradd" ><s:param name="id" value="#l3.id"/></s:url>">加入购物车</a>
								<a class="btn" href="<s:url action="Favoritesadd" ><s:param name="id" value="#l3.id"/></s:url>">关注</a>
							</p>
						</div>
					</div>
				</li>
			</s:iterator>
				
			
		</div>
		
			
	</div>

	</div>

	<legend></legend>
    <%@ include file="/common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

