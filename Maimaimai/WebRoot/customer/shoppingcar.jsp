<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>购物车</title>
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
          卖家中心
        </li>
        <li>
          <a href="/Maimaimai/customer/usercenter.jsp">订单管理</a>
        </li>
        <li class="active">
          <a href="#">我的购物车</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeinfo.jsp">修改资料</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeheadimg.jsp">修改头像</a>
        </li>
        <li class="nav-header">
          我的关注
        </li>
        <li>
          <a href="/Maimaimai/customer/favorite.jsp">我收藏的宝贝</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/favoriteshop.jsp">我收藏的店铺</a>
        </li>
        <li class="divider">
        </li>
        <li>
          <a href="#">帮助</a>
        </li>
      </ul>
    </div>
    <div class="span7">
      <s:iterator value="itemlist" var="l1" status="sta">
					商品名：<h5><s:property value="#l1.id" /> <h5>
					商品价格：<h5><s:property value="#l1.price" /> <h5>
					商品介绍：<h5><s:property value="#l1.itemdesc" /> <h5>
					商品评价：<h5><s:property value="#l1.grade" /> <h5>
					商品类别：<h5><s:property value="#l1.itemcat" /> <h5>
					<legend></legend>
				</s:iterator>
				<br>
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
        <span class="label">用户名：<br>${username }</span>
      </p>
      <p>
        <span class="label">个性签名：<br>${userdesc }</span>
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
