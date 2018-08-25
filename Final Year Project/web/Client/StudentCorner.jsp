<%-- 
    Document   : StudentCorner
    Created on : 28 Feb, 2017, 4:33:27 PM
    Author     : jainish
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="Corner.Corner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Corner</title>
      
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <link rel="stylesheet" href="css/style.css" />
            <link rel="stylesheet" href="css/font-awesome.css" />
            <link rel="stylesheet" href="css/font-awesome.min.css" />
    
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine0/style.css" />
	<!--script type="text/javascript" src="engine0/jquery.js"></script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine0/style.css" />
	<!--script type="text/javascript" src="engine0/jquery.js"></script-->
	<!-- End WOWSlider.com HEAD section --></head>
    <body>
	
        <style>
body
{
		padding-top:54px;
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

#wowslider-container8{
	
	padding-top:8px;
	}

</style>


	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine0/style.css" />
	<!--script type="text/javascript" src="engine0/jquery.js"></script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	</script-->
	<!-- End WOWSlider.com HEAD section -->
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="engine8/style.css" />
	<!--script type="text/javascript" src="engine8/jquery.js"></script-->
	<!-- End WOWSlider.com HEAD section --></head>
</head>
<body>
    
    <%
       HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("pageCall"); 
       if(m==null)
       {
    %>
    <%
       }
       else
       {
            if(m.equals("hello"))
            {
    %>
    <script type="text/javascript">
        alert("Invalid User or Pwd");
    </script>
    <%
        }
        else if(m.equals("register"))
        {
    %>
    <script type="text/javascript">
        alert("Registration Successfully Done");
    </script>
    <%
        }    
    
      }
     %> 
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
 	      <ul class="nav navbar-nav navbar-right">
          <li style="padding-top:5px; padding-left:5px; padding-right:5px;">
              <form class="form-inline" role="form" method="post" action="../loginServ" >
                  
                    <div class="form-group">
      				
                        <input type="text" required="true" class="form-control" id="uname" name="uname" placeholder="Enter Enrolment No">
    				</div>
    				
                    <div class="form-group">
      				
                        <input type="password" required="true" class="form-control" id="pwd" name="pwd" placeholder="Enter Password">
    				</div>
    				   
      				   
    				
                    <input type="submit" class="btn btn-warning form-control" value="Login" name="login">
  			</form>
            </li>
          </ul>
          </div>
        </div>
</nav>

<!--Header Ends -->
        
        
        <!-- Start WOWSlider.com BODY section --> <!-- add to the <body> of your page -->   
        <div id="wowslider-container0">
	<div class="ws_images"><ul>
                <!-- data0/images/aavishkar4.jpg -->
		<li><img src="data0/images/aavishkar4.jpg" alt="Aavishkar" title="Aavishkar" id="wows0_0"/></li>
		<li><img src="data0/images/blood3.jpg" alt="Blood Donation" title="Blood Donation" id="wows0_1"/></li>
		<li><img src="data0/images/social4.jpg" alt="responsive slider" title="Social Cause" id="wows0_2"/></li>
		<li><img src="data0/images/vision2.jpg" alt="Vision" title="Vision" id="wows0_3"/></li>
	</ul></div>
	<div class="ws_bullets"><div>
		<a href="#" title="Aavishkar"><span><img src="data0/tooltips/aavishkar4.jpg" alt="Aavishkar"/>1</span></a>
		<a href="#" title="Blood Donation"><span><img src="data0/tooltips/blood3.jpg" alt="Blood Donation"/>2</span></a>
		<a href="#" title="Social Cause"><span><img src="data0/tooltips/social4.jpg" alt="Social Cause"/>3</span></a>
		<a href="#" title="Vision"><span><img src="data0/tooltips/vision2.jpg" alt="Vision"/>4</span></a>
	</div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.com">bootstrap carousel</a> by WOWSlider.com v8.7</div>
	<div class="ws_shadow"></div>
	</div>	
	<script type="text/javascript" src="engine0/wowslider.js"></script>
	<script type="text/javascript" src="engine0/script.js"></script>
	<!-- End WOWSlider.com BODY section -->
	
       
        <!--Sign Up Form -->
        <div class="container-fluid">  
	
