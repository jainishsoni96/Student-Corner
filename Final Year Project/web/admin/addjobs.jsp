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



<!-- content -->
<div class="col-md-4">
</div>
<div class="col-md-3">
	<div class="panel panel-default">
	
		<div class="panel-body">
			<h3>Edit Jobs</h3>
			<hr /><br />
			<p style="line-height:30px;" class="text-justify">
                       
                        <form role="form" action="../../DemoProject/jobServ" method="post">
			
				<div class="form-group">
					<label>Jobs Title</label>
                                        <input type="text" name="j_title" class="form-control" />
					<label>Company Name</label>
                                        <input type="text" name="cmp_name" class="form-control" />
					<label>Interview Date</label>
                                        <input type="date" class="form-control" name="int_date" />
                                        <label>Job Skills</label>
                                        <input type="text" name="j_skill" class="form-control" />
                                        <label>Experience</label>
					<input type="text" name="expr" class="form-control" />
                                        <label>Posted by</label>
					<input type="text" name="posted_by" class="form-control" />
                                        <label>URL</label>
					<input type="text" name="url" class="form-control" />
                                        
                                        <input type="submit" value="Add" name="sub" class="btn btn-danger"/>
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