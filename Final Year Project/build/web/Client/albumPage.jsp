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

#logo1
{
    height:230px;
  width:230px;
}

</style>



</head>

<body>

<!--Header Starts -->
<%@include file="included/header.jsp" %>
<!--Header Ends -->
<hr />

<!--Content starts-->

<div class="container-fluid"><a href="JuniorLogin.jsp">Back To Previous Page</a></div>
<br>
<%@include file="included/JMenu.jsp" %>
<div class="col-md-9"><!-- col-md-9 -->
    <h2 class="text-center">Choose Your Album</h2><br>
    
    
    <%
                                        try {
                                        
                                            if(request.getAttribute("varname")!=null)
                                                {
                                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("varname");
    
                                                    Iterator i1 = a2.iterator();
                
                                                     while(i1.hasNext())
                                                     {
                                                        ArrayList j = (ArrayList)i1.next();    
                
    %>
    <!-- start-->
    <div class="col-md-3 text-left">
        <div class="panel panel-default text-center">
            <div class="panel-body">
        <a href="#">
            
            <img src="data:image/jpeg;base64,<%= j.get(3) %>" class="img-thumbnail" alt="<%= j.get(3) %>"  id="logo1"/>
            <br>
            <p><h4><a href="showGallery?gid=<%= j.get(0) %>"><%= j.get(1) %></a></h4></p>
        </a>
            </div>
        </div>
    </div>
    <%
            }
        }
    }
    catch(Exception e)
    {                        
        e.printStackTrace();
    }
    %>
     
    
    
    </div> 


    
    <!-- end here -->
    
  
   
	
                    
				<!--<table class="table table-striped ">
				<thead>
					<tr>
					<th>Job Title</th>
                                        <th>Company Name</th>
					<th>Interview Date</th>
                                        <th>Job Skills</th>
                                        <th>Experience</th>
                                        <th>Posted by</th>
                                        <th>Apply</th>
					
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
                                                <td><a href="<%=rs.getString(8) %>">Apply</a></td>
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
			
			</table>-->
		
                    



    
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