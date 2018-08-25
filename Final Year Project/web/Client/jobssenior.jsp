<%-- 
    Document   : jobssenior
    Created on : 16 May, 2017, 2:56:35 PM
    Author     : Kunj Tandel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Corner.Corner"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Senior Login</title>
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
<%@include file="included/Sheader.jsp" %>
<!--Header Ends -->
<hr />

<!--Content starts-->
<div class="container-fluid"><a href="SeniorLogin.jsp">Back To Previous Page</a></div>
<div class="col-md-12"><!-- col-md-9 -->
    <h2 class="text-center">Apply For The Jobs Here...</h2><br>
    
    
    <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from jobs");
                                                    //ResultSet rs=Corner.getdata("select * from project");
                                                while(rs.next())
                                                {
    %>
    
    <!-- start-->
    <div class="col-md-3 text-left">
        <div class="panel panel-info">
         <div class="panel-body">   
        <p><b>Designation:</b><span class="text-danger"><%=rs.getString(2)%></span></p>
        <p><b>Company Name:</b><%=rs.getString(3)%></p>
        <p><b>Interview Date:</b><%=rs.getString(4)%></p>
        <p><b>Skills:</b><%=rs.getString(5)%></p>
        <p><b>Experience:</b><%=rs.getString(6)%></p>
         <p><b>Posted By:</b><%=rs.getString(7)%></p>
         <hr>
         <p class="text-center"><a href="<%=rs.getString(8)%>" class="btn btn-primary btn-block">Apply</a></p>
        
        </div>
        </div>
    </div>  
     <%
                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             %>
    <!-- end here -->
    
    
	
                    
				
                    



    
<!-- end content -->
    
    
</div>
</div>
<br><hr>
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