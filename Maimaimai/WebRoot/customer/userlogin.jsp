<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<head>
    <title>ÓÃ»§µÇÂ¼</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

  </head>
  <body>


    <%@ include file="/common/header.jsp"%>
	<legend></legend>
	
    <div class="container">
      <div class="row">
        <div class="span6">
          <img alt="140x140" src="../common/img/pic1.jpg" />
        </div>
        <div class="span6">
          <form class="form-horizontal" action="userlogin.action">
			<legend>µÇÂ½</legend>
            <div class="control-group">
               <label class="control-label" for="inputEmail">ÓÃ»§Ãû</label>
              <div class="controls">
                <input id="username" name="username" type="text" />
              </div>
            </div>
            <div class="control-group">
               <label class="control-label" for="inputPassword">ÃÜÂë</label>
              <div class="controls">
                <input id="password" name="password" type="password" />
              </div>
            </div>
            <div class="control-group">
              <div class="controls">
                 <label class="checkbox"><input type="checkbox" />Remember me</label> 
                 <s:actionerror/>
				 <button type="submit" class="btn" value="login">µÇÂ½</button>
				 <!--
				 <span>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp</span>
				 <button type="submit" class="btn" href="/Maimaimai/customer/userregister.jsp">×¢²á</button>
				 --!>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

    <%@ include file="/common/foot.jsp"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

