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
					<li ><a href="Orderlist2.action">订单管理</a></li>
					<li class="active"><a href="/Maimaimai/seller/additems.jsp">添加物品</a></li>
					<li><a href="Itemlist.action">物品管理</a></li>

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
							<input type="text" name="num" />
						</p>
						<label>价格</label>
						<p>
							<input type="text" name="price" />
						</p>
						<label>所属类别</label>
						<p>
						<select name="itemcat">
						<s:iterator value="soncatlist2">
							<option value ="<s:property value="id" />">
								<s:property value="name" />
							</option>
						</s:iterator>
						</select>
						</p>
						<label>其它信息</label>
						<p>
							<textarea rows="3" name="itemdesc"></textarea>
						</p>	
						<p>
							<button class="btn" type="submit">下一步</button>
						</p>
					</fieldset>
				</form>			 
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
						<br> <span class="label">店铺名：${shopname }</span>
					</p>
					<p>
						<span class="label">店铺描述：${ishopdesc }</span>
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
