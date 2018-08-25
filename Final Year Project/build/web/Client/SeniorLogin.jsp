<%-- 
    Document   : SeniorLogin
    Created on : 28 Feb, 2017, 4:33:56 PM
    Author     : jainish
--%>

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

.row > .column {
  padding: 0 8px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

.column {
  float: left;
  width: 25%;
}

/* The Modal (background) */
.modal {
  display: none;
  position: fixed;
  z-index: 1;
  padding-top: 100px;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: black;
}

/* Modal Content */
.modal-content {
  position: relative;
  background-color: #fefefe;
  margin: auto;
  padding: 0;
  width: 90%;
  max-width: 1200px;
}

/* The Close Button */
.close {
  color: white;
  position: absolute;
  top: 10px;
  right: 25px;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #999;
  text-decoration: none;
  cursor: pointer;
}

.mySlides {
  display: none;
}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -50px;
  color: white;
  font-weight: bold;
  font-size: 20px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
  -webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover,
.next:hover {
  background-color: rgba(0, 0, 0, 0.8);
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

.caption-container {
  text-align: center;
  background-color: black;
  padding: 2px 16px;
  color: white;
}

img.demo {
  opacity: 0.6;
}

.active,
.demo:hover {
  opacity: 1;
}

img.hover-shadow {
  transition: 0.3s
}

.hover-shadow:hover {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)
}

blockquote{
 
  padding-left: 1.5rem;
  border-left: 5px solid   #4d79ff; /* Just change the color value and that's it*/
}


</style>



</head>

<body>
    <%
       HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("s_student");
       
       if(m==null)
       {
           response.sendRedirect("StudentCorner.jsp");
       }
         HttpSession sessionPage = request.getSession();         
         sessionPage.setAttribute("pageCall",null);   
    %>

    <%@include file="included/Sheader.jsp" %>
<!--Content starts-->
<hr />

<%@include file="included/SMenu.jsp" %>
    <div class="col-md-9">
        <div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Welcome To Senior Corner.</h3>
			<hr /><br />
		<blockquote>
                            <p>Senior can add Tutorials, Projects, Gallery, Jobs, etc which can be used by Juniors.</p>
                             
                           
                        </blockquote>
                        
                       <blockquote>
                            <p>Also, Seniors can see Projects, Tutorials, Jobs, Gallery.</p>
                             
                           
                        </blockquote> 
                </div>
	</div>
    </div>
</div>
</div>
        
        
        
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
