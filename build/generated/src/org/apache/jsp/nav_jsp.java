package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <title>RAD homeeeeeeeee</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nav.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background: var(--bs-body-bg);\"><!-- Start: header -->\r\n");
      out.write("    <div><!-- Start: Navbar Right Links -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-2\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-2\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-3\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-3\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-4\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-4\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-5\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-5\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav><!-- End: Navbar Right Links --><!-- Start: header -->\r\n");
      out.write("        <div><!-- Start: Navbar Right Links -->\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("                <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                        data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-1\"><span\r\n");
      out.write("                            class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-1\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                            style=\"width: 150px;\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Dashboard</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                        </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("                <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                        data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-6\"><span\r\n");
      out.write("                            class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-6\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                            style=\"width: 150px;\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Dashboard</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                        </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("                <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                        data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-7\"><span\r\n");
      out.write("                            class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-7\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                            style=\"width: 150px;\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Dashboard</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                        </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav><!-- End: Navbar Right Links --><!-- Start: Navbar Right Links -->\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("                <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                        data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-8\"><span\r\n");
      out.write("                            class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-8\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                            style=\"width: 150px;\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Team Members</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Dashboard</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Change Password</a></li>\r\n");
      out.write("                        </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav><!-- End: Navbar Right Links -->\r\n");
      out.write("        </div><!-- End: header --><!-- Start: header -->\r\n");
      out.write("        <div></div><!-- End: header --><!-- Start: header -->\r\n");
      out.write("        <div></div><!-- End: header -->\r\n");
      out.write("    </div><!-- End: header -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
