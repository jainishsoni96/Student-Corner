package org.apache.jsp.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Corner.Corner;
import java.util.Iterator;
import java.util.ArrayList;

public final class seniorProject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Client/included/Sheader.jsp");
    _jspx_dependants.add("/Client/included/SMenu.jsp");
    _jspx_dependants.add("/Client/Footer/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Senior Corner</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!--Header Starts -->\n");
      out.write("<nav class=\"navbar navbar-fixed-top\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a href=\"#\" class=\"navbar-brand text-uppercase\" style=\"color:#FFF;letter-spacing:3px;\"><i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i>&nbsp;Student Corner</a>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class = \"collapse navbar-collapse\" id = \"navbar\">\n");
      out.write("\t\t\t<ul class = \"nav navbar-nav navbar-right\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li><a href=\"SeniorLogin.jsp\">Home</a></li>    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class = \"dropdown\">\n");
      out.write("            \t<a href = \"#\" class = \"dropdown-toggle\" data-toggle = \"dropdown\">\n");
      out.write("               \t\t<label style=\"color:#FFF;\">Job</label>\n");
      out.write("               \t\t<b class = \"caret\" style=\"color:#FFF;\"></b>\n");
      out.write("            \t</a>\n");
      out.write("            \n");
      out.write("            \t<ul class = \"dropdown-menu\">\n");
      out.write("                    <li><a href = \"seniorJobs.jsp\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i>&nbsp;Add Job</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorJobs.jsp\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("&nbsp;Edit Job</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorJobs.jsp\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i>&nbsp;Delete Job</a></li>\n");
      out.write("               \n");
      out.write("            \t</ul>\n");
      out.write("            \n");
      out.write("         \t</li>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class = \"dropdown\">\n");
      out.write("            \t<a href = \"#\" class = \"dropdown-toggle\" data-toggle = \"dropdown\">\n");
      out.write("               \t\tProject\n");
      out.write("               \t\t<b class = \"caret\"></b>\n");
      out.write("            \t</a>\n");
      out.write("            \n");
      out.write("            \t<ul class = \"dropdown-menu\">\n");
      out.write("                \t<li><a href = \"seniorProject.jsp\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i>&nbsp;Add Project</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorProject.jsp\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("&nbsp;Edit Project</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorProject.jsp\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i>&nbsp;Delete Project</a></li>\n");
      out.write("               \n");
      out.write("            \t</ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li class = \"dropdown\">\n");
      out.write("            \t<a href = \"#\" class = \"dropdown-toggle\" data-toggle = \"dropdown\">\n");
      out.write("               \t\tTutorial\n");
      out.write("               \t\t<b class = \"caret\"></b>\n");
      out.write("            \t</a>\n");
      out.write("            \n");
      out.write("            \t<ul class = \"dropdown-menu\">\n");
      out.write("               \t\t<li><a href = \"seniorTutorial.jsp\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i>&nbsp;Add Tutorial</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorTutorial.jsp\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("&nbsp;Edit Tutorial</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorTutorial.jsp\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i>&nbsp;Delete Tutorial</a></li>\n");
      out.write("               \n");
      out.write("            \t</ul>\n");
      out.write("            \n");
      out.write("         \t</li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class = \"dropdown\">\n");
      out.write("            \t<a href = \"#\" class = \"dropdown-toggle\" data-toggle = \"dropdown\">\n");
      out.write("               \t\tGallery\n");
      out.write("               \t\t<b class = \"caret\"></b>\n");
      out.write("            \t</a>\n");
      out.write("            \n");
      out.write("            \t<ul class = \"dropdown-menu\">\n");
      out.write("               \t\t<li><a href = \"seniorGallery.jsp\"><i class=\"fa fa-plus\" aria-hidden=\"true\"></i>&nbsp;Add Image</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorGallery.jsp\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("&nbsp;Edit Image</a></li>\n");
      out.write("               \t\t<li><a href = \"seniorGallery.jsp\"><i class=\"fa fa-trash\" aria-hidden=\"true\"></i>&nbsp;Delete Image</a></li>\n");
      out.write("               \n");
      out.write("            \t</ul>\n");
      out.write("            \n");
      out.write("         \t</li>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("             <li><a href=\"StudentCorner.jsp\">Logout&nbsp;&nbsp;<i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></a></li> \n");
      out.write("        \t\n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("\t  </div>\n");
      out.write("</nav>\n");
      out.write("<!--Header Ends -->");
      out.write("\n");
      out.write("        <hr />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- content -->\n");
      out.write("\n");
      out.write("     \n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\t<div class=\"col-md-3\">\n");
      out.write("    \n");
      out.write("    <div class=\"panel-group\">\n");
      out.write("    \n");
      out.write("    <!--Tutorials Starts -->\n");
      out.write("    <div class=\"panel panel-default text-center\">\n");
      out.write("    \t<div class=\"panel-body\" style=\"background-color:\">\n");
      out.write("        \t<i class=\"fa fa-book fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("                <h3><a href=\"seniordownloadTutorial.jsp\">Tutorials</a></h3>\n");
      out.write("            \n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <h5>50</h5>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <!--Tutorials Ends -->\n");
      out.write("    \n");
      out.write("       <!--Job Starts -->\n");
      out.write("     <div class=\"panel panel-default text-center\">\n");
      out.write("    \t<div class=\"panel-body\">\n");
      out.write("        <i class=\"fa fa-briefcase fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("        <h3><a href=\"jobssenior.jsp\">Jobs</a></h3>\n");
      out.write("            \n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <h5>50</h5>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <!--Job Ends -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--Project Starts -->\n");
      out.write("     <div class=\"panel panel-default text-center\">\n");
      out.write("    \t<div class=\"panel-body\">\n");
      out.write("        <i class=\"fa fa-folder fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("        <h3><a href=\"seniordownloadProject.jsp\">Projects</a></h3>\n");
      out.write("            \n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <h5>50</h5>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <!--Project Ends -->\n");
      out.write("        \n");
      out.write("    <!--News Starts -->\n");
      out.write("        <div class=\"panel panel-default text-center\">\n");
      out.write("    \t<div class=\"panel-body\">\n");
      out.write("        <i class=\"fa fa-newspaper-o fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("            \n");
      out.write("        <h3><a ");

                        if(request.getAttribute("NewsMenu")!=null)
                        {
                
      out.write("\n");
      out.write("                href=\"Client/seniornewsclient.jsp\"\n");
      out.write("                ");

                    }
                    else
                    {
              
      out.write("\n");
      out.write("                href=\"seniornewsclient.jsp\"\n");
      out.write("             \n");
      out.write("              ");

                    }
               
      out.write("\n");
      out.write("            \n");
      out.write("               >News</a></h3>\n");
      out.write("            \n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <h5>50</h5>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    <!--News Ends -->\n");
      out.write("     \n");
      out.write("    <!--Gallery Starts -->\n");
      out.write("     <div class=\"panel panel-default text-center\">\n");
      out.write("    \t<div class=\"panel-body\">\n");
      out.write("        <i class=\"fa fa-picture-o fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("        <h3><a href=\"../../DemoProject/showAlbam\">Gallery</a></h3>\n");
      out.write("            \n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <h5>50</h5>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <!--Gallery Ends -->\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!--Search Starts -->    \n");
      out.write("\n");
      out.write("<!--<div class=\"col-sm-3 col-md-3 pull-right\">\n");
      out.write("\t<div class=\"form-group\">\n");
      out.write("        \n");
      out.write("        <div class=\"input-group\">\n");
      out.write("        <form class=\"navbar-form\" role=\"search\">\n");
      out.write("         <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\n");
      out.write("            <div class=\"input-group-btn\">\n");
      out.write("                <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("<!--Search Ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-md-9\"><!-- col-md-9 -->\n");
      out.write("\t<div class=\"panel panel-default\"><!-- panel start -->\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"panel-body\"><!-- panel body -->\n");
      out.write("\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t<p style=\"font-size:25px;\">Projects</p> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-6 text-right\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\"  data-toggle=\"modal\" data-target=\"#myModal\">Add Record</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- modal -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- end modal -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- modal  -->\n");
      out.write("\t\t\t <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</span></button>\n");
      out.write("          <h4 class=\"modal-title\">Add Project</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("\t\t  <div class=\"col-md-6\">\n");
      out.write("                      <form role=\"form\" enctype=\"multipart/form-data\" method=\"post\" action=\"../../DemoProject/SeniorprojectServ\">\n");
      out.write("                                 ");

                                  request.setAttribute("editproject", null);
                                  
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                        <label>Project Title</label>\n");
      out.write("                                        <input type=\"text\" name=\"p_title\" class=\"form-control\" />\n");
      out.write("\t\t\t\t\t<label>Project Description</label>\n");
      out.write("                                        <textarea class=\"form-control\" name=\"p_desc\"></textarea>\n");
      out.write("                                        <label>Department</label>\n");
      out.write("                                        <select name=\"department\" class=\"form-control\">\n");
      out.write("                                         <option>--Select Your Department--</option>\n");
      out.write("                                            ");
  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from department");
                                                while(rs.next())
                                                {

                                            
      out.write("\n");
      out.write("                                         <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                            ");

                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label>Project Technology</label>\n");
      out.write("                                        <select name=\"cat_name\" class=\"form-control\">\n");
      out.write("                                         <option>--Select Your Project Technology--</option>\n");
      out.write("                                            ");
  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from category");
                                                while(rs.next())
                                                {

                                            
      out.write("\n");
      out.write("                                         <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write("</option>\n");
      out.write("                                            ");

                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label>Upload File</label>\n");
      out.write("                                        <input type=\"file\" name=\"u_file\" class=\"form-control\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t  </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("         \n");
      out.write("\t\t  \n");
      out.write("            <input type=\"submit\" value=\"Add\" class=\"btn btn-danger\">\n");
      out.write("\t\t  </form> \n");
      out.write("                  <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\t\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- end-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- table -->\n");
      out.write("\t\t\t<br /><br />\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<br /><br />\n");
      out.write("\t\t\t<table class=\"table table-striped \">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Project Title</th>\n");
      out.write("                                        <th>Project Description</th>\n");
      out.write("                                        <th>Project Technology</th>\n");
      out.write("\t\t\t\t\t<th>File</th>\n");
      out.write("\t\t\t\t\t<th>Edit </th>\n");
      out.write("\t\t\t\t\t<th>Delete</th>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("                                    ");

                                    if(request.getAttribute("varname")!=null)
                                     {
                                    ArrayList<String> a2= (ArrayList<String>)request.getAttribute("varname");
    
                                    Iterator i1 = a2.iterator();
                
                                    while(i1.hasNext())
                                    {
                                     ArrayList j = (ArrayList)i1.next();    
                
                                     
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(j.get(1) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(j.get(2) );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(j.get(3) );
      out.write("</td>\n");
      out.write("                                                \n");
      out.write("                                                <td><a href=\"downloadProServ?id=");
      out.print(j.get(4));
      out.write("\">Download</a></td>\n");
      out.write("\t\t\t\t\t\t<td><a href=\"EditProject?id=");
      out.print(j.get(0));
      out.write("\">Edit</a></td>\n");
      out.write("\t\t\t\t\t\t<td><a href=\"ProjectDel?id=");
      out.print(j.get(0));
      out.write("\" onclick=\"return confirm('Sure Want To Delete?');\">Delete</a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

                                            }
                                            }
                                        
      out.write("\n");
      out.write("\t\t\t\t</tbody>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- end table-->\n");
      out.write("\t\t</div><!-- panel body-->\n");
      out.write("\t</div><!-- end panel -->\n");
      out.write("</div><!-- end col-md-9 -->\n");
      out.write("\n");
      out.write("<!-- end content -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    <!--Contact Us-->\n");
      out.write("\n");
      out.write("        <hr />\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center>\n");
      out.write("                        <i class=\"fa fa-mobile fa-5x\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center><b>Shivani Thorat-+918511588602</b></center>\n");
      out.write("                    <center><b>Jainish Soni-+91760089007</b></center>\n");
      out.write("                    <center><b>Kunj Tandel-+919033693071</b></center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center>\n");
      out.write("                        <i class=\"fa fa-map-marker fa-5x\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center><b>103, Saffron Tower,<br/> Fatehgunj, Vadodara,<br/> Gujarat, India-390002</b></center>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center>\n");
      out.write("                        <i class=\"fa fa-envelope fa-5x\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <br/><center><b>studentcorner2k17@gmail.com</b></center>\n");
      out.write("                    <center><b>www.studentcorner.co.in</b></center>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\" >\n");
      out.write("    \t\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center><a href=\"#\"><i class=\"fa fa-facebook-official fa-3x\" aria-hidden=\"true\"></i></a>\n");
      out.write("            &nbsp;\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-linkedin-square fa-3x\" aria-hidden=\"true\"></i></a></center>\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <center><a href=\"#\"><i class=\"fa fa-google-plus-official fa-3x\" aria-hidden=\"true\"></i></a>\n");
      out.write("         \t&nbsp;\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-instagram fa-3x\" aria-hidden=\"true\"></i></a></center>\n");
      out.write("        \t&nbsp;\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                    <center><b>Connect With Us</b></center>\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
