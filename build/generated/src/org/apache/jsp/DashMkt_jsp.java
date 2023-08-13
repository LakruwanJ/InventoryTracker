package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.MKTCls;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import app.classes.SpplierCls;
import java.net.URLDecoder;

public final class DashMkt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    MKTCls mkt = new MKTCls();
    SpplierCls sup = new SpplierCls();
    ResultSet itemData = sup.viewitems();
    ResultSet skData = sup.selectSK();
    String selectedItemID = "";

    String msj[] = {"", "Request Added Succfully", "Request Added Succfully. But Item Not Available Now"};
    String msjClr = null;
    String msjNum = null;
    String alt = null;
    msjNum = request.getParameter("m");

    if (msjNum != null && !msjNum.isEmpty()) {
        if (msjNum.equals("1")) {
            msjClr = "alert-success";
        } else {
            msjClr = "alert-danger";
        }
    }


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Marketing Team DashBoard</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>        \r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\"/>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script type=\"module\"src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"skcss.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            ");
if (msjNum != null && !msjNum.isEmpty()) {
                    alt = "<br><div class='alert " + msjClr + " alert-dismissible fade show' role='alert'>"
                            + "<strong>" + msj[Integer.parseInt(msjNum)] + "</strong>"
                            + "<button type='button' class='btn-close' data-bs-dismiss='alert' onclick='redirectToPage()'>"
                            + "</button></div><br>";
                } else {
                    alt = "<br>";
                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.print( alt);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                function redirectToPage() {\r\n");
      out.write("                    window.location.href = 'DashMkt.jsp';\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <a href=\"wareHouses.html\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTS mt-2 pt-2\" style=\"width: 100%\" type=\"button\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-store\"></i></h1></div>\r\n");
      out.write("                                <h2>Check store</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#send\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-paper-plane\"></i></h1></div>\r\n");
      out.write("                            <h2>Send Request</h2>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <a href=\"ControlMkt?actionMkt=sendReqtoSk\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-magnifying-glass\"></i></h1></div>\r\n");
      out.write("                                <h2>Pending Request</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <a href=\"ControlMkt?actionMkt=TransferToSK\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plane-arrival\"></i></h1></div>\r\n");
      out.write("                                <h2>Transfer History</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("\r\n");
      out.write("            <!--Table Start-->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                ");

                    ResultSet reqByM = mkt.requestByML10();
                    ResultSetMetaData metaData1 = reqByM.getMetaData();
                    int columnCount1 = metaData1.getColumnCount();
                
      out.write("            \r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"text-center mt-2\">\r\n");
      out.write("                        <h4>Recently Added Request</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"table text-center\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"table-secondary\">\r\n");
      out.write("                                ");

                                    for (int i = 1; i <= columnCount1; i++) {
                                        String columnName = metaData1.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <th scope=\"col\"> ");
      out.print( columnName);
      out.write("</th>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");

                                while (reqByM.next()) {
      out.write("<tr class=\"table-light\"> ");

                                        for (int i = 1; i <= columnCount1; i++) {
                                            String columnName = metaData1.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <td> ");
      out.print( reqByM.getString(columnName));
      out.write("</td>\r\n");
      out.write("                                ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"text-center mt-2\">\r\n");
      out.write("                        <h4>Recently Transfer Items</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                        ResultSet tfromSK = mkt.transferfromSKL10();
                        ResultSetMetaData metaData2 = tfromSK.getMetaData();
                        int columnCount2 = metaData2.getColumnCount();
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"table text-center\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"table-secondary\">\r\n");
      out.write("                                ");

                                    for (int i = 1; i <= columnCount2; i++) {
                                        String columnName = metaData2.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <th scope=\"col\"> ");
      out.print( columnName);
      out.write("</th>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                    while (tfromSK.next()) {
      out.write("<tr class=\"table-light\"> ");

                                    for (int i = 1; i <= columnCount2; i++) {
                                        String columnName = metaData2.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <td> ");
      out.print( tfromSK.getString(columnName));
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
      out.write("            <!--table end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--model start-->    \r\n");
      out.write("            <!--Send Request start-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"send\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Send Request to Store Keeper</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlMkt?actionMkt=req\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Item ID</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"itemID\">            \r\n");
      out.write("                                        ");
while (itemData.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( itemData.getString("itemID"));
      out.write('"');
      out.write('>');
      out.print( itemData.getString("itemID"));
      out.write("</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Store Keeper</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"SID\">            \r\n");
      out.write("                                        ");
while (skData.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( skData.getString("SKID"));
      out.write('"');
      out.write('>');
      out.print( skData.getString("SKID"));
      out.write("</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br><div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-2\">\r\n");
      out.write("                                        <label class=\"form-label\">Quantity</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" required name=\"qty\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"hidden\" name=\"MID\" value=\"");
      out.print( U_ID);
      out.write("\" />\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"resrt\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\" >Discard</button>\r\n");
      out.write("                                <button type=\"submit\" name=\"sendReqtoSk\" Value=\"sendReqtoSk\" class=\"btn btn-primary\">Send</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Send Request end-->            \r\n");
      out.write("            <!--model end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
