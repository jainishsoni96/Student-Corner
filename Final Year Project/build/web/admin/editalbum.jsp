<%-- 
    Document   : editalbum
    Created on : 5 May, 2017, 4:40:11 PM
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
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Album</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify" />
                       
                                <%
                                if(request.getAttribute("albumdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("albumdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" enctype="multipart/form-data" action="../../DemoProject/EditAlbum" method="post">            
                
                   <div class="form-group">
          	       <img src="data:image/jpeg;base64,<%= j.get(3) %>" alt="<%= j.get(3) %>" width="100" height="100" />
			
                       <input type="hidden" name="aid" value="<%= j.get(0)%>" />
                       <label>Album Name</label>
                        <input type="text" name="aname" value="<%= j.get(1)%>" class="form-control" />
                   </div>
                   
                   <div class="form-group">
                                <label>Year</label>
                                        <select name="ayear" value="<%= j.get(2)%>" class="form-control">    
                                            <option>----Select One Option----</option>
                                            <option>2014</option>
                                            <option>2015</option>
                                            <option>2016</option>
                                            <option>2017</option>
                                        </select>
                    </div>
                    
                    <div class="form-group">                        
                         <label>Album_Path</label>
                         <input type="file" name="apath" class="form-control" value="<%= j.get(2)%>"  />
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
