<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>��Ʒ����</title>
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
					<li class="nav-header">��������</li>
					<li><a href="Orderlist2.action">��������</a></li>
					<li><a href="/Maimaimai/seller/additems.jsp">������Ʒ</a></li>
					<li class="active"><a href="Itemlist.action">��Ʒ����</a></li>
					<li><a href="showcount2.action">��Ϣͳ��</a></li>

				</ul>
			</div>
			<div class="span7">
			
				<form class="form-inline" action="kucunchange.action">
					<fieldset>
						<legend>�޸���Ʒ���</legend>
						<label>�޸Ŀ��Ϊ</label>
						<p>
							<!-- <input type="text" name="userdesc"></input> -->
							<input type="text" name="kucun"/>
						</p>
						<p>
							<button class="btn" type="submit">ȷ��</button>
						</p>
					</fieldset>
				</form>
			<!--  
				<s:iterator value="itemlist" var="l1" status="sta">
					��Ʒ����<h5><s:property value="#l1.itemname" /> <h5>
					��Ʒ�۸�<h5><s:property value="#l1.price" /> <h5>
					��Ʒ���ܣ�<h5><s:property value="#l1.itemdesc" /> <h5>
					��Ʒ���ۣ�<h5><s:property value="#l1.grade" /> <h5>
					��Ʒ���<h5><s:property value="#l1.itemcat" /> <h5>
					<legend></legend>
				</s:iterator>
				<br>
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
						<br> <span class="label">��������${shopname }</span>
					</p>
					<p>
						<span class="label">����������${ishopdesc }</span>
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