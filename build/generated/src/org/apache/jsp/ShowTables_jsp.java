package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public final class ShowTables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    javax.servlet.http.Cookie[] cookies = request.getCookies();
    String U_ID = null;

    if (cookies != null) {
        for (javax.servlet.http.Cookie cookie : cookies) {
            if ("U_ID".equals(cookie.getName())) {
                U_ID = URLDecoder.decode(cookie.getValue(), "UTF-8");
                break;
            }
        }
    }else{
        response.sendRedirect("logn.jsp");
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\" title=\"Coding design\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/marketingTeamDash.css\">\r\n");
      out.write("        <title>Marketing Team Dashboard</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-3\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-3\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"Team.jsp\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("        ");

            ResultSet data = (ResultSet) request.getSession().getAttribute("Data");
            String title = (String) request.getSession().getAttribute("title");

            ResultSetMetaData metaData = data.getMetaData();
            int columnCount = metaData.getColumnCount();
        
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <div class=\"table\">\r\n");
      out.write("                <div class=\"table__header\">\r\n");
      out.write("                    <h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"search\" placeholder=\"Search Data...\">\r\n");
      out.write("                        <img src=\"img/search.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table__body\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                ");

                                    for (int i = 1; i <= columnCount; i++) {
                                        String columnName = metaData.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <th> ");
      out.print( columnName);
      out.write("<span class=\"icon-arrow\">&UpArrow;</span></th>\r\n");
      out.write("                                    ");

                                        } // End of for loop
                                    
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                                ");

                                    while (data.next()) {
      out.write("<tr> ");

                                    for (int i = 1; i <= columnCount; i++) {
                                        String columnName = metaData.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <td> ");
      out.print( data.getString(columnName));
      out.write("</td>\r\n");
      out.write("                                ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </main>\r\n");
      out.write("        <script src=\"script.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
