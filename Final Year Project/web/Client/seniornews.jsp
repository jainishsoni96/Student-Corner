<%-- 
    Document   : seniornews
    Created on : 17 May, 2017, 11:20:28 AM
    Author     : Kunj Tandel
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Senior Corner</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css" />
  <link rel="stylesheet" href="css/font-awesome.css" />
  <link rel="stylesheet" href="css/font-awesome.min.css" />

    </head>
    <body>
        <%@include file="included/Sheader.jsp" %>
        <hr />
        <%@include file="included/SMenu.jsp" %>
        
<!-- content -->
<div class="col-md-9"><!-- col-md-9 -->
	<div class="panel panel-default"><!-- panel start -->
	
		<div class="panel-body"><!-- panel body -->
			<div class="col-md-12">
				<div class="col-md-6">
					<p style="font-size:25px;">News</p> 
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
          <h4 class="modal-title">Add News</h4>
        </div>
        <div class="modal-body">
          <div class="container">
		  <div class="col-md-6">
                      <form role="form" method="post" action="../../DemoProject/SeniornewServ">
			
				<div class="form-group">
					<label>News Title</label>
                                        <input type="text" name="title" class="form-control" />
					<label>Short Description</label>
					<input type="text" name="shortdes" class="form-control" />
					<label>Description</label>
                                        <textarea class="form-control" name="longdes"></textarea>
	
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
			<table class="table table-striped table-responsive">
				<thead>
					<tr>
					<th>News Title</th>
					<th>Short Description</th>
					<th>Description</th>
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
						<td><a href="SeniorEditNews?id=<%= j.get(0) %>">Edit</a></td>
						<td><a href="SeniorNewsDel?id=<%= j.get(0) %>" onclick="return confirm('Sure Want To Delete?');">Delete</a></td>
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


    </div>
<!-- end content -->    
    
<hr/>
<%@include file="Footer/Footer.jsp" %>



    </body>
</html>
