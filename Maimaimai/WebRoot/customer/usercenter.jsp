<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

  </head>
  <body>
	<%@ include file="/common/header.jsp"%>
    <div class="container-fluid">
  <div class="row-fluid">
    <div class="span2 accordion-group">
      <ul class="nav nav-list">
        <li class="nav-header">
          �б����
        </li>
        <li class="active">
          <a href="#">��ҳ</a>
        </li>
        <li>
          <a href="#">��</a>
        </li>
        <li>
          <a href="#">Ӧ��</a>
        </li>
        <li class="nav-header">
          �����б�
        </li>
        <li>
          <a href="#">����</a>
        </li>
        <li>
          <a href="#">����</a>
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
    <div class="span3 accordion-group">
      <img class="accordion-inner" alt="140x140" width="140" height="140" src="/Maimaimai/common/img/pic.jpg" class="img-circle" />
      <p>
        <span class="label">�û�����</span>
      </p>
      <p>
        <span class="label">����ǩ����</span>
      </p>
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
