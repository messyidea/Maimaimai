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
	<div class="container">
	<div class="row">
		<div class="span6">
			<img alt="140x140" src="/Maimaimai/itemimg/<s:property value="item.itemname" />.jpg" />
		</div>
		<div class="span6">
			<form class="form-inline" action="Orderbuy.action">
				<s:hidden name="id"/>
					<fieldset>
						<legend>确认下单</legend>
						商品名：<h5><s:property value="item.itemname" /> <h5>
						商品价格：<h5><s:property value="item.price" /> <h5>
						商品介绍：<h5><s:property value="item.itemdesc" /> <h5>
						商品评价：<h5><s:property value="item.grade" /> <h5>
						商品库存：<h5><s:property value="item.num" /> <h5>
						<label>商品数量</label>
						<p>
							<input type="text" name="num" />
						</p>
						<p>
							<label>订单备注</label>
						</p>
						<p>
							<input type="text" name="orderdesc" />
						</p>
						<p>
							<button class="btn" type="submit">确认</button>
						</p>
					</fieldset>
				</form>
				<!--  
			商品名：<h5><s:property value="item.name" /> <h5>
			商品价格：<h5><s:property value="item.price" /> <h5>
			商品介绍：<h5><s:property value="item.itemdesc" /> <h5>
			商品评价：<h5><s:property value="item.grade" /> <h5>
			所属类别：<h5><s:property value="item.itemcat" /> <h5>
			<a class="btn" href="<s:url action="Orderbuy" ><s:param name="id" value="item.id"/></s:url>">下单</a>
			-->
		</div>
	</div>
	<div class="row">
		<div class="span12">
		<legend>评论</legend>
		<s:iterator value="orderlist" var="l1">
		
			<s:if test="#l1.useridea!=null">
				用户名：<s:property value="#l1.username" /> <br>
				用户评价：<s:property value="#l1.useridea" /> 
			
			</s:if>
		</s:iterator>
		</div>
	</div>
	<div class="row">
		<div class="span12">
		</div>
	</div>
</div>
	
	
    <%@ include file="/common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

