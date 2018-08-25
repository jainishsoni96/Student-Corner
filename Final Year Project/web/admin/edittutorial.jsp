<%-- 
    Document   : editgallery
    Created on : 10 May, 2017, 6:02:27 PM
    Author     : jainish
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
			<h3>Edit Tutorial</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify" />
                       
                                <%
                                if(request.getAttribute("tutorialdetail")!=null)
                                    {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("tutorialdetail");
    
                                    Iterator i1 = a2.iterator();
                
                                while(i1.hasNext())
                                    {
                                    ArrayList j = (ArrayList)i1.next();
                                 %>
               <form role="form" enctype="multipart/form-data" action="../../DemoProject/EditTutorial" method="post">            

                   <div class="form-group">
          	       
                       <input type="hidden" name="id" value="<%= j.get(0)%>" />
                                        <label>Subject</label>
                                        <select name="subject" value="<%= j.get(1)%>" class="form-control">    
                                            <option>----Select One Option----</option>
                                            <%  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from subject");
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
                                        <label>Tutorial Title</label>
                                        <input type="text" name="tut_title" value="<%= j.get(2)%>" class="form-control" />
                                        </div>
                                        
                                        <div class="form-group">
                                        <label>File_Path</label>
                                        <input type="file" name="fpath" class="form-control" value="<%= j.get(3)%>" />
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
<%@include file="includes/myFooter.jsp" %>
    </body>
                       
                       
</html>
                 