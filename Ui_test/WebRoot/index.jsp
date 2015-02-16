<head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/css/bootstrap.min.css">

  </head>
  <body>


    <%@ include file="/common/head.html"%>
	<legend></legend>
	
    <div class="container">
      <div class="row">
        <div class="span6">
          <img alt="140x140" src="common/img/pic1.jpg" />
        </div>
        <div class="span6">
          <form class="form-horizontal">
			<legend>µÇÂ¼</legend>
            <div class="control-group">
               <label class="control-label" for="inputEmail">ÓÊÏä</label>
              <div class="controls">
                <input id="inputEmail" type="text" />
              </div>
            </div>
            <div class="control-group">
               <label class="control-label" for="inputPassword">ÃÜÂë</label>
              <div class="controls">
                <input id="inputPassword" type="password" />
              </div>
            </div>
            <div class="control-group">
              <div class="controls">
                 <label class="checkbox"><input type="checkbox" /> Remember me</label> 
				 <button type="submit" class="btn">µÇÂ¼</button>
				 <span>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp</span>
				 <button type="submit" class="btn">×¢²á</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

    <%@ include file="/common/foot.html"%>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
  </body>

