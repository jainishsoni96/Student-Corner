<%-- 
    Document   : editproject
    Created on : 14 Apr, 2017, 7:17:34 AM
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
<div class="col-md-9">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Project</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">
                       
                                <%
                                if(request.getAttribute("projectdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("projectdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
                        <form role="form" enctype="multipart/form-data" action="../../DemoProject/EditProject" method="post">            
                
                    <div class="form-group">
                        <input type="hidden" name="j_id" value="<%= j.get(0)%>" />
                         <label>Project Title</label>
                         <input type="text" name="p_title" value="<%= j.get(3)%>" class="form-control" />
	         	 <label>Project Description</label>
                         <textarea class="form-control" name="p_desc"><%= j.get(4)%></textarea>
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
                                        <input type="file" name="u_file" value="<%= j.get(5)%>" class="form-control" />

                    </div>
            
         <input type="submit" class="btn btn-primary" value="Update" name="update" />
                  
         <%
             }
             }
         %>
                            
             
             </p>
             </form>
		</div>
	</div>
</div>

<!-- end content >
<!-- end content menu -->
	
</div>
<hr/>
        <%@include file="includes/myFooter.jsp" %>
    </body>
</html>