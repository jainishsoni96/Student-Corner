<%-- 
    Document   : inner.jsp
    Created on : 21 Feb, 2017, 6:52:11 PM
    Author     : jainish
--%>


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

    </head>
    <body> 
       <% 
         /*
           HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("admin");
       if(m==null)
       {
           response.sendRedirect("../Client/StudentCorner.jsp");
       }
           
           */
         HttpSession sessionPage = request.getSession();         
         sessionPage.setAttribute("pageCall",null);
       %>
        <%@include file="includes/myHeader.jsp" %>
<hr />

<%@include file="includes/myMenu.jsp" %>

<!-- content -->
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Welcome To Student Corner</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">The system is specially designed for creating a healthy relation between the faculties and students as well as alumni(seniors) and the students(juniors). It is more inclined towards the social networking website which provides a better interface as well as some advanced features. Using this website students can directly interact with faculties of college respective of their departments. It will manage all the details and records of the faculties and alumni as well as the students of an institute. We have introdhe unique features which will be useful for the students, alumni and faculty members. The main motto behind this is to create a system which not only help users to communicate with each other but also to enhance their knowledge and spread it.</p>
		</div>
	</div>
</div>

<!-- end content >

</div>


<%@include file="includes/myFooter.jsp" %>


<!-- end content menu -->
	
</div>
    </body>
</html>
