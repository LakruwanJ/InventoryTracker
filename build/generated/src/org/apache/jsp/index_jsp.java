package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("        <title>RAD home</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/material-design-icons/3.0.1/iconfont/material-icons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"background: var(--bs-body-bg);\"><!-- Start: header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div><!-- Start: Navbar Right Links -->\r\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-body py-3\">\r\n");
      out.write("                <div class=\"container\"><a class=\"navbar-brand d-flex align-items-center\" href=\"#\"></a><button\r\n");
      out.write("                        data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-2\"><span\r\n");
      out.write("                            class=\"visually-hidden\">Toggle navigation</span><span\r\n");
      out.write("                            class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navcol-2\"><img src=\"img/logo-no-background.png\"\r\n");
      out.write("                                                                             style=\"width: 150px;\">\r\n");
      out.write("                        <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Product</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Ware Houses</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Stores</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Supliers</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">About Us</a></li>\r\n");
      out.write("                        </ul><a class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\">Log out</a><a\r\n");
      out.write("                            class=\"btn btn-primary ms-md-2\" role=\"button\" href=\"#\"\r\n");
      out.write("                            style=\"width: 60px;height: 30px;font-size: 10px;\">Log in</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav><!-- End: Navbar Right Links -->\r\n");
      out.write("\r\n");
      out.write("        </div><!-- End: header --><!-- Start: Masonry gallery cards responsive -->\r\n");
      out.write("        <div style=\"padding-top: 20px;\"><!-- Start: cards -->\r\n");
      out.write("            <div class=\"row\" data-masonry=\"{&quot;percentPosition&quot;: true }\"\r\n");
      out.write("                 style=\"margin-right: 0px;margin-left: 0px;padding: 0px;padding-left: 10px;padding-right: 10px;\">\r\n");
      out.write("                <!-- Start: 1 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"1.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Add item</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\" style=\"background: rgb(5,146,36);\"><i\r\n");
      out.write("                                        class=\"fa fa-plus\"></i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 1 --><!-- Start: 2 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"2.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Remove item</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"background: rgb(241,22,8);width: 38px;\"><i class=\"fa fa-trash-o\"\r\n");
      out.write("                                                                                  style=\"color: rgb(6,6,6);\"></i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 2 --><!-- Start: 3 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"3.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Update item</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"background: rgb(251,185,17);width: 38px;\"><i\r\n");
      out.write("                                        class=\"fa fa-pencil-square-o\"></i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 3 --><!-- Start: 4 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"4.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">View all item</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"background: rgb(5,85,179);width: 38px;\"><i class=\"fa fa-eye\"></i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 4 --><!-- Start: 5 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"5.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Check store</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"background: rgb(190,251,17);height: 36px;width: 38px;\"><i class=\"material-icons\"\r\n");
      out.write("                                                                                                 style=\"text-align: center;width: 18px;height: 16px;font-size: 20px;\">store</i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 5 --><!-- Start: 6 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"6.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Send item</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"background: rgb(7,215,53);width: 38px;height: 36px;\"><i class=\"material-icons\"\r\n");
      out.write("                                                                                               style=\"width: 18px;height: 16px;font-size: 20px;\">assignment_turned_in</i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 6 --><!-- Start: 7 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"7.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\" style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">View Request</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\" style=\"height: 36px;width: 38px;\"><i\r\n");
      out.write("                                        class=\"material-icons\"\r\n");
      out.write("                                        style=\"width: 18px;height: 16px;font-size: 20px;\">search</i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 7 --><!-- Start: 8 -->\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4 mb-4\"><!-- Start: card -->\r\n");
      out.write("                    <div class=\"card\"\r\n");
      out.write("                         style=\"background: rgb(33,37,41);border-style: none;box-shadow: 0px 0px 15px 3px #ffffff08;\">\r\n");
      out.write("                        <picture type=\"\" srcset=\"\"><img class=\"card-img-top p-3\" src=\"8.png\" alt=\"\"\r\n");
      out.write("                                                        style=\"border-radius: 24px;object-fit: cover;padding-bottom: 5px;margin-bottom: -11px;\">\r\n");
      out.write("                        </picture><!-- Start: texto -->\r\n");
      out.write("                        <div class=\"card-body\"\r\n");
      out.write("                             style=\"padding-top: 0px;padding-bottom: 16px;text-align: center;height: 82px;\">\r\n");
      out.write("                            <h5 class=\"card-title\" style=\"margin-bottom: 0px;color: rgb(255,255,255);\">Transfer History</h5>\r\n");
      out.write("                            <div class=\"btn-group\" role=\"group\" style=\"padding-top: 6px;border-style: none;\"><button\r\n");
      out.write("                                    class=\"btn btn-primary btn-d\" type=\"button\"\r\n");
      out.write("                                    style=\"height: 36px;margin: 3px;width: 38px;background: rgb(98,180,239);\"><i\r\n");
      out.write("                                        class=\"material-icons\" style=\"font-size: 20px;\">flight_takeoff</i></button></div>\r\n");
      out.write("                        </div><!-- End: texto -->\r\n");
      out.write("                    </div><!-- End: card -->\r\n");
      out.write("                </div><!-- End: 8 -->\r\n");
      out.write("            </div><!-- End: cards -->\r\n");
      out.write("        </div><!-- End: Masonry gallery cards responsive --><!-- Start: footer -->\r\n");
      out.write("        <div><!-- Start: Footer Dark -->\r\n");
      out.write("            <footer class=\"text-center bg-dark\" style=\"background: var(--bs-emphasis-color);\">\r\n");
      out.write("                <div class=\"container text-white py-4 py-lg-5\">\r\n");
      out.write("                    <div style=\"height: 80px;\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\"><img src=\"img/png%20white.png\"\r\n");
      out.write("                                                  style=\"max-width: 170px;width: 150px;height: 37.8px;\"></div>\r\n");
      out.write("                            <div class=\"col\" style=\"color: rgb(108, 117, 125);font-size: 10px;\">\r\n");
      out.write("                                <h1 style=\"font-size: 15px;color: rgb(108, 117, 125);\">You can use this system overseeing\r\n");
      out.write("                                    and controlling all aspects of inventory, from ordering to distribution</h1>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col\">\r\n");
      out.write("                                        <h1 style=\"font-size: 18px;color: rgb(108, 117, 125);\">Contact Us</h1><a\r\n");
      out.write("                                            class=\"link-light\" href=\"#\">inventorytracker@gmail.com</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div><a class=\"link-light\" href=\"#\" style=\"padding-left: 10px;padding-top: 0px;\">+94 11 356\r\n");
      out.write("                                    8356</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"text-muted mb-0\">Copyright Â© 2023 Inventory Tracker</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer><!-- End: Footer Dark -->\r\n");
      out.write("        </div><!-- End: footer -->\r\n");
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
