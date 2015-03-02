<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户中心</title>
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
           用户中心
        </li>
        <li class="active">
          <a href="Orderlist.action">订单管理</a>
        </li>
        <li>
          <a href="Shopcarlist.action">我的购物车</a>
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
          <a href="Favoriteslist.action">我收藏的宝贝</a>
        </li>
        <li class="nav-header">
          统计
        </li>
        <li>
          <a href="showcount.action">信息统计</a>
        </li>

        <li class="divider">
        </li>
      </ul>
    </div>
    <div class="span7">
    	<s:iterator value="orderlist" var="l1" status="sta">
				<li class="span4">
					<div class="thumbnail">
						<!--  <img alt="300x200" src="/Maimaimai/itemimg/<s:property value="#l1.id" />.jpg" /> -->
						<div class="caption">
							商品名：<h5><s:property value="itemnames[#sta.index]" /> <h5>
							时间：<h5><s:property value="#l1.buytime" /> <h5>
							数量：<h5><s:property value="#l1.num" /> <h5>
							备注：<h5><s:property value="#l1.orderdesc" /> <h5>
							<!--  订单备注：<h5><s:property value="#l1.orderdesc" /> <h5>
							status：<h5><s:property value="#l1.status" /> <h5> -->
							<p>
							
								<s:if test="#l1.status=='1'.toString()">
									等待接单 
								</s:if>
								<s:if test="#l1.status=='2'.toString()">
									<a class="btn btn-primary" href="<s:url action="Orderadds" ><s:param name="idd" value="#l1.id"/></s:url>">确认收货</a>
								</s:if>
								<s:if test="#l1.status=='3'.toString()">
									
									<a class="btn btn-primary" href="<s:url action="addorderid" ><s:param name="id" value="#l1.id"/></s:url>">评价</a>
								</s:if>
								
								
								<!--  <a class="btn btn-primary" >增加数量</a> -->
							</p>
						</div>
					</div>
				</li>
			</s:iterator>
			<!-- 
     	<s:iterator value="orderlist" var="l1" status="sta">
					商品名：<h5><s:property value="#l1.itemid" /> <h5>
					时间：<h5><s:property value="#l1.buytime" /> <h5>
					数量：<h5><s:property value="#l1.num" /> <h5>
					订单备注：<h5><s:property value="#l1.orderdesc" /> <h5>
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
