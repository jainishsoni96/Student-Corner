<%-- 
    Document   : Gallery
    Created on : 22 Feb, 2017, 5:44:34 PM
    Author     : jainish
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*" %>
<%@page  import="Corner.Corner" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
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
					<p style="font-size:25px;">Gallery</p> 
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
          <h4 class="modal-title">Add Gallery</h4>
        </div>
        <div class="modal-body">
          <div class="container">
		  <div class="col-md-6">
		  	<form role="form" enctype="multipart/form-data" action="../../DemoProject/galleryServ" method="post">
			
				<div class="form-group">
                                        <%
                                            request.setAttribute("editGallery",null);
                                        %>
				       <label>Album Name</label>
                                        <select name="album" class="form-control">    
                                            <option>----Select One Option----</option>
                                            <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from album");
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
                                        <label>Gallery Pic Name</label>
                                        <input type="text" name="gname" class="form-control" />
                                 
                                        <label>Image_Path</label>
                                        <input type="file" name="gpath" class="form-control"  />
                                        
				</div>
			
			</div>
		  </div>
        </div>
        <div class="modal-footer">
         
		  
		  <input type="submit" value="Add" name="Add" class="btn btn-danger">
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
					<th>Album Name</th>
                                        <th>Gallery Title</th>
                                        <th>Gallery Pic</th>
					<th>Edit</th>
					<th>Delete</th>
					
					</tr>
				</thead>
				
				<tbody>
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
					<tr>
						<td><%=j.get(1) %></td>
                                                <td><%=j.get(2) %></td>
                                                <td><img src="data:image/jpeg;base64,<%= j.get(3) %>" alt="<%= j.get(3) %>" width="100" height="100" /></td>
						<td><a href="EditGallery?id=<%= j.get(0) %>">Edit</a></td>
						<td><a href="GalleryDel?id=<%= j.get(0)%>" onClick="return confirm('Sure Want To Delete?');">Delete</a></td>
					</tr>
					<%
                                                }
                                            }
                                        }
                                        catch(Exception e)
                                            {
                                                e.printStackTrace();
                                            }
                                        %>
				</tbody>	
			
			</table>
			
			<!-- end table-->
		</div><!-- panel body-->
	</div><!-- end panel -->
</div><!-- end col-md-9 -->
   
<!-- end content -->
    
    
    
 <!-- Back To Top -->
<span id="top-link-block" class="hidden">
    <a href="#top" class="well well-sm" onClick="$('html,body').animate({scrollTop:0},'slow');return false;">
        <i class="glyphicon glyphicon-chevron-up"></i>
    </a>
</span>
<!-- /Back To Top Ends -->
</hr> 
    
<%@include file="includes/myFooter.jsp" %>

    </body>
    
 <!--Script For Back To Top-->
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
<!--Script For Back To Top ends-->

    
    
</html>
