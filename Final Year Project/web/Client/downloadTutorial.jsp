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
<%@include file="included/header.jsp" %>
<!--Header Ends -->
<hr />

<!--Content starts-->
<%@include file="included/JMenu.jsp" %>    
    
<div class="col-md-9"><!-- col-md-9 -->
	<div class="panel panel-default"><!-- panel start -->
	
		<div class="panel-body"><!-- panel body -->
                    <h2 class="text-center">Download Tutorials</h2>
                    <br>
				<table class="table table-striped table-responsive">
				<thead>
					<tr>
					<th>Subject Name</th>
                                        <th>Tutorial Title</th>
                                        <th>Download Here</code></th>
					
					
					</tr>
				</thead>
				
				<tbody>
                                    <%
                                                                               
                                            try
                                                {
                                                ResultSet rs=Corner.getdata("select s.sub_name,t.tut_title,t.tut_path from subject s,tutorial t where s.sid=t.sid");
                                                    //ResultSet rs=Corner.getdata("select * from project");
                                                while(rs.next())
                                                {              
                                         %>
					<tr>
						<td><%=rs.getString(1)%></td>
                                                <td><%=rs.getString(2)%></td>
                                                <td><code><a href="../downloadTutServ?id=<%=rs.getString(3)%>">Download</a></code></td>
						
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
</div><!-- end col-md-9 -->


    
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