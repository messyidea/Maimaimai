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
						<a class="brand" href="/Maimaimai/index.jsp">������</a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<%
       String Login = (String)session.getAttribute("Login");
		if (Login != null && (Login.equals("1") || Login.equals("2") || Login.equals("3"))) {
		/*
		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">�����˵�</a>
									<ul class="dropdown-menu">
										<li><a href="#">��������1</a></li>
										<li><a href="#">��������2</a></li>
										<li><a href="#">����</a></li>
										<li class="divider"></li>
										<li class="nav-header">��ǩ</li>
										<li><a href="#">����1</a></li>
										<li><a href="#">����2</a></li>
									</ul></li>
		*/
		
			out.print("<li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
			out.print(session.getAttribute("username"));
			out.println("</a>");
			out.println("<ul class=\"dropdown-menu\">");
			out.println("<li><a href=\"/Maimaimai/customer/usercenter.jsp\">�û�����</a></li>");
			out.println("<li><a href=\"#\">���ﳵ</a></li>");
			out.println("<li><a href=\"#\">�Ѳؼ�</a></li>");
			out.println("</ul></li>");
			out.println("<li><a href=\"userlogout.action\">�ǳ�</a></li>");
		
		
			/*out.print("<li><a href=\"#\">");
			out.println(session.getAttribute("username"));
			out.println("</a></li>");
			out.println("<li><a href=\"userlogout.action\">�ǳ�</a></li>");*/
		}	
		else {		
			out.println("<li><a href=\"/Maimaimai/customer/userlogin.jsp\">��¼</a></li>")	;
			out.println("<li><a href=\"/Maimaimai/customer/userregister.jsp\">ע��</a></li>");
			//response.setHeader("Refresh","5;URL=login.jsp");	
		}
                     			%>
								<li><a href="#">���ﳵ</a></li>
								<li><a href="#">�ղؼ�</a></li>
								<!-- 
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
								 -->
							</ul>
							<ul class="nav pull-right">
								<%
									if(Login != null && Login.equals("3")) {
										//out.println("<li><a href=\"/Maimaimai/admin/admincenter.jsp\">��������</a></li>");
										out.println("<li><a href=\"showUser.action\">��������</a></li>");
									}
								 %>
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">��������</a>
									<ul class="dropdown-menu">
									<%
										//String Login = (String)session.getAttribute("Login");
										if(Login != null && Login.equals("2")) {
											out.println("<li><a href=\"/Maimaimai/customer/sellerlogin.jsp\">�������</a></li>");
										} else {
											out.println("<li><a href=\"/Maimaimai/customer/becomeseller.jsp\">��Ϊ����</a></li>");
										}
									 %>
									</ul></li>
								<li><a href="#">��ϵ�ͷ�</a></li>
								<li class="divider-vertical">a</li>
								<li><a href="#">��վ��ͼ</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>