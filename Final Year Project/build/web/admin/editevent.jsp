<%-- 
    Document   : editevent
    Created on : 12 May, 2017, 9:55:34 AM
    Author     : Kunj Tandel
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
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Album</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify" />
                       
                                <%
                                if(request.getAttribute("eventdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("eventdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" enctype="multipart/form-data" action="../../DemoProject/EditEvent" method="POST">            
                
                   <div class="form-group">
          	       <img src="data:image/jpeg;base64,<%= j.get(5) %>" alt="<%= j.get(5) %>" width="100" height="100" />
			
                       <input type="hidden" name="eid" value="<%= j.get(0)%>" />
                      <label>Event Name</label>
                        <input type="text" name="ename" value="<%= j.get(1)%>" class="form-control" />
                   </div>
                   
                   <div class="form-group">
                        <label>Description</label>
                                        <textarea name="des" cols="20" rows="5" class="form-control"><%= j.get(2)%></textarea>        
                    </div>
                    
                   <div class="form-group">
                       <label>Event Date</label>
                       <input type="date" placeholder="DD/MM/YYYY" value="<%= j.get(3)%>" name="edate" class="form-control" />
                       
                   </div>
                    <div class="form-group">                        
                         <label>Upload File</label>
                         <input type="file" name="efile" class="form-control" />
                    </div>
                    
                    <div class="form-group">
                        <label>Venue</label>
                        <input type="text" name="venue" value="<%= j.get(4)%>" class="form-control" />
                    
                    
                    </div>
            <input type="submit" class="btn btn-primary" value="Update" name="update" />
                  
                                            <%
                                                            }
                                                        }
                                            %>
                            
             
            
             </form>
		</div>
	</div>
</div>

<!-- end content -->
<!-- end content menu -->
	
</div>
<hr />
<%@include file="includes/myFooter.jsp" %>
    </body>
                       
                       
</html>
