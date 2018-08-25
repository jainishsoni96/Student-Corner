package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/includes/myHeader.jsp");
    _jspx_dependants.add("/admin/includes/myMenu.jsp");
    _jspx_dependants.add("/admin/includes/myFooter.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Corner</title>    \n");
      out.write("      \n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("       ");
 
         /*
           HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("admin");
       if(m==null)
       {
           response.sendRedirect("../Client/StudentCorner.jsp");
       }
           
           */
         HttpSession sessionPage = request.getSession();         
         sessionPage.setAttribute("pageCall",null);
       
      out.write("\n");
      out.write("        ");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("\t\tpadding-top:44px;\n");
      out.write("\t\tpadding-bottom:54px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("nav\n");
      out.write("{\n");
      out.write("\tbackground-color:#344152;\n");
      out.write("}\n");
      out.write("#top-link-block.affix-top {\n");
      out.write("    position: absolute; /* allows it to \"slide\" up into view */\n");
      out.write("    bottom: -82px;\n");
      out.write("    left: 10px;\n");
      out.write("}\n");
      out.write("#top-link-block.affix {\n");
      out.write("    position: fixed; /* keeps it on the bottom once in view */\n");
      out.write("    bottom: 18px;\n");
      out.write("    right: 10px;\n");
      out.write("}\n");
      out.write("#wowslider-container8{\n");
      out.write("\t\n");
      out.write("\tpadding-top:8px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Header Starts -->\n");
      out.write("<nav class=\"navbar navbar-fixed-top\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("          \n");
      out.write("         <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("          </button>\n");
      out.write("              <a href=\"Client/StudentCorner.jsp\" class=\"navbar-brand text-uppercase\" style=\"color:#FFF;letter-spacing:3px;\"><i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i>&nbsp;Student Corner</a>\n");
      out.write("          \n");
      out.write("          </div>\t\n");
      out.write("\t\t<div class = \"collapse navbar-collapse\" id = \"navbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li style=\"padding-top:5px; padding-left:5px; padding-right:5px;\">\n");
      out.write("\t\t\t<li><a href=\"#\" style=\"font-size:18px;\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;Admin Panel </a></li>\n");
      out.write("                        <li><a href=\"../Client/StudentCorner.jsp\" style=\"font-size:18px;\">Logout</a></li>\n");
      out.write("\t\t\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("</nav>    \n");
      out.write("<!-- header ends-->");
      out.write("\n");
      out.write("<hr />\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("\t\tpadding-top:44px;\n");
      out.write("\t\tpadding-bottom:54px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("nav\n");
      out.write("{\n");
      out.write("\tbackground-color:#344152;\n");
      out.write("}\n");
      out.write("#top-link-block.affix-top {\n");
      out.write("    position: absolute; /* allows it to \"slide\" up into view */\n");
      out.write("    bottom: -82px;\n");
      out.write("    left: 10px;\n");
      out.write("}\n");
      out.write("#top-link-block.affix {\n");
      out.write("    position: fixed; /* keeps it on the bottom once in view */\n");
      out.write("    bottom: 18px;\n");
      out.write("    right: 10px;\n");
      out.write("}\n");
      out.write("#wowslider-container8{\n");
      out.write("\t\n");
      out.write("\tpadding-top:8px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- content menu -->\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<!-- menu -->\n");
      out.write("<div class=\"col-md-3\">\n");
      out.write("\t<ul class=\"list-group\">\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/albumServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Album</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/deptServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Department</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/newServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;News</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/galleryServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Gallery</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/signupServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Student</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/staffServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Staff</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/subjServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Subject</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/jobServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Jobs</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/tutServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Tutorial</a></li>                \n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/projectServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Projects</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/eventServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Events</a></li>\n");
      out.write("                <li class=\"list-group-item\"><a href=\"../../DemoProject/categoryServ\"><span class=\"glyphicon glyphicon-chevron-right\"></span>&nbsp;Category</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("<!-- end menu -->");
      out.write("\n");
      out.write("\n");
      out.write("<!-- content -->\n");
      out.write("<div class=\"col-md-9\">\n");
      out.write("\t<div class=\"panel panel-default\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t<h3>Welcome To Student Corner</h3>\n");
      out.write("\t\t\t<hr /><br />\n");
      out.write("\t\t\t<p style=\"line-height:30px;\" class=\"text-justify\">The system is specially designed for creating a healthy relation between the faculties and students as well as alumni(seniors) and the students(juniors). It is more inclined towards the social networking website which provides a better interface as well as some advanced features. Using this website students can directly interact with faculties of college respective of their departments. It will manage all the details and records of the faculties and alumni as well as the students of an institute. We have introdhe unique features which will be useful for the students, alumni and faculty members. The main motto behind this is to create a system which not only help users to communicate with each other but also to enhance their knowledge and spread it.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- end content >\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-fixed-bottom\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("      \r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("          \r\n");
      out.write("         <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </div>\t\r\n");
      out.write("\t\t<div class = \"collapse navbar-collapse\" id = \"navbar\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("                        <li style=\"padding-top:5px; padding-left:5px; padding-right:5px;\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-copyright\" aria-hidden=\"true\">STUDENT CORNER</i>\t\t\t\r\n");
      out.write("                        \r\n");
      out.write("                       \t\t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("</nav>   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end content menu -->\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
