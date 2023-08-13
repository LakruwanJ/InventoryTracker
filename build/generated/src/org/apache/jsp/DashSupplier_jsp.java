package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import app.classes.ItemData;
import app.classes.SpplierCls;
import app.classes.DBConector;

public final class DashSupplier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    SpplierCls sup = new SpplierCls();
    ResultSet data1 = sup.viewitems();
    ResultSet data2 = sup.viewitems();
    ResultSet data3 = sup.viewitems();
    ResultSet StID = sup.selectSK();
    String selectedItemID = "";

    String msj[] = {"", "Item Added Succfully", "Can't Add Item. Try Again",
        "Item Edited Succfully", "Can't Edit Item. Try Again",
        "Item Deleted Succfully", "Can't Delete Item. Try Again",
        "Item Sent Succfully", "Can't sent Item. Try Again", "Can't sent Item. Not Enough Space to Store"};
    String msjClr = null;
    String msjNum = null;
    String alt = null;
    msjNum = request.getParameter("m");

    if (msjNum != null && !msjNum.isEmpty()) {
        if (msjNum.equals("1") || msjNum.equals("3") || msjNum.equals("5") || msjNum.equals("7")) {
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
      out.write("        <title>Supplier DashBoard</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>        \r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\"/>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script type=\"module\"src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"skcss.css\" />\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            .alerts {\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background-color: #36f443;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .alertu {\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background-color: #f44336;\r\n");
      out.write("                color: white;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .closebtn__ {\r\n");
      out.write("                margin-left: 15px;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                float: right;\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("                line-height: 20px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                transition: 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .closebtn:hover {\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                    data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-2\"><span\r\n");
      out.write("                        class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                        class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-2\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                        style=\"width: 150px;\">\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"Team.jsp\">Team Members</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Details</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ChangePassword.jsp\">Change Password</a></li>\r\n");
      out.write("                    </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"logout\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
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
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("                function redirectToPage() {\r\n");
      out.write("                    window.location.href = 'DashSupplier.jsp';\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("            <!--Fist card row Start-->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <div class=\"card cardsFirstAW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#add\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plus\"></i></h1></div>\r\n");
      out.write("                            <h2>Add item</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <div class=\"card cardsFirstFW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#remove\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-trash\"></i></h1></div>\r\n");
      out.write("                            <h2>Remove item</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\" type=\"button\" data-bs-toggle=\"modal\" data-bs-target=\"#edit\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-pen-to-square\"></i></h1></div>\r\n");
      out.write("                            <h2>Update item</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <a href=\"ShowSupp?actionSup=viewitems\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTS mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-eye\"></i></h1></div>\r\n");
      out.write("                                <h2>View all item</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
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
      out.write("                            <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-dolly\"></i></h1></div>\r\n");
      out.write("                            <h2>Send item</h2>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">\r\n");
      out.write("                    <a href=\"ShowSupp?actionSup=RequestBySK\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-magnifying-glass\"></i></h1></div>\r\n");
      out.write("                                <h2>View Request</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 text-center p-3\">                    \r\n");
      out.write("                    <a href=\"ShowSupp?actionSup=TransferToSK\" style=\"text-decoration: none\">\r\n");
      out.write("                        <div class=\"card cardsFirstTW mt-2 pt-2\" style=\"width: 100%\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <div class=\"iconInCard\"><h1><i class=\"fa-solid fa-plane-departure\"></i></h1></div>\r\n");
      out.write("                                <h2>Transfer History</h2></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br><br>\r\n");
      out.write("\r\n");
      out.write("            <!--model start-->\r\n");
      out.write("            <!--add Item-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"add\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Add Item</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlSupp?actionSup=add\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"mb-2\">\r\n");
      out.write("                                        <label class=\"form-label\">Item Name</label>\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"itemName\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br><div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select type</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"category\" required>            \r\n");
      out.write("                                        <option value=\"Product\">Product</option>\r\n");
      out.write("                                        <option value=\"Raw material\">Raw material</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br><div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label class=\"form-label\">Unit Capacity</label>\r\n");
      out.write("                                        <div class=\"input-group mb-3\">\r\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"unitCap\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <br><div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label class=\"form-label\">Unit price</label>\r\n");
      out.write("                                        <div class=\"input-group mb-3\">\r\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"unitPrice\" required>\r\n");
      out.write("                                            <span class=\"input-group-text\">.00</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"resrt\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\" >Discard</button>\r\n");
      out.write("                                <button type=\"submit\" name=\"addItembtn\" Value=\"addItem\" class=\"btn btn-primary\">Add Item</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--add item-->\r\n");
      out.write("\r\n");
      out.write("            <!--edit item-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"edit\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Update Item</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlSupp?actionSup=edit\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Item ID</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"id\">\r\n");
      out.write("                                        <option>Select</option>\r\n");
      out.write("                                        ");
while (data1.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( data1.getString("itemID"));
      out.write('"');
      out.write('>');
      out.print( data1.getString("itemID"));
      out.write("</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>                   \r\n");
      out.write("                                <br><div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-12\">\r\n");
      out.write("                                        <label class=\"form-label\">New Unit price</label>\r\n");
      out.write("                                        <div class=\"input-group mb-3\">\r\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"unitPrice\" required>\r\n");
      out.write("                                            <span class=\"input-group-text\">.00</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Discard</button>\r\n");
      out.write("                                <button type=\"sumbit\" class=\"btn btn-primary\">Update</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--edit item-->  \r\n");
      out.write("\r\n");
      out.write("            <!--delete item-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"remove\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Delete Item</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlSupp?actionSup=delete\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Item ID</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"id\">\r\n");
      out.write("                                        <option>Select</option>\r\n");
      out.write("                                        ");
while (data2.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( data2.getString("itemID"));
      out.write('"');
      out.write('>');
      out.print( data2.getString("itemID"));
      out.write("</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>                                \r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Discard</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Delete</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--delete item-->  \r\n");
      out.write("\r\n");
      out.write("            <!--Send item-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"send\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable\" >\r\n");
      out.write("                    <div class=\"modal-content w-150\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <h1 class=\"modal-title fs-5\">Send Item to Store Keeper</h1>\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form class=\"was-validated\" action=\"ControlSupp?actionSup=send\" method=\"POST\">\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Product Name</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"iid\">            \r\n");
      out.write("                                        <option>Select</option>\r\n");
      out.write("                                        ");
while (data3.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( data3.getString("itemID"));
      out.write('"');
      out.write('>');
      out.print( data3.getString("itemID"));
      out.write("</option>\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\">Select Store Keeper</label>\r\n");
      out.write("                                    <select class=\"form-select  mb-3\" required name=\"skid\">            \r\n");
      out.write("                                        <option>Select</option>\r\n");
      out.write("                                        ");
while (StID.next()) {
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print( StID.getString("SKID"));
      out.write('"');
      out.write('>');
      out.print( StID.getString("SKID"));
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
      out.write("                                            <input type=\"number\" class=\"form-control\" id=\"basic-url\" name=\"qty\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"hidden\" name=\"sid\" value=\"");
      out.print( U_ID);
      out.write("\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Discard</button>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Send</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Send Item-->            \r\n");
      out.write("            <!--model end-->\r\n");
      out.write("\r\n");
      out.write("            <!--Table Start-->\r\n");
      out.write("            ");

                ResultSet viewitemsl5 = sup.viewitemsl5();
                ResultSetMetaData metaData1 = viewitemsl5.getMetaData();
                int columnCount1 = metaData1.getColumnCount();
            
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!--Recently Added Products Table Start-->\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"text-center mt-2\">\r\n");
      out.write("                        <h4>Recently Added Items</h4>\r\n");
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

                                        } // End of for loop
                                    
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");

                                while (viewitemsl5.next()) {
      out.write("<tr class=\"table-light\"> ");

                                        for (int i = 1; i <= columnCount1; i++) {
                                            String columnName = metaData1.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <td> ");
      out.print( viewitemsl5.getString(columnName));
      out.write("</td>\r\n");
      out.write("                                ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Recently Added Products Table end-->\r\n");
      out.write("\r\n");
      out.write("                <!--Recently Supplied Products Table Start-->                \r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"text-center mt-2\">\r\n");
      out.write("                        <h4>Recently Transfer Items</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                        ResultSet transferToSKl5 = sup.transferToSKl5();
                        ResultSetMetaData metaData2 = transferToSKl5.getMetaData();
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

                                        } // End of for loop
                                    
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");

                                    while (transferToSKl5.next()) {
      out.write("<tr class=\"table-light\"> ");

                                        for (int i = 1; i <= columnCount2; i++) {
                                            String columnName = metaData2.getColumnName(i);
                                
      out.write("\r\n");
      out.write("                                <td> ");
      out.print( transferToSKl5.getString(columnName));
      out.write("</td>\r\n");
      out.write("                                ");
}
      out.write("</tr>");
}
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Recently Supplied Products Table Start-->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
