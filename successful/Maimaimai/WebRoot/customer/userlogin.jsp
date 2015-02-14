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
  <%@ include file="../common/header.jsp"%>
  <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<form class="form-inline">
				<fieldset>
					<legend>用户注册</legend> <label>用户名</label>
					<p>
						<input type="text" />
					</p> <label>密码</label>
					<p>
						<input type="text" />
					</p> <label>Email</label>
					<p>
						<input type="text" />
					</p> <button class="btn" type="submit">提交</button>
				</fieldset>
			</form>
		</div>
	</div>
</div>
<%@ include file="../common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>
</html>
