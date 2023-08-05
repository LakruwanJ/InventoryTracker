package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("  <title>login</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body><!-- Start: Login Form Basic -->\r\n");
      out.write("  <section class=\"position-relative py-4 py-xl-5\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row mb-5\">\r\n");
      out.write("        <div class=\"col-md-8 col-xl-6 text-center mx-auto\">\r\n");
      out.write("          <h2>Log in</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("        <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("          <div class=\"card mb-5\">\r\n");
      out.write("            <div class=\"card-body d-flex flex-column align-items-center\">\r\n");
      out.write("              <div class=\"bs-icon-xl bs-icon-circle bs-icon-primary bs-icon my-4\"><svg\r\n");
      out.write("                  xmlns=\"http://www.w3.org/2000/svg\" width=\"1em\" height=\"1em\" fill=\"currentColor\" viewBox=\"0 0 16 16\"\r\n");
      out.write("                  class=\"bi bi-person\">\r\n");
      out.write("                  <path\r\n");
      out.write("                    d=\"M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z\">\r\n");
      out.write("                  </path>\r\n");
      out.write("                </svg></div>\r\n");
      out.write("              <form class=\"text-center\" method=\"post\">\r\n");
      out.write("                <div class=\"mb-3\"><input class=\"form-control\" type=\"text\" name=\"email\" placeholder=\"Username\"></div>\r\n");
      out.write("                <div class=\"mb-3\"><input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\"><button class=\"btn btn-primary d-block w-100\" type=\"submit\">Login</button></div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section><!-- End: Login Form Basic -->\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
