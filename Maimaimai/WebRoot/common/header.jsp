<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>


<!-- ������-->
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="navbar navbar-inverse">
				<div class="navbar-inner">
					<div class="container-fluid">
						<a class="btn btn-navbar"
							data-target=".navbar-responsive-collapse" data-toggle="collapse"></a>
						<a class="brand" href="#">������</a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<%
       String Login = (String)session.getAttribute("Login");
		if (Login != null && Login.equals("OK")) {
			out.print("<li><a href=\"#\">");
			out.println(request.getAttribute("username"));
			out.println("</a></li>");
			out.println("<li><a href=\"userlogout.action\">logout</a></li>");
		}	
		else {		
			out.println("<li><a href=\"/Maimaimai/customer/userlogin.jsp\">��¼</a></li>")	;
			out.println("<li><a href=\"/Maimaimai/customer/userregister.jsp\">ע��</a></li>");
			//response.setHeader("Refresh","5;URL=login.jsp");	
		}
                     			%>
								<li><a href="#">���ﳵ</a></li>
								<li><a href="#">�ղؼ�</a></li>
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">�����˵�</a>
									<ul class="dropdown-menu">
										<li><a href="#">��������1</a></li>
										<li><a href="#">��������2</a></li>
										<li><a href="#">����</a></li>
										<li class="divider"></li>
										<li class="nav-header">��ǩ</li>
										<li><a href="#">����1</a></li>
										<li><a href="#">����2</a></li>
									</ul></li>
							</ul>
							<ul class="nav pull-right">
								<li><a href="#">��ϵ�ͷ�</a></li>
								<li class="divider-vertical"></li>
								<li><a href="#">��վ��ͼ</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>