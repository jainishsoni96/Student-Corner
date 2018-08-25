package org.apache.jsp.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Corner.Corner;

public final class StudentCorner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Corner</title>\n");
      out.write("      \n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/font-awesome.css\" />\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("    \n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"engine0/style.css\" />\n");
      out.write("\t<!--script type=\"text/javascript\" src=\"engine0/jquery.js\"></script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"engine0/style.css\" />\n");
      out.write("\t<!--script type=\"text/javascript\" src=\"engine0/jquery.js\"></script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section --></head>\n");
      out.write("    <body>\n");
      out.write("\t\n");
      out.write("        <style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("\t\tpadding-top:54px;\n");
      out.write("\t\tpadding-bottom:54px;\n");
      out.write("\t\n");
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
      out.write("\t\n");
      out.write("\t}\n");
      out.write(".navbar .navbar-nav > li > a:hover, .navbar .navbar-nav > li > a:focus {\n");
      out.write("\tbackground-color:#344152;\n");
      out.write("\t\n");
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
      out.write("#wowslider-container8{\n");
      out.write("\t\n");
      out.write("\tpadding-top:8px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"engine0/style.css\" />\n");
      out.write("\t<!--script type=\"text/javascript\" src=\"engine0/jquery.js\"></script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t</script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"engine8/style.css\" />\n");
      out.write("\t<!--script type=\"text/javascript\" src=\"engine8/jquery.js\"></script-->\n");
      out.write("\t<!-- End WOWSlider.com HEAD section --></head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

       HttpSession session4 = request.getSession(false); 
       String m = (String)session4.getAttribute("pageCall"); 
       if(m==null)
       {
    
      out.write("\n");
      out.write("    ");

       }
       else
       {
            if(m.equals("hello"))
            {
    
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        alert(\"Invalid User or Pwd\");\n");
      out.write("    </script>\n");
      out.write("    ");

        }
        else if(m.equals("register"))
        {
    
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        alert(\"Registration Successfully Done\");\n");
      out.write("    </script>\n");
      out.write("    ");

        }    
    
      }
     
      out.write(" \n");
      out.write("<!--Header Starts -->\n");
      out.write("<nav class=\"navbar navbar-fixed-top\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("      \n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("          \n");
      out.write("<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("            <span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a href=\"#\" class=\"navbar-brand text-uppercase\" style=\"color:#FFF;letter-spacing:3px;\"><i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i>&nbsp;Student Corner</a>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("       <div class = \"collapse navbar-collapse\" id = \"navbar\">\n");
      out.write(" \t      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li style=\"padding-top:5px; padding-left:5px; padding-right:5px;\">\n");
      out.write("              <form class=\"form-inline\" role=\"form\" method=\"post\" action=\"../loginServ\" >\n");
      out.write("                  \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("      \t\t\t\t\n");
      out.write("                        <input type=\"text\" required=\"true\" class=\"form-control\" id=\"uname\" name=\"uname\" placeholder=\"Enter Enrolment No\">\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("      \t\t\t\t\n");
      out.write("                        <input type=\"password\" required=\"true\" class=\"form-control\" id=\"pwd\" name=\"pwd\" placeholder=\"Enter Password\">\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t   \n");
      out.write("      \t\t\t\t   \n");
      out.write("    \t\t\t\t\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-warning form-control\" value=\"Login\" name=\"login\">\n");
      out.write("  \t\t\t</form>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!--Header Ends -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Start WOWSlider.com BODY section --> <!-- add to the <body> of your page -->   \n");
      out.write("        <div id=\"wowslider-container0\">\n");
      out.write("\t<div class=\"ws_images\"><ul>\n");
      out.write("                <!-- data0/images/aavishkar4.jpg -->\n");
      out.write("\t\t<li><img src=\"data0/images/aavishkar4.jpg\" alt=\"Aavishkar\" title=\"Aavishkar\" id=\"wows0_0\"/></li>\n");
      out.write("\t\t<li><img src=\"data0/images/blood3.jpg\" alt=\"Blood Donation\" title=\"Blood Donation\" id=\"wows0_1\"/></li>\n");
      out.write("\t\t<li><img src=\"data0/images/social4.jpg\" alt=\"responsive slider\" title=\"Social Cause\" id=\"wows0_2\"/></li>\n");
      out.write("\t\t<li><img src=\"data0/images/vision2.jpg\" alt=\"Vision\" title=\"Vision\" id=\"wows0_3\"/></li>\n");
      out.write("\t</ul></div>\n");
      out.write("\t<div class=\"ws_bullets\"><div>\n");
      out.write("\t\t<a href=\"#\" title=\"Aavishkar\"><span><img src=\"data0/tooltips/aavishkar4.jpg\" alt=\"Aavishkar\"/>1</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Blood Donation\"><span><img src=\"data0/tooltips/blood3.jpg\" alt=\"Blood Donation\"/>2</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Social Cause\"><span><img src=\"data0/tooltips/social4.jpg\" alt=\"Social Cause\"/>3</span></a>\n");
      out.write("\t\t<a href=\"#\" title=\"Vision\"><span><img src=\"data0/tooltips/vision2.jpg\" alt=\"Vision\"/>4</span></a>\n");
      out.write("\t</div></div><div class=\"ws_script\" style=\"position:absolute;left:-99%\"><a href=\"http://wowslider.com\">bootstrap carousel</a> by WOWSlider.com v8.7</div>\n");
      out.write("\t<div class=\"ws_shadow\"></div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine0/wowslider.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine0/script.js\"></script>\n");
      out.write("\t<!-- End WOWSlider.com BODY section -->\n");
      out.write("\t\n");
      out.write("       \n");
      out.write("        <!--Sign Up Form -->\n");
      out.write("        <div class=\"container-fluid\">  \n");
      out.write("\t\n");
      out.write("<div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("<h3 align=\"center\">Register Yourself</h3>\n");
      out.write("           \n");
      out.write("<form role=\"form\" method=\"post\" action=\"../signupServ\">\n");
      out.write("\t<div class=\"form-group\">\n");
      out.write("          \t<div class=\"input-group\">\n");
      out.write("    \t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                        <input id=\"enrolmentno\" type=\"text\" required=\"true\" class=\"form-control\" name=\"en_no\" placeholder=\"Enter Enrolment No\" />\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t</div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("          \t<div class=\"input-group\">\n");
      out.write("    \t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                        <input type=\"text\" required=\"true\" class=\"form-control\" name=\"fname\" placeholder=\"Enter First Name\" />\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t</div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("          \t<div class=\"input-group\">\n");
      out.write("    \t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                        <input type=\"text\" required=\"true\" class=\"form-control\" name=\"sname\" placeholder=\"Enter Last Name\" />\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t</div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    \t\t<div class=\"input-group\">\n");
      out.write("            \t<span class=\"input-group-addon\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\n");
      out.write("                <input id=\"email\" type=\"email\" required=\"true\" class=\"form-control\" name=\"email\" placeholder=\"Enter Your Email Address\" />\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \t<div class=\"form-group\">\n");
      out.write("           \t<div class=\"input-group\">\n");
      out.write("    \t\t\t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                        <input id=\"password\" type=\"password\" required=\"true\" class=\"form-control\" name=\"pwd\" placeholder=\"Enter Your Password\">\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t</div>\n");
      out.write("    \t \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                \t<div class='input-group date' id='datetimepicker1'>\n");
      out.write("                    \t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                        <input type=\"date\" required=\"true\" name=\"bdate\" id=\"birthdate\" placeholder=\"DD/MM/YYYY\" class=\"form-control\" />\n");
      out.write("                    \n");
      out.write("                \t</div>            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("                            <select name=\"department\" class=\"form-control\">\n");
      out.write("                                    <option>----Select Your Department----</option>\n");
      out.write("\t\t\t\t\t");
  
                                                try
                                                {
                                                ResultSet rs=Corner.getdata("select * from department");
                                                while(rs.next())
                                                {

                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(rs.getString(1));
      out.write("\" > ");
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                            ");

                                                }
                                                }
                                                catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                             
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("            \t<label for=\"gender\">Gender</label>\n");
      out.write("                <input type=\"radio\" required=\"true\" value=\"Male\" name=\"gender\" role=\"form\" class=\"form-group\" checked=\"true\"/>&nbsp;Male\n");
      out.write("                <input type=\"radio\" required=\"true\" value=\"Female\" name=\"gender\" role=\"form\" class=\"form-group\"/>&nbsp;Female\n");
      out.write("\t\t\t</div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            \t<label for=\"Role\">Role</label>\n");
      out.write("                <input type=\"radio\" required=\"true\" value=\"Junior\" name=\"role\" role=\"form\" class=\"form-group\"/>Junior\n");
      out.write("                <input type=\"radio\" required=\"true\" value=\"Senior\" name=\"role\" role=\"form\" class=\"form-group\"/>Senior\n");
      out.write("\t\t\t</div>\n");
      out.write("            \n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Sign Up\" name=\"signup\" />\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Sign Up Form Ends -->\n");
      out.write("\n");
      out.write("<!-- content -->\n");
      out.write("<div class=\"col-md-9\">\n");
      out.write("<br />\n");
      out.write("\t<div class=\"panel panel-default\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t<h3>Welcome To Student Corner</h3>\n");
      out.write("\t\t\t<hr /><br />\n");
      out.write("\t\t\t<p style=\"line-height:30px;\" class=\"text-justify\">The system is specially designed for creating a healthy relation between the faculties and students as well as alumni(seniors) and the students(juniors). It is more inclined towards the social networking website which provides a better interface as well as some advanced features. Using this website students can directly interact with faculties of college respective of their departments. It will manage all the details and records of the faculties and alumni as well as the students of an institute. We have introduced some of the unique features which will be useful for the students, alumni and faculty members. The main motto behind this is to create a system which not only help users to communicate with each other but also to enhance their knowledge and spread it.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- end content -->\n");
      out.write("\n");
      out.write("<!-- Back To Top -->\n");
      out.write("<span id=\"top-link-block\" class=\"hidden\">\n");
      out.write("    <a href=\"#top\" class=\"well well-sm\" onClick=\"$('html,body').animate({scrollTop:0},'slow');return false;\">\n");
      out.write("        <i class=\"glyphicon glyphicon-chevron-up\"></i>\n");
      out.write("    </a>\n");
      out.write("</span>\n");
      out.write("<!-- /Back To Top Ends -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        // Only enable if the document has a long scroll bar\n");
      out.write("        // Note the window height + offset\n");
      out.write("        if ( ($(window).height() + 100) < $(document).height() ) {\n");
      out.write("            $('#top-link-block').removeClass('hidden').affix({\n");
      out.write("             // how far to scroll down before link \"slides\" into view\n");
      out.write("               offset: {top:100}\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      var date_input=$('input[name=\"date\"]'); //our date input has the name \"date\"\n");
      out.write("      var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : \"body\";\n");
      out.write("      var options={\n");
      out.write("        format: 'dd/mm/yyyy',\n");
      out.write("        container: container,\n");
      out.write("        todayHighlight: true,\n");
      out.write("        autoclose: true\n");
      out.write("      };\n");
      out.write("      date_input.datepicker(options);\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\t\n");
      out.write("\n");
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
