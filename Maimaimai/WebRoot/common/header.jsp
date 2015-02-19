<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>


<!-- 导航栏-->
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="navbar navbar-inverse">
				<div class="navbar-inner">
					<div class="container-fluid">
						<a class="btn btn-navbar"
							data-target=".navbar-responsive-collapse" data-toggle="collapse"></a>
						<a class="brand" href="/Maimaimai/index.jsp">买买买</a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<%
       String Login = (String)session.getAttribute("Login");
		if (Login != null && (Login.equals("1") || Login.equals("2") || Login.equals("3"))) {
		/*
		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">下拉菜单</a>
									<ul class="dropdown-menu">
										<li><a href="#">下拉导航1</a></li>
										<li><a href="#">下拉导航2</a></li>
										<li><a href="#">其他</a></li>
										<li class="divider"></li>
										<li class="nav-header">标签</li>
										<li><a href="#">链接1</a></li>
										<li><a href="#">链接2</a></li>
									</ul></li>
		*/
		
			out.print("<li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
			out.print(session.getAttribute("username"));
			out.println("</a>");
			out.println("<ul class=\"dropdown-menu\">");
			out.println("<li><a href=\"/Maimaimai/customer/usercenter.jsp\">用户中心</a></li>");
			out.println("<li><a href=\"#\">购物车</a></li>");
			out.println("<li><a href=\"#\">搜藏夹</a></li>");
			out.println("</ul></li>");
			out.println("<li><a href=\"userlogout.action\">登出</a></li>");
		
		
			/*out.print("<li><a href=\"#\">");
			out.println(session.getAttribute("username"));
			out.println("</a></li>");
			out.println("<li><a href=\"userlogout.action\">登出</a></li>");*/
		}	
		else {		
			out.println("<li><a href=\"/Maimaimai/customer/userlogin.jsp\">登录</a></li>")	;
			out.println("<li><a href=\"/Maimaimai/customer/userregister.jsp\">注册</a></li>");
			//response.setHeader("Refresh","5;URL=login.jsp");	
		}
                     			%>
								<li><a href="#">购物车</a></li>
								<li><a href="#">收藏夹</a></li>
								<!-- 
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">下拉菜单</a>
									<ul class="dropdown-menu">
										<li><a href="#">下拉导航1</a></li>
										<li><a href="#">下拉导航2</a></li>
										<li><a href="#">其他</a></li>
										<li class="divider"></li>
										<li class="nav-header">标签</li>
										<li><a href="#">链接1</a></li>
										<li><a href="#">链接2</a></li>
									</ul></li>
								 -->
							</ul>
							<ul class="nav pull-right">
								<%
									if(Login != null && Login.equals("3")) {
										//out.println("<li><a href=\"/Maimaimai/admin/admincenter.jsp\">管理中心</a></li>");
										out.println("<li><a href=\"showUser.action\">管理中心</a></li>");
									}
								 %>
								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#">卖家中心</a>
									<ul class="dropdown-menu">
									<%
										//String Login = (String)session.getAttribute("Login");
										if(Login != null && Login.equals("2")) {
											out.println("<li><a href=\"/Maimaimai/customer/sellerlogin.jsp\">卖家入口</a></li>");
										} else {
											out.println("<li><a href=\"/Maimaimai/customer/becomeseller.jsp\">成为卖家</a></li>");
										}
									 %>
									</ul></li>
								<li><a href="#">联系客服</a></li>
								<li class="divider-vertical">a</li>
								<li><a href="#">网站地图</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>