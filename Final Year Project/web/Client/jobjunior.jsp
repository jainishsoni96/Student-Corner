<%-- 
    Document   : JuniorLogin
    Created on : 28 Feb, 2017, 4:33:41 PM
    Author     : jainish
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Corner.Corner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Junior Login</title>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/font-awesome.css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        
    </head>
    <body>
        
        <style>
body
{
		padding-top:55px;
		padding-bottom:54px;
}
.fa-book
{
		color:#333;
}
nav
{
	background-color:#344152;
	color:white;
}
.nav, .navbar-nav > li > a
{
	color:white;
	font-weight:bold;
	}
.navbar .navbar-nav > li > a:hover, .navbar .navbar-nav > li > a:focus {
	background-color:#344152;
	color:white;
}
#top-link-block.affix-top {
    position: absolute; /* allows it to "slide" up into view */
    bottom: -82px;
    left: 10px;
}
#top-link-block.affix {
    position: fixed; /* keeps it on the bottom once in view */
    bottom: 18px;
    right: 10px;
}

</style>



</head>

<body>

<!--Header Starts -->
<nav class="navbar navbar-fixed-top">
      <div class="container-fluid">
      
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar" style="background-color:white;"></span>
            <span class="icon-bar" style="background-color:white;"></span>
            <span class="icon-bar" style="background-color:white;"></span>
          </button>
          <a href="#" class="navbar-brand text-uppercase" style="color:#FFF;letter-spacing:3px;"><i class="fa fa-graduation-cap" aria-hidden="true"></i>&nbsp;Student Corner</a>
          </div>
          
          <div class = "collapse navbar-collapse" id = "navbar">
			<ul class = "nav navbar-nav navbar-right">
            
            
            <li><a href="#">Home</a></li>    
            <li><a href="#">My Account&nbsp;&nbsp;<i class="fa fa-user" aria-hidden="true"></i></a></li> 
            <li><a href="#">Logout&nbsp;&nbsp;<i class="fa fa-sign-out" aria-hidden="true"></i></a></li> 
 		
      </ul>
   </div>
	  </div>
</nav>

<!--Header Ends -->
<hr />

<!--Content starts-->
<div class="container-fluid">
<div class="row">
	<div class="col-md-3">
    
    <div class="panel-group">
    <div class="panel panel-default text-center">
    	<div class="panel-body" style="background-color:">
        	<i class="fa fa-book fa-3x" aria-hidden="true"></i>
        	<h3>Tutorials</h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
    
     <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-briefcase fa-3x" aria-hidden="true"></i>
        	<h3>Jobs</h3>
            
            <hr />
            
            <h5>50</h5>
        </div>
       
    </div>
        <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-book fa-3x" aria-hidden="true"></i>
        	<h3>Projects</h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
         <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-briefcase fa-3x" aria-hidden="true"></i>
        <h3><a href="newsclient.jsp">News</a></h3>
            
            <hr />
            
            <h5>50</h5>
        </div>
       
    </div>
    
     
    	</div>
    </div>
    <div class="col-md-9">
        <div class="panel panel-default"><!-- panel start -->
	
		<div class="panel-body"><!-- panel body -->
				<table class="table table-striped ">
				<thead>
					<tr>
					<th>Job Title</th>
                                        <th>Company Name</th>
					<th>Interview Date</th>
                                        <th>Job Skills</th>
                                        <th>Experience</th>
                                        <th>Posted by</th>
					
					</tr>
				</thead>
				
				<tbody>
                                    <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from jobs");
                                                while(rs.next())
                                                {

                                            %>

                                    	<tr>
						<td><%=rs.getString(2) %></td>
						<td><%=rs.getString(3) %></td>
                                                <td><%=rs.getString(4) %></td>
                                                <td><%=rs.getString(5) %></td>
                                                <td><%=rs.getString(6) %></td>
						<td><%=rs.getString(7) %></td>
						
					</tr>
					<%
                                            }
                                            }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                        %>
				</tbody>	
			
			</table>
		
                    </div><!-- panel body-->
	</div><!-- end panel -->
    </div>
</div>
</div>

<!--content ends-->
        
<!-- Back To Top -->
<span id="top-link-block" class="hidden">
    <a href="#top" class="well well-sm" onclick="$('html,body').animate({scrollTop:0},'slow');return false;">
        <i class="glyphicon glyphicon-chevron-up"></i>
    </a>
</span>
<!-- /Back To Top Ends -->
        
        
        <script>
        // Only enable if the document has a long scroll bar
        // Note the window height + offset
        if ( ($(window).height() + 50) < $(document).height() ) {
            $('#top-link-block').removeClass('hidden').affix({
             // how far to scroll down before link "slides" into view
               offset: {top:100}
            });
        }
        </script> 
        
        <%@include file="Footer/Footer.jsp" %>
    </body>
</html>
