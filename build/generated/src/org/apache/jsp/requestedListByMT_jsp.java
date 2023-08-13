package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class requestedListByMT_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Requested Product list by Marketing Team</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/requestedByMT.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"table\">\r\n");
      out.write("        <div class=\"table__header\">\r\n");
      out.write("            <h2>Products Requested By Marketing Team</h2>\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("                <input type=\"search\" placeholder=\"Search Data...\">\r\n");
      out.write("                <img src=\"img/search.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("           </div>\r\n");
      out.write("        <div class=\"table__body\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <th> Product Id<span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Product Name<span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Quantity<br> Requested <span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Order Date <span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Status <span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Price <span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                        <th> Stored <br>Location<span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                       </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P001 </td>\r\n");
      out.write("                        <td> <img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 3 </td>\r\n");
      out.write("                        <td> 17 Dec, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status delivered\">Delivered</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$128.90 </strong></td>\r\n");
      out.write("                        <td> Store 1 </td>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P002 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 1 </td>\r\n");
      out.write("                        <td> 27 Aug, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status cancelled\">Processing</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$5350.50</strong> </td>\r\n");
      out.write("                        <td> Store 4 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P003 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 2 </td>\r\n");
      out.write("                        <td> 14 Mar, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status shipped\">Cancelled</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$210.40</strong> </td>\r\n");
      out.write("                        <td> Store 2 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P004 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 3 </td>\r\n");
      out.write("                        <td> 25 May, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status delivered\">Delivered</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$149.70</strong> </td>\r\n");
      out.write("                        <td> Store 2 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P005 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 2 </td>\r\n");
      out.write("                        <td> 23 Apr, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status pending\">Pending</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$399.99</strong> </td>\r\n");
      out.write("                        <td> Store 3 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P006 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 1 </td>\r\n");
      out.write("                        <td> 23 Apr, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status cancelled\">Processing</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$399.99</strong> </td>\r\n");
      out.write("                        <td> Store 4 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P007 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 5 </td>\r\n");
      out.write("                        <td> 20 May, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status delivered\">Delivered</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$399.99</strong> </td>\r\n");
      out.write("                        <td> Store 2 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P008 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 2 </td>\r\n");
      out.write("                        <td> 30 Feb, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status pending\">Pending</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$149.70</strong> </td>\r\n");
      out.write("                        <td> Store 3 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <td> P009 </td>\r\n");
      out.write("                        <td><img src=\"img/frock.png\" alt=\"\">Frock</td>\r\n");
      out.write("                        <td> 3 </td>\r\n");
      out.write("                        <td> 22 Dec, 2023 </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <p class=\"status cancelled\">Processing</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td> <strong>$249.99</strong> </td>\r\n");
      out.write("                        <td> Store 2 </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"script.js\"></script>\r\n");
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
