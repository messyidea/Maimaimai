<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>�û�����</title>
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
        <li class="active">
          <a href="Orderlist.action">��������</a>
        </li>
        <li>
          <a href="Shopcarlist.action">�ҵĹ��ﳵ</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeinfo.jsp">�޸�����</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeheadimg.jsp">�޸�ͷ��</a>
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
    	<form class="form-inline" action="pingjia.action">
    		<s:hidden name="id" />
					<fieldset>
						<legend>������Ʒ</legend>
						<label>д����������</label>
						<p>
							<!-- <input type="text" name="userdesc"></input> -->
							<textarea rows="3" name="orderdesc"></textarea>
						</p>
						<p>
							<button class="btn" type="submit">ȷ��</button>
						</p>
					</fieldset>
				</form>
			<!-- 
     	<s:iterator value="orderlist" var="l1" status="sta">
					��Ʒ����<h5><s:property value="#l1.itemid" /> <h5>
					ʱ�䣺<h5><s:property value="#l1.buytime" /> <h5>
					������<h5><s:property value="#l1.num" /> <h5>
					������ע��<h5><s:property value="#l1.orderdesc" /> <h5>
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