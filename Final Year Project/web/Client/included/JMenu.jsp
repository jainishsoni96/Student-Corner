<%-- 
    Document   : JMenu
    Created on : 11 May, 2017, 4:56:02 PM
    Author     : jainish
--%>

<div class="container-fluid">
    <div class="row">
	<div class="col-md-3">
    
    <div class="panel-group">
    
    <!--Tutorials Starts -->
    <div class="panel panel-default text-center">
    	<div class="panel-body" style="background-color:">
        	<i class="fa fa-book fa-3x" aria-hidden="true"></i>
                <h3><a href="downloadTutorial.jsp">Tutorials</a></h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
    <!--Tutorials Ends -->
    
       <!--Job Starts -->
     <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-briefcase fa-3x" aria-hidden="true"></i>
        <h3><a href="jobsclient.jsp">Jobs</a></h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
    <!--Job Ends -->
    
    
    <!--Project Starts -->
     <div class="panel panel-default text-center">
    	<div class="panel-body">
            <i class="fa fa-folder fa-3x" aria-hidden="true"></i>
            <h3><a href="downloadProject.jsp">Projects</a></h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
    <!--Project Ends -->
        
    <!--News Starts -->
        <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-newspaper-o fa-3x" aria-hidden="true"></i>
            
        <h3><a 
                <%
                        if(request.getAttribute("NewsMenu")!=null)
                        {
                %>
                href="Client/newsclient.jsp"
                <%
                    }
                    else
{
              %>
                href="newsclient.jsp"
             
              <%
}
                    %>
            >News</a></h3>
            
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
        </div>
    <!--News Ends -->
     
    <!--Gallery Starts -->
     <div class="panel panel-default text-center">
    	<div class="panel-body">
        <i class="fa fa-picture-o fa-3x" aria-hidden="true"></i>
        <h3><a href="../../DemoProject/showAlbam">Gallery</a></h3>
        
            <hr />
            
            <h5>50</h5>
            
            
        </div>
       
    </div>
    <!--Gallery Ends -->
    
    </div>
    </div>


<!--Search Starts -->    

<!--<div class="col-sm-3 col-md-3 pull-right">
	<div class="form-group">
        
        <div class="input-group">
        <form class="navbar-form" role="search">
         <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
            <div class="input-group-btn">
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </div>
        </form>
        </div>
        
        </div>
</div>
-->
<!--Search Ends -->

