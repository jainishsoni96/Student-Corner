<%-- 
    Document   : senioreditnews
    Created on : 17 May, 2017, 11:27:17 AM
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
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit News</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">
                       
                                <%
                                if(request.getAttribute("newsdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("newsdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" action="../../DemoProject/SeniorEditNews" method="post">            
                
                   <div class="form-group">
          	
                       <input type="hidden" name="jid" value="<%= j.get(0)%>" />
                       <label>News Title</label>
                       <input  type="text" value="<%= j.get(1) %>" class="form-control" name="ntitle" />
                
                </div>
                      
                      
            <div class="form-group">
          	
                    <label>Short Description</label>
                    <input  type= "textarea" value="<%= j.get(2) %>" class="form-control" name="shortdes" />
                
            </div>
        
            <div class="form-group">
          	
                        <label>Description</label>
    			<input  type="textarea" value="<%= j.get(3) %>" class="form-control" name="longdes" />
                
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
<%@include file="Footer/Footer.jsp" %>
    </body>
</html>
