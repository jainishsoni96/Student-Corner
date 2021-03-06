<%-- 
    Document   : editdept
    Created on : 8 Apr, 2017, 2:10:47 AM
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
			<h3>Edit Department</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">
                       
                                <%
                                if(request.getAttribute("deptdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("deptdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" action="../../DemoProject/EditDept" method="post">            
                
                    <div class="form-group">
                        <input type="hidden" name="j_id" value="<%= j.get(0)%>" />
                        <label>Department Name</label>
                        <input  type="text" name="dept_name" value="<%= j.get(1) %>" class="form-control"  />
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

