<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>�ղصĵ���</title>
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
          ��������
        </li>
        <li>
          <a href="/Maimaimai/customer/usercenter.jsp">��������</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/shoppingcar.jsp">�ҵĹ��ﳵ</a>
        </li>
        <li>
          <a href="/Maimaimai/customer/changeinfo.jsp">�޸�����</a>
        </li>
        <li class="nav-header">
          �ҵĹ�ע
        </li>
        <li>
          <a href="/Maimaimai/customer/favorite.jsp">���ղصı���</a>
        </li>
        <li class="active">
          <a href="#">���ղصĵ���</a>
        </li>
        <li class="divider">
        </li>
        <li>
          <a href="#">����</a>
        </li>
      </ul>
    </div>
    <div class="span7">
      <div class="hero-unit">
        <h1>
          Hello, world!
        </h1>
        <p>
          ����һ�����ӻ�����ģ��, ����Ե��ģ��������ֽ����޸�, Ҳ����ͨ����������ı༭����и��ı��޸�. �϶�������ʵ������.
        </p>
        <p>
          <a class="btn btn-primary btn-large" href="#">�ο����� ?</a>
        </p>
      </div>
    </div>
    <div class="span3 accordion-group well">
      <img class="accordion-group" alt="140x140" width="140" height="140" src="/Maimaimai/common/img/pic.jpg" class="img-circle" />
      <div >
      <p>
      	<br>
        <span class="label">�û�����${username }</span>
      </p>
      <p>
        <span class="label">����ǩ����${userdesc }</span>
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