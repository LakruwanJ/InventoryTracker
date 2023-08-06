package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Team_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Team</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>        \r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\"/>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script type=\"module\"src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"skcss.css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>Suppliers</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table text-center\">\r\n");
      out.write("                    <th scope=\"col\">Name</th>\r\n");
      out.write("                    <th scope=\"col\">email</th>\r\n");
      out.write("                    <th scope=\"col\">Phone number</th>\r\n");
      out.write("                    <th scope=\"col\">No.of Products</th>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                        <td>1000</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                        <td>1000</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>Stock Keepers</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table text-center\">\r\n");
      out.write("                    <th scope=\"col\">Name</th>\r\n");
      out.write("                    <th scope=\"col\">email</th>\r\n");
      out.write("                    <th scope=\"col\">Phone number</th>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>Marketing Team</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table text-center\">\r\n");
      out.write("                    <th scope=\"col\">Name</th>\r\n");
      out.write("                    <th scope=\"col\">email</th>\r\n");
      out.write("                    <th scope=\"col\">Phone number</th>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>System Administrators</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table text-center\">\r\n");
      out.write("                    <th scope=\"col\">Name</th>\r\n");
      out.write("                    <th scope=\"col\">email</th>\r\n");
      out.write("                    <th scope=\"col\">Phone number</th>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"table-light\">\r\n");
      out.write("                        <td>name</td>\r\n");
      out.write("                        <td>email</td>\r\n");
      out.write("                        <td>xxxxxxxx</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
