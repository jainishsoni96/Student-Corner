<%-- 
    Document   : Senioreditjobs
    Created on : 17 May, 2017, 6:28:30 AM
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
        <%@include file="included/SHeader.jsp" %>
<hr />

<%@include file="included/SMenu.jsp" %>

<!-- content -->
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Jobs</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">
                       
                                <%
                                    try{
                                if(request.getAttribute("jobsdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("jobsdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" action="../../DemoProject/SeniorEditJob" method="post">            
                
                   <div class="form-group">
          	
                       <input type="hidden" name="jid" value="<%= j.get(0)%>" />
                       <label>Job Title</label>
                       <input  type="text" value="<%= j.get(1) %>" class="form-control" name="j_title" />
                
                </div>
                      
                      
            <div class="form-group">
          	
                    <label>Company Name</label>
                    <input  type= "text" value="<%= j.get(2) %>" class="form-control" name="cmp_name" />
                
            </div>
        
            <div class="form-group">
          	
                        <label>Interview Date</label>
    			<input  type="date" value="<%= j.get(3) %>" class="form-control" name="int_date" />
                
            </div>
            
            <div class="form-group">
          	
                        <label>Job Skills</label>
    			<input  type="text" value="<%= j.get(4) %>" class="form-control" name="j_skill" />
                
            </div>
            
            <div class="form-group">
          	
                        <label>Experience</label>
    			<input  type="text" value="<%= j.get(5) %>" class="form-control" name="expr" />
                
            </div>
            
            
            <div class="form-group">
                        <label>URL</label>
	
                        <input type="text" name="url" value="<%= j.get(6)%>" class="form-control" />
            </div>            
         <input type="submit" class="btn btn-primary" value="Update" name="update" />
                  
         <%
             }
             }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
         %>
                            
             
             </p>
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