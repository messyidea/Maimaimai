<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>�û�ע��</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="../common/header.jsp"%>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<form class="form-inline" action="userRegister.action">
					<fieldset>
						<legend>�û�ע��</legend>
						<label>�û���</label>
						<p>
							<input type="text" name="username" />
						</p>
						<p>
							<label>����</label>
						</p>
						<p>
							<input type="text" name="password" />
						</p>
						<p>
							<label>Email</label>
						<p>
							<input type="text" name="email" />
						</p>
						<p>
							<label>�Ա�</label>
						</p>
						<p>
							<input type="text" name="sex" />
						</p>
						<p>
							<button class="btn" type="submit">�ύ</button>
						</p>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="../common/foot.jsp"%>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
</body>
</html>
