<%-- 
    Document   : Sheader.jsp
    Created on : 16 May, 2017, 3:02:59 PM
    Author     : Kunj Tandel
--%>

<!--Header Starts -->
<nav class="navbar navbar-fixed-top">
      <div class="container-fluid">
      
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar" style="background-color:white;"></span>
            <span class="icon-bar" style="background-color:white;"></span>
            <span class="icon-bar" style="background-color:white;"></span>
          </button>
          <a href="#" class="navbar-brand text-uppercase" style="color:#FFF;letter-spacing:3px;"><i class="fa fa-graduation-cap" aria-hidden="true"></i>&nbsp;Student Corner</a>
          </div>
          
          <div class = "collapse navbar-collapse" id = "navbar">
			<ul class = "nav navbar-nav navbar-right">
            
            
                            <li><a href="SeniorLogin.jsp">Home</a></li>    
            
            
            <li class = "dropdown">
            	<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
               		<label style="color:#FFF;">Job</label>
               		<b class = "caret" style="color:#FFF;"></b>
            	</a>
            
            	<ul class = "dropdown-menu">
                    <li><a href = "../../DemoProject/SeniorjobServ"><i class="fa fa-plus" aria-hidden="true"></i>&nbsp;Add Job</a></li>
               		<li><a href = "../../DemoProject/SeniorjobServ"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
&nbsp;Edit Job</a></li>
               		<li><a href = "../../DemoProject/SeniorjobServ"><i class="fa fa-trash" aria-hidden="true"></i>&nbsp;Delete Job</a></li>
               
            	</ul>
            
         	</li>
            
                
            
            
            <li class = "dropdown">
            	<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
               		Project
               		<b class = "caret"></b>
            	</a>
            
            	<ul class = "dropdown-menu">
                    <li><a href = "../../DemoProject/SeniorprojectServ"><i class="fa fa-plus" aria-hidden="true"></i>&nbsp;Add Project</a></li>
               		<li><a href = "../../DemoProject/SeniorprojectServ"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
&nbsp;Edit Project</a></li>
               		<li><a href = "../../DemoProject/SeniorprojectServ"><i class="fa fa-trash" aria-hidden="true"></i>&nbsp;Delete Project</a></li>
               
            	</ul>
            </li>
            
            <li class = "dropdown">
            	<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
               		Tutorial
               		<b class = "caret"></b>
            	</a>
            
            	<ul class = "dropdown-menu">
               		<li><a href = "../../DemoProject/SeniortutServ"><i class="fa fa-plus" aria-hidden="true"></i>&nbsp;Add Tutorial</a></li>
               		<li><a href = "../../DemoProject/SeniortutServ"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
&nbsp;Edit Tutorial</a></li>
               		<li><a href = "../../DemoProject/SeniortutServ"><i class="fa fa-trash" aria-hidden="true"></i>&nbsp;Delete Tutorial</a></li>
               
            	</ul>
            
         	</li>
            
            
            <li class = "dropdown">
            	<a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
               		Gallery
               		<b class = "caret"></b>
            	</a>
            
            	<ul class = "dropdown-menu">
               		<li><a href = "../../DemoProject/SeniorgalleryServ"><i class="fa fa-plus" aria-hidden="true"></i>&nbsp;Add Image</a></li>
               		<li><a href = "../../DemoProject/SeniorgalleryServ"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
&nbsp;Edit Image</a></li>
               		<li><a href = "../../DemoProject/SeniorgalleryServ"><i class="fa fa-trash" aria-hidden="true"></i>&nbsp;Delete Image</a></li>
               
            	</ul>
            
         	</li>
            
              
             <li><a href="StudentCorner.jsp">Logout&nbsp;&nbsp;<i class="fa fa-sign-out" aria-hidden="true"></i></a></li> 
        	
      </ul>
   </div>
	  </div>
</nav>
<!--Header Ends -->