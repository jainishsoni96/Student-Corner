<%-- 
    Document   : senioreditgallery
    Created on : 17 May, 2017, 12:51:16 PM
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
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Gallery</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify" />
                       
                                <%
                                if(request.getAttribute("gallerydetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("gallerydetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" enctype="multipart/form-data" action="../../DemoProject/SeniorEditGallery" method="post">            

                   <div class="form-group">
          	       <img src="data:image/jpeg;base64,<%= j.get(3) %>" alt="<%= j.get(3) %>" width="100" height="100" />
			
                       <input type="hidden" name="id" value="<%= j.get(0)%>" />
                       <label>Album Name</label>
                                        <select name="album" value="<%= j.get(1)%>" class="form-control">    
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
                   </div>
                                        <div class="form-group">
                                        <label>Gallery Pic Name</label>
                                        <input type="text" name="gname" value="<%= j.get(2)%>" class="form-control" />
                                        </div>
                                        
                                        <div class="form-group">
                                        <label>Image_Path</label>
                                        <input type="file" name="gpath" class="form-control" value="<%= j.get(3)%>" />
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
	

<hr />
<%@include file="Footer/Footer.jsp" %>
    </body>
                       
                       
</html>
