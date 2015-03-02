<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>��������</title>
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
					<li class="active"><a href="Orderlist2.action">��������</a></li>
					<li><a href="Itemcatget.action">�����Ʒ</a></li>
					<li><a href="Itemlist.action">��Ʒ����</a></li>
					<li><a href="showcount2.action">��Ϣͳ��</a></li>

				</ul>
			</div>
			<div class="span7">
				
				 <s:iterator value="orderlist" var="l1" status="sta">
				<li class="span4">
					<div class="thumbnail">
						<!--  <img alt="300x200" src="/Maimaimai/itemimg/<s:property value="#l1.itemname" />.jpg" /> -->
						<div class="caption">
							��Ʒ����<h5><s:property value="itemnames[#sta.index]" /> <h5>
							ʱ�䣺<h5><s:property value="#l1.buytime" /> <h5>
							�����ߣ�<h5><s:property value="#l1.username" /> <h5>
							������<h5><s:property value="#l1.num" /> <h5>
							������ע��<h5><s:property value="#l1.orderdesc" /> <h5>
							<p>
								<s:if test="#l1.status=='1'.toString()">
									<a class="btn btn-primary" href="<s:url action="Orderadds2" ><s:param name="idd" value="#l1.id"/></s:url>">����</a> 
								</s:if>
								<s:if test="#l1.status=='2'.toString()">�ȴ�ȷ���ջ�</s:if>
								<s:if test="#l1.status=='3'.toString()">�ɹ�</s:if>
							</p>
						</div>
					</div>
				</li>
			</s:iterator>
       
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
