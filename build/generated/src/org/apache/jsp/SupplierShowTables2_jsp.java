package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public final class SupplierShowTables2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

            ResultSet data = (ResultSet) request.getSession().getAttribute("Data");
            String title = (String) request.getSession().getAttribute("title");

            ResultSetMetaData metaData = data.getMetaData();
            int columnCount = metaData.getColumnCount();

            javax.servlet.http.Cookie[] cookies = request.getCookies();
            String U_ID = null;
            if (cookies != null) {
                for (javax.servlet.http.Cookie cookie : cookies) {
                    if ("U_ID".equals(cookie.getName())) {
                        U_ID = URLDecoder.decode(cookie.getValue(), "UTF-8");
                        break;
                    }
                }
            }
        
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
      out.write("                            ");

                                String columnName = null;
                                while (data.next()) {
      out.write("<tr> ");

                                    for (int i = 1; i <= columnCount; i++) {
                                        if (i == columnCount) {
                                            String temp = metaData.getColumnName(i);
                                            if (data.getString(temp).equals("Pending")) {
                                                if (U_ID.equals(data.getString("SID"))) {
                                                    columnName = "<a href='ShowSupp?actionSup=reqbtn>"
                                                            + "<p class='status delivered'> Send Item </p></a>";
                                                } else {
                                                    columnName = "<p class='status delivered'> Send Item </p>";
                                                }
                                            } else if (temp.equals("Sent")) {
                                                columnName = "<p class='status pending'> Complete </p>";
                                            } else if (temp.equals("Pending")) {
                                                columnName = "<p class='status cancelled'> Cancelled </p>";
                                            }
                                        } else {
                                            columnName = metaData.getColumnName(i);
                                        }
                                
      out.write("\r\n");
      out.write("                                <td> ");
 if (i == columnCount) {
      out.write("\r\n");
      out.write("                                    ");
      out.print( columnName);
      out.write("\r\n");
      out.write("                                    ");
} else {
      out.write("\r\n");
      out.write("                                    ");
      out.print( data.getString(columnName));
      out.write("\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                </td>\r\n");
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