<div class="col-md-3">

<h3 align="center">Register Yourself</h3>
           
<form role="form" method="post" action="../signupServ">
	<div class="form-group">
          	<div class="input-group">
    			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id="enrolmentno" type="text" required="true" class="form-control" name="en_no" placeholder="Enter Enrolment No" />
  			</div>
  	</div>
    
    <div class="form-group">
          	<div class="input-group">
    			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input type="text" required="true" class="form-control" name="fname" placeholder="Enter First Name" />
  			</div>
  	</div>
    
    <div class="form-group">
          	<div class="input-group">
    			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input type="text" required="true" class="form-control" name="sname" placeholder="Enter Last Name" />
  			</div>
  	</div>
    <div class="form-group">
    		<div class="input-group">
            	<span class="input-group-addon"><i class="fa fa-envelope" aria-hidden="true"></i></span>
                <input id="email" type="email" required="true" class="form-control" name="email" placeholder="Enter Your Email Address" />
            </div>
    </div>
    
    
  	<div class="form-group">
           	<div class="input-group">
    			<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input id="password" type="password" required="true" class="form-control" name="pwd" placeholder="Enter Your Password">
  			</div>
  	</div>
    	 
            <div class="form-group">
                	<div class='input-group date' id='datetimepicker1'>
                    	<span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                        <input type="date" required="true" name="bdate" id="birthdate" placeholder="DD/MM/YYYY" class="form-control" />
                    
                	</div>            
            
            </div>
            
			<div class="form-group">
                            <select name="department" class="form-control">
                                    <option>----Select Your Department----</option>
					<%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from department");
                                                while(rs.next())
                                                {

                                        %>
                                        <option value="<%=rs.getString(1)%>" > <%=rs.getString(2)%></option>
                                            <%
                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             %>    


				</select>
			</div>

			<div class="form-group">
            	<label for="gender">Gender</label>
                <input type="radio" required="true" value="Male" name="gender" role="form" class="form-group" checked="true"/>&nbsp;Male
                <input type="radio" required="true" value="Female" name="gender" role="form" class="form-group"/>&nbsp;Female
			</div>
            
            <div class="form-group">
            	<label for="Role">Role</label>
                <input type="radio" required="true" value="Junior" name="role" role="form" class="form-group"/>Junior
                <input type="radio" required="true" value="Senior" name="role" role="form" class="form-group"/>Senior
			</div>
            
				<input type="submit" class="btn btn-primary" value="Sign Up" name="signup" />
</form>
</div>


<!--Sign Up Form Ends -->

<!-- content -->
<div class="col-md-9">
<br />
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Welcome To Student Corner</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">The system is specially designed for creating a healthy relation between the faculties and students as well as alumni(seniors) and the students(juniors). It is more inclined towards the social networking website which provides a better interface as well as some advanced features. Using this website students can directly interact with faculties of college respective of their departments. It will manage all the details and records of the faculties and alumni as well as the students of an institute. We have introduced some of the unique features which will be useful for the students, alumni and faculty members. The main motto behind this is to create a system which not only help users to communicate with each other but also to enhance their knowledge and spread it.</p>
		</div>
	</div>
</div>
</div>

<!-- end content -->

<!-- Back To Top -->
<span id="top-link-block" class="hidden">
    <a href="#top" class="well well-sm" onClick="$('html,body').animate({scrollTop:0},'slow');return false;">
        <i class="glyphicon glyphicon-chevron-up"></i>
    </a>
</span>
<!-- /Back To Top Ends -->
        
        
        <script>
        // Only enable if the document has a long scroll bar
        // Note the window height + offset
        if ( ($(window).height() + 100) < $(document).height() ) {
            $('#top-link-block').removeClass('hidden').affix({
             // how far to scroll down before link "slides" into view
               offset: {top:100}
            });
        }
        </script> 

<script>
    $(document).ready(function(){
      var date_input=$('input[name="date"]'); //our date input has the name "date"
      var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
      var options={
        format: 'dd/mm/yyyy',
        container: container,
        todayHighlight: true,
        autoclose: true
      };
      date_input.datepicker(options);
    });
</script>
	

<%@include file="Footer/Footer.jsp" %>
    </body>
</html>
