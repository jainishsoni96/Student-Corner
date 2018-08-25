<%-- 
    Document   : jobsclient
    Created on : 15 Apr, 2017, 10:05:04 AM
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
        <title>Junior Login</title>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/font-awesome.css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" />
       
        
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
<%@include file="included/header.jsp" %>
<!--Header Ends -->
<hr />

<!--Content starts-->
<hr />

<!--Content starts-->
<div class="container-fluid"><a href="JuniorLogin.jsp">Back To Previous Page</a></div>
<div class="col-md-12"><!-- col-md-9 -->
    <h2 class="text-center">Download Project Here...</h2><br>
    
      <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select c.cat_name,d.Dept_name,p.pro_title,p.pro_decription,p.pro_file_path from department d,project p,category c where d.Did=p.Did and c.cid=p.cid;");
                                                    //ResultSet rs=Corner.getdata("select * from project");
                                                while(rs.next())
                                                {
                                            %>
    
    <!-- start-->
    <div class="col-md-4 text-left">
        <div class="panel panel-info">
         <div class="panel-body">   
             <h3 class="text-center text-success">
                 <%=rs.getString(3)%>
                 <hr/>
             </h3>
             <p>Technology:<b><%=rs.getString(1)%></b></p>
             <p>Department:<b><%=rs.getString(2)%></b></p>
             <p>Description:<b><%=rs.getString(4)%></b></p>
             <p><a href="../downloadProServ?id=<%=rs.getString(5)%>"><b class="text-danger">Download</b></a></p>
              
        
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
    



    
<!-- end content -->
    
    
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