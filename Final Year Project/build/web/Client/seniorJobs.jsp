<%-- 
    Document   : seniorJobs
    Created on : 16 May, 2017, 3:48:33 PM
    Author     : Kunj Tandel
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Senior Login</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css" />
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
        <%@include file="included/Sheader.jsp" %>
        <hr />
        
        
<!-- content -->
<%@include file="included/SMenu.jsp" %>
<div class="col-md-9"><!-- col-md-9 -->
	<div class="panel panel-default"><!-- panel start -->
	
		<div class="panel-body"><!-- panel body -->
			<div class="col-md-12">
				<div class="col-md-6">
					<p style="font-size:25px;">Jobs</p> 
				</div>
				
				
				<div class="col-md-6 text-right">
					<button type="button" class="btn btn-success"  data-toggle="modal" data-target="#myModal">Add Record</button>
					
					<!-- modal -->
					
					
					<!-- end modal -->
				</div>
			</div>
			
			
			<!-- modal  -->
			 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</span></button>
          <h4 class="modal-title">Add Jobs</h4>
        </div>
        <div class="modal-body">
          <div class="container">
		  <div class="col-md-6">
                      <form role="form" action="../../DemoProject/SeniorjobServ" method="post">
			
				<div class="form-group">
					<label>Jobs Title</label>
                                        <input type="text" name="j_title" class="form-control" />
					<label>Company Name</label>
                                        <input type="text" name="cmp_name" class="form-control" />
					<label>Interview Date</label>
                                        <input type="date" class="form-control" name="int_date" />
                                        <label>Job Skills</label>
                                        <input type="text" name="j_skill" class="form-control" />
                                        <label>Experience</label>
					<input type="text" name="expr" class="form-control" />
                                        <label>URL</label>
					<input type="text" name="url" class="form-control" />
                                        
				</div>
			
			</div>
		  </div>
        </div>
        <div class="modal-footer">
         
		  
            <input type="submit" value="Add" name="sub" class="btn btn-danger"/>
		  </form> 
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>	
        </div>
      </div>
      
    </div>
  </div>

			<!-- end-->
			
			<!-- table -->
			<br /><br />
			
			<br /><br />
			<table class="table table-striped table-responsive">
				<thead>
					<tr>
					<th>Job Title</th>
                                        <th>Company Name</th>
					<th>Interview Date</th>
                                        <th>Job Skills</th>
                                        <th>Experience</th>
                                        <th>URL</th>
					<th>Edit</th>
					<th>Delete</th>
					
					</tr>
				</thead>
				
				<tbody>
                                    <%
                                    if(request.getAttribute("varname")!=null)
                                     {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("varname");
    
                                    Iterator i1 = a2.iterator();
                
                                    while(i1.hasNext())
                                    {
                                     ArrayList j = (ArrayList)i1.next();    
                
                                     %>
					<tr>
						
						<td><%=j.get(1) %></td>
                                                <td><%=j.get(2) %></td>
                                                <td><%=j.get(3) %></td>
                                                <td><%=j.get(4) %></td>
						<td><%=j.get(5) %></td>
                                                <td><%=j.get(6) %></td>
                                                
                                                <!--<td>
                                                    <a href="">
                                                    APPLY
                                                    </a>
                                                </td>-->
                                                
                                                
                                                <td><a href="SeniorEditJob?id=<%=j.get(0)%>">Edit</a></td>
						<td><a href="SeniorJobDel?id=<%=j.get(0)%>" onclick="return confirm('Sure Want To Delete?');">Delete</a></td>
					</tr>
					<%
                                            }
                                            }
                                        %>
				</tbody>	
			
			</table>
			
			<!-- end table-->
		</div><!-- panel body-->
	</div><!-- end panel -->
</div><!-- end col-md-9 -->

<!-- end content -->
    </div>
<%@include file="Footer/Footer.jsp" %>



    </body>
</html>
