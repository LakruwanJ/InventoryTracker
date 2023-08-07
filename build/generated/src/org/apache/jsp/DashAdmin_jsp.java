package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.AdminCls;
import java.sql.ResultSet;

public final class DashAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");


    AdminCls Ad = new AdminCls();
    ResultSet data1 = Ad.viewsup();
    ResultSet data2 = Ad.viewSk();
    ResultSet data3 = Ad.viewMk();
    ResultSet data4 = Ad.viewAd();


      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Admin DashBoard</title>\r\n");
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
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <h2>Manage System Users</h2><hr class=\"pt-0 pb-0\">  \r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-12 text-center p-3 px-4\">\r\n");
      out.write("                            <div class=\"card cardsFirstAW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#add\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plus\"></i></h1></div>\r\n");
      out.write("                                    <h2>Add Member</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-12 text-center p-3 px-4\">\r\n");
      out.write("                            <div class=\"card cardsFirstFW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#remove\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-trash\"></i></h1></div>\r\n");
      out.write("                                    <h2>Remove Member</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <h2>Manage Stores</h2><hr class=\"pt-0 pb-0\">\r\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 text-center p-3 px-4\">\r\n");
      out.write("                            <a href=\"wareHouses.html\" style=\"text-decoration: none\">\r\n");
      out.write("                                <div class=\"card cardsFirstTS mt-2 pt-2\" style=\"width: 100%\" type=\"button\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-store\"></i></h1></div>\r\n");
      out.write("                                        <h2>Check store</h2>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--model start-->\r\n");
      out.write("            <!--add member-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"add\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Add New Member</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlAdmin?actionAd=add\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label class=\"form-label\">Create UserName</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <span class=\"input-group-text\" id=\"basic-addon3\">UserName</span>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"uName\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label class=\"form-label\">Create Password</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <span class=\"input-group-text\" id=\"basic-addon3\">Password</span>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"pWord\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label class=\"form-label\">Add e-mail</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"email\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-3\">\r\n");
      out.write("                                        <label class=\"form-label\">Phone Number</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"pnum\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select User</label>\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <select class=\"form-select  mb-3\" required name=\"role\">            \r\n");
      out.write("                                            <option value=\"1\">Supplier</option>\r\n");
      out.write("                                            <option value=\"2\">Store Keeper</option>\r\n");
      out.write("                                            <option value=\"3\">Marketing Team Member</option>\r\n");
      out.write("                                            <option value=\"4\">System Admin</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"reset\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Discard</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Add User</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--add member-->\r\n");
      out.write("\r\n");
      out.write("            <!--remove member-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"remove\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Remove Member</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlAdmin?actionAd=delete\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select User</label>\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <select class=\"form-select  mb-3\" required name=\"id\">            \r\n");
      out.write("                                            <option value=\"1\">Select</option>\r\n");
      out.write("                                            ");
while (data1.next()) {
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print( data1.getString("SID"));
      out.write('"');
      out.write('>');
      out.print( data1.getString("SID"));
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                            ");
while (data2.next()) {
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print( data2.getString("SKID"));
      out.write('"');
      out.write('>');
      out.print( data2.getString("SKID"));
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                            ");
while (data3.next()) {
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print( data3.getString("MID"));
      out.write('"');
      out.write('>');
      out.print( data3.getString("MID"));
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                            ");
while (data4.next()) {
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print( data4.getString("Aid"));
      out.write('"');
      out.write('>');
      out.print( data4.getString("Aid"));
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"reset\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Discard</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Remove User</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--remove member-->   \r\n");
      out.write("            <!--model end-->\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                        <h2>Manage Suppliers</h2><hr class=\"pt-0 pb-0\">\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-12 text-center p-3 px-4\">\r\n");
      out.write("                            <a href=\"ShowSupp?actionSup=viewitems\" style=\"text-decoration: none\">\r\n");
      out.write("                                <div class=\"card cardsFirstTS mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-eye\"></i></h1></div>\r\n");
      out.write("                                        <h2>View all item</h2>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-12 text-center p-3 px-4\">\r\n");
      out.write("                            <a href=\"ShowSupp?actionSup=TransferToSK\" style=\"text-decoration: none\">\r\n");
      out.write("                                <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plane-departure\"></i></h1></div>\r\n");
      out.write("                                        <h2>Transfer History</h2></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <h2>Manage Marketing Team</h2><hr class=\"pt-0 pb-0\">\r\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 text-center p-3 px-4\">\r\n");
      out.write("                            <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#Transferm\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plane-departure\"></i></h1></div>\r\n");
      out.write("                                    <h2>Transfer History</h2>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                    </div>          \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
      out.write("\r\n");
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
