package org.apache.jsp.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JuniorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Client/included/header.jsp");
    _jspx_dependants.add("/Client/included/JMenu.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Junior Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("\t\tpadding-top:55px;\n");
      out.write("\t\tpadding-bottom:54px;\n");
      out.write("}\n");
      out.write(".fa-book\n");
      out.write("{\n");
      out.write("\t\tcolor:#333;\n");
      out.write("}\n");
      out.write("nav\n");
      out.write("{\n");
      out.write("\tbackground-color:#344152;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write(".nav, .navbar-nav > li > a\n");
      out.write("{\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\t}\n");
      out.write(".navbar .navbar-nav > li > a:hover, .navbar .navbar-nav > li > a:focus {\n");
      out.write("\tbackground-color:#344152;\n");
      out.write("\tcolor:white;\n");
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
      out.write("\n");
      out.write("blockquote{\n");
      out.write(" \n");
      out.write("  padding-left: 1.5rem;\n");
      out.write("  border-left: 5px solid   #4d79ff; /* Just change the color value and that's it*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
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
      out.write("            <li><a href=\"JuniorLogin.jsp\">Home</a></li>    \n");
      out.write("             \n");
      out.write("            <li><a href=\"StudentCorner.jsp\">Logout&nbsp;&nbsp;<i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></a></li> \n");
      out.write(" \t\t\n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("\t  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!--Header Ends -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("<hr />\n");

       
      /*
       HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("j_student");
       
       if(m==null)
       {
           response.sendRedirect("StudentCorner.jsp");
       }*/
       HttpSession sessionPage = request.getSession();         
       sessionPage.setAttribute("pageCall",null);
       request.setAttribute("NewsMenu",null);
       

      out.write("\n");
      out.write("\n");
      out.write("<!--Content starts-->  \n");
      out.write("\n");
      out.write("\n");
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
      out.write("                <h3><a href=\"downloadTutorial.jsp\">Tutorials</a></h3>\n");
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
      out.write("        <h3><a href=\"jobsclient.jsp\">Jobs</a></h3>\n");
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
      out.write("            <i class=\"fa fa-folder fa-3x\" aria-hidden=\"true\"></i>\n");
      out.write("            <h3><a href=\"downloadProject.jsp\">Projects</a></h3>\n");
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
      out.write("        <h3><a \n");
      out.write("                ");

                        if(request.getAttribute("NewsMenu")!=null)
                        {
                
      out.write("\n");
      out.write("                href=\"Client/newsclient.jsp\"\n");
      out.write("                ");

                    }
                    else
{
              
      out.write("\n");
      out.write("                href=\"newsclient.jsp\"\n");
      out.write("             \n");
      out.write("              ");

}
                    
      out.write("\n");
      out.write("            >News</a></h3>\n");
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
      out.write("        \n");
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
      out.write("\n");
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
      out.write("<div class=\"col-md-9\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t<h3>Welcome To Junior Corner.</h3>\n");
      out.write("\t\t\t<hr /><br />\n");
      out.write("                        <blockquote>\n");
      out.write("                            <p> This page is designed for juniors. Junior can see albums, photos, events etc. Also junior can apply for the jobs and can see tutorials and projects provided by senior users. Although, junior can not add or update any picture,event,tutorial or project.</p>\n");
      out.write("                        </blockquote>\n");
      out.write("                        \n");
      out.write("\t\t\t \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--content ends-->\n");
      out.write("        \n");
      out.write("<!-- Back To Top -->\n");
      out.write("<span id=\"top-link-block\" class=\"hidden\">\n");
      out.write("    <a href=\"#top\" class=\"well well-sm\" onclick=\"$('html,body').animate({scrollTop:0},'slow');return false;\">\n");
      out.write("        <i class=\"glyphicon glyphicon-chevron-up\"></i>\n");
      out.write("    </a>\n");
      out.write("</span>\n");
      out.write("<!-- /Back To Top Ends -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        // Only enable if the document has a long scroll bar\n");
      out.write("        // Note the window height + offset\n");
      out.write("        if ( ($(window).height() + 50) < $(document).height() ) {\n");
      out.write("            $('#top-link-block').removeClass('hidden').affix({\n");
      out.write("             // how far to scroll down before link \"slides\" into view\n");
      out.write("               offset: {top:100}\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        </script> \n");
      out.write("        \n");
      out.write("        ");
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
