package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.MD5;
import java.sql.*;
import app.classes.DBConector;
import java.sql.PreparedStatement;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    int set = 0;
    if (request.getParameter("login") != null) {
        String username = request.getParameter("uname");
        String password = MD5.getMd5(request.getParameter("password"));
        String role = request.getParameter("btnradio");
        String id = null;

        //out.print(username + "\n");
        //out.print(password + "\n");
        //out.print(role + "\n");
        if (role.equals("admin")) {
            id = "Aid";
        } else if (role.equals("supplier")) {
            id = "SID";
        } else if (role.equals("stockkeeper")) {
            id = "SKID";
        } else if (role.equals("marketingteam")) {
            id = "MID";
        } 

        Connection con = DBConector.getConnection();
        String query = "SELECT password,"+id+" FROM " + role + " WHERE username=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {

            if (password.equals(rs.getString("password"))) {

                Cookie UID = new Cookie("U_ID", rs.getString(id));
                UID.setMaxAge(-1);
                response.addCookie(UID);

                if (role.equals("admin")) {
                    response.sendRedirect("DashAdmin.jsp");
                } else if (role.equals("supplier")) {
                    response.sendRedirect("DashSupplier.jsp");
                } else if (role.equals("stockkeeper")) {
                    response.sendRedirect("DashSK.jsp");
                } else if (role.equals("marketingteam")) {
                    response.sendRedirect("DashMkt.jsp");
                } else {
                    response.sendRedirect("Login.jsp");
                }
                /*Cookie userCookie = new Cookie("loggedInUser", username);
                userCookie.setMaxAge(999999999);
                response.addCookie(userCookie);*/
            } else {
                //out.print("user name or password incorrect");
                set = 1;
            }
        } else {
            //out.print("user name or password incorrect");
            set = 1;
        }
    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("        <title>login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .txt-sze{\r\n");
      out.write("                font-size: 10px !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body><!-- Start: Login Form Basic -->\r\n");
      out.write("        <section class=\"position-relative py-4 py-xl-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row mb-5\">\r\n");
      out.write("                    <div class=\"col-md-8 col-xl-6 text-center mx-auto\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                                                                            style=\"width: 150px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("                        <div class=\"card mb-5\">\r\n");
      out.write("                            <div class=\"card-body d-flex flex-column align-items-center\">\r\n");
      out.write("                                <h2>Log In</h2>\r\n");
      out.write("                                <div class=\"bs-icon-xl bs-icon-circle bs-icon-primary bs-icon my-4\"><svg\r\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\" width=\"1em\" height=\"1em\" fill=\"currentColor\" viewBox=\"0 0 16 16\"\r\n");
      out.write("                                        class=\"bi bi-person\">\r\n");
      out.write("                                    <path\r\n");
      out.write("                                        d=\"M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z\">\r\n");
      out.write("                                    </path>\r\n");
      out.write("                                    </svg></div>\r\n");
      out.write("                                <form class=\"text-center\" method=\"post\">\r\n");
      out.write("                                    <div class=\"mb-3\"><input class=\"form-control\" type=\"text\" name=\"uname\" placeholder=\"Username\"></div>\r\n");
      out.write("                                    <div class=\"mb-3\"><input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"btn-group\" role=\"group\" aria-label=\"Basic radio toggle button group\">\r\n");
      out.write("                                        <input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio1\" value=\"admin\" checked>\r\n");
      out.write("                                        <label class=\"btn btn-outline-primary txt-sze\" for=\"btnradio1\">Admin</label>\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio2\" value=\"supplier\">\r\n");
      out.write("                                        <label class=\"btn btn-outline-primary txt-sze\" for=\"btnradio2\">Supplier</label>\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio3\" value=\"stockkeeper\">\r\n");
      out.write("                                        <label class=\"btn btn-outline-primary txt-sze\" for=\"btnradio3\">Stock keeper</label>\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"radio\" class=\"btn-check\" name=\"btnradio\" id=\"btnradio4\" value=\"marketingteam\">\r\n");
      out.write("                                        <label class=\"btn btn-outline-primary txt-sze\" for=\"btnradio4\">Marketing Team</label>\r\n");
      out.write("                                    </div>  \r\n");
      out.write("                                    <div class=\"mb-3\"><button class=\"btn btn-primary d-block w-100 mt-4\" type=\"submit\" name=\"login\">Login</button></div>\r\n");
      out.write("                                    ");
 if (set == 1) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"alert alert-primary d-flex align-items-center\" id=\"error\" role=\"alert\" style=\"background-color: white; border-color: white\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"bi bi-exclamation-triangle-fill flex-shrink-0 me-2\" width=\"20px\" height=\"20px\" viewBox=\"0 0 16 16\" role=\"img\" aria-label=\"Warning:\">\r\n");
      out.write("                                        <path d=\"M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z\"/>\r\n");
      out.write("                                        </svg>\r\n");
      out.write("                                        <div style=\"color: red\">\r\n");
      out.write("                                            Incorrect username or password\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");
 }
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section><!-- End: Login Form Basic -->\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
