<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>�޸���Ϣ</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

  </head>
  <body>
	<%@ include file="/common/header.jsp"%>
    <div class="container-fluid">
  <div class="row-fluid">
    <div class="span2 accordion-group">
      <ul class="nav nav-list well">
        <li class="nav-header">
          �û�����
        </li>
        <li>
          <a href="Orderlist.action">��������</a>
        </li>
        <li>
          <a href="Shopcarlist.action">�ҵĹ��ﳵ</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeinfo.jsp">�޸�����</a>
        </li>
        <li   class="active">
          <a href="#">�޸�ͷ��</a>
        </li>
        <li class="nav-header">
          �ҵĹ�ע
        </li>
        <li>
          <a href="/Maimaimai/customer/favorite.jsp">���ղصı���</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/favoriteshop.jsp">���ղصĵ���</a>
        </li>
        <li class="divider">
        </li>
      </ul>
    </div>
    <div class="span7">
      <div class="hero-unit">
        <legend>�޸�ͷ��</legend>
          	<br>
        </p>
        <p>
          	<center>
			<font color="red"><s:fielderror/></font>
			<s:form  method="post" action="updateHeadimg.action" enctype="multipart/form-data">
			<s:file name="headimg" id="headimg" label="ͷ��"></s:file>
			<s:submit label="�ϴ�"/>
			</s:form> 
			</center>
        </p>
      </div>
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
      <div >
      <p>
      	<br>
        <span class="label">�û�����<br>${username }</span>
      </p>
      <p>
        <span class="label">����ǩ����<br>${userdesc }</span>
      </p>
      </div>
    </div>
  </div>
</div>
 <%@ include file="/common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

</html>
