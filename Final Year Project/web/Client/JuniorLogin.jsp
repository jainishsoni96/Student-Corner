<%-- 
    Document   : JuniorLogin
    Created on : 28 Feb, 2017, 4:33:41 PM
    Author     : jainish
--%>

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

blockquote{
 
  padding-left: 1.5rem;
  border-left: 5px solid   #4d79ff; /* Just change the color value and that's it*/
}

</style>



</head>

<body>

    <%@include file="included/header.jsp" %> 

<hr />
<%
       
      /*
       HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("j_student");
       
       if(m==null)
       {
           response.sendRedirect("StudentCorner.jsp");
       }*/
       HttpSession sessionPage = request.getSession();         
       sessionPage.setAttribute("pageCall",null);
       request.setAttribute("NewsMenu",null);
       
%>

<!--Content starts-->  
<%@include file="included/JMenu.jsp" %>
<div class="col-md-9">
        <div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Welcome To Junior Corner.</h3>
			<hr /><br />
                        <blockquote>
                            <p> This page is designed for juniors. Junior can see albums, photos, events etc. Also junior can apply for the jobs and can see tutorials and projects provided by senior users. Although, junior can not add or update any picture,event,tutorial or project.</p>
                        </blockquote>
                        
			 
		</div>
	</div>
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
