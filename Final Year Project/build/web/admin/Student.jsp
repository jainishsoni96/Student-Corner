<%-- 
    Document   : Student
    Created on : 22 Feb, 2017, 6:54:20 PM
    Author     : jainish
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
        <%@include file="includes/myHeader.jsp" %>
        <hr />
        <%@include file="includes/myMenu.jsp" %>
        
<!-- content -->
<div class="col-md-9"><!-- col-md-9 -->
	<div class="panel panel-default"><!-- panel start -->
	
		<div class="panel-body"><!-- panel body -->
			<div class="col-md-12">
				<div class="col-md-6">
					<p style="font-size:25px;">Student</p> 
				</div>
			</div>
		</div>
			
			<!-- table -->
			<br />
			<table class="table table-striped ">
				<thead>
					<tr>
					<th>Enrolment No</th>
					<th>Email</th>
					
                                        <th>Birthdate</th>
                                        
                                        <th>Gender</th>
                                        <th>Role</th>
                                        <th>Department</th>
                                        <th>Activate</th>            
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
						<td><%=j.get(0)%></td>
						<td><%=j.get(1)%></td>
						<td><%=j.get(2)%></td>
                                                <td><%=j.get(3)%></td>
                                                <td><%=j.get(4)%></td>
                                                <td><%=j.get(5)%></td>                                                
						<td><a href="activeStu?id=<%=j.get(6)%>">Activate</a></td>
					
					</tr>
	
				</tbody>	
					 <%
                                            }
                                            }
                                        %>
			
			</table>
			
			<!-- end table-->
		</div><!-- panel body-->
	</div><!-- end panel -->
</div><!-- end col-md-9 -->


    </div>
<!-- end content -->    
    
<hr/>
<%@include file="includes/myFooter.jsp" %>

    </body>
</html>
