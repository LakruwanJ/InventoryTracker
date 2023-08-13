package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.ShowUsers;
import app.classes.MKTCls;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    ShowUsers mkt = new ShowUsers();
    
    ResultSet AllSup = mkt.AllSup();
    ResultSetMetaData metaData1 = AllSup.getMetaData();
    int columnCount1 = metaData1.getColumnCount();
    
    ResultSet AllSk = mkt.AllSk();
    ResultSetMetaData metaData2 = AllSk.getMetaData();
    int columnCount2 = metaData2.getColumnCount();
    
    ResultSet AllMkt = mkt.AllMkt();
    ResultSetMetaData metaData3 = AllMkt.getMetaData();
    int columnCount3 = metaData3.getColumnCount();
    
    ResultSet AllAdmin = mkt.AllAdmin();
    ResultSetMetaData metaData4 = AllAdmin.getMetaData();
    int columnCount4 = metaData4.getColumnCount();
    

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                <table class=\"table table-center\">\r\n");
      out.write("\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Supplier ID</th>\r\n");
      out.write("                            <th>User Name</th>\r\n");
      out.write("                            <th>Phone Number</th>\r\n");
      out.write("                            <th>e-mail</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        ");

                                while (AllSup.next()) {
      out.write("<tr class=\"table-light\"> ");

                                for (int i = 1; i <= columnCount1; i++) {
                                    String columnName = metaData1.getColumnName(i);
                            
      out.write("\r\n");
      out.write("                            <td> ");
      out.print( AllSup.getString(columnName));
      out.write("</td>\r\n");
      out.write("                            ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>Stock Keepers</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table table-center\">\r\n");
      out.write("\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Supplier ID</th>\r\n");
      out.write("                            <th>Stock Keeper Name</th>\r\n");
      out.write("                            <th>Phone Number</th>\r\n");
      out.write("                            <th>e-mail</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        ");

                                while (AllSk.next()) {
      out.write("<tr class=\"table-light\"> ");

                                for (int i = 1; i <= columnCount2; i++) {
                                    String columnName = metaData2.getColumnName(i);
                            
      out.write("\r\n");
      out.write("                            <td> ");
      out.print( AllSk.getString(columnName));
      out.write("</td>\r\n");
      out.write("                            ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>Marketing Team</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table table-center\">\r\n");
      out.write("\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Member ID</th>\r\n");
      out.write("                            <th>User Name</th>\r\n");
      out.write("                            <th>Phone Number</th>\r\n");
      out.write("                            <th>e-mail</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        ");

                                while (AllMkt.next()) {
      out.write("<tr class=\"table-light\"> ");

                                for (int i = 1; i <= columnCount3; i++) {
                                    String columnName = metaData3.getColumnName(i);
                            
      out.write("\r\n");
      out.write("                            <td> ");
      out.print( AllMkt.getString(columnName));
      out.write("</td>\r\n");
      out.write("                            ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <h2>System Administrators</h2><hr class=\"pt-0 pb-0\">   \r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <table class=\"table table-center\">\r\n");
      out.write("\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Admin ID</th>\r\n");
      out.write("                            <th>User Name</th>\r\n");
      out.write("                            <th>Phone Number</th>\r\n");
      out.write("                            <th>e-mail</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        ");

                                while (AllAdmin.next()) {
      out.write("<tr class=\"table-light\"> ");

                                for (int i = 1; i <= columnCount4; i++) {
                                    String columnName = metaData4.getColumnName(i);
                            
      out.write("\r\n");
      out.write("                            <td> ");
      out.print( AllAdmin.getString(columnName));
      out.write("</td>\r\n");
      out.write("                            ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
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
