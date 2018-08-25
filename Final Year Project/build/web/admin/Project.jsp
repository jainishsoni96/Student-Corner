<%-- 
    Document   : Project.jsp
    Created on : 22 Feb, 2017, 6:35:42 PM
    Author     : Kunj Tandel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Corner.Corner"%>
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
					<p style="font-size:25px;">Projects</p> 
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
          <h4 class="modal-title">Add Project</h4>
        </div>
        <div class="modal-body">
          <div class="container">
		  <div class="col-md-6">
                      <form role="form" enctype="multipart/form-data" method="post" action="../../DemoProject/projectServ">
                                 <%
                                  request.setAttribute("editproject", null);
                                  %>
				<div class="form-group">
                                        <label>Project Title</label>
                                        <input type="text" name="p_title" class="form-control" />
					<label>Project Description</label>
                                        <textarea class="form-control" name="p_desc"></textarea>
                                        <label>Department</label>
                                        <select name="department" class="form-control">
                                         <option>--Select Your Department--</option>
                                            <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from department");
                                                while(rs.next())
                                                {

                                            %>
                                         <option value="<%=rs.getString(1)%>"><%=rs.getString(2)%></option>
                                            <%
                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             %>
                                        </select>
                                        <label>Project Technology</label>
                                        <select name="cat_name" class="form-control">
                                         <option>--Select Your Project Technology--</option>
                                            <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from category");
                                                while(rs.next())
                                                {

                                            %>
                                         <option value="<%=rs.getString(1)%>"><%=rs.getString(3)%></option>
                                            <%
                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             %>
                                        </select>
                                        <label>Upload File</label>
                                        <input type="file" name="u_file" class="form-control" />
				</div>
			
			</div>
		  </div>
        </div>
        <div class="modal-footer">
         
		  
            <input type="submit" value="Add" class="btn btn-danger">
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
			<table class="table table-striped ">
				<thead>
					<tr>
					<th>Project Title</th>
                                        <th>Project Description</th>
                                        <th>Project Technology</th>
					<th>File</th>
					<th>Edit </th>
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
                                                
                                                <td><a href="downloadProServ?id=<%=j.get(4)%>">Download</a></td>
						<td><a href="EditProject?id=<%=j.get(0)%>">Edit</a></td>
						<td><a href="ProjectDel?id=<%=j.get(0)%>" onclick="return confirm('Sure Want To Delete?');">Delete</a></td>
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
<%@include file="includes/myFooter.jsp" %>

    </body>
</html>