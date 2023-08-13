package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

Cookie UID = new Cookie("U_ID", "sup0002");
    response.addCookie(UID);
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>        \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script type=\"module\"src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <style>\n");
      out.write("            .txt-sze {\n");
      out.write("                font-size: 10px !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String alt = null;
            String m = request.getParameter("m");
            if (m != null && !m.isEmpty()) {
                    alt = "<br><div class='alert alert-danger alert-dismissible fade show' role='alert'>"
                            + "<strong>Something went wrong. Try again </strong>"
                            + "<button type='button' class='btn-close' data-bs-dismiss='alert' onclick='redirectToPage()'>"
                            + "</button></div><br>";
                } else {
                    alt = "<br>";
                }
        
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function redirectToPage() {\n");
      out.write("                    window.location.href = 'ChangePassword.jsp';\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        ");
      out.print( alt);
      out.write("\n");
      out.write("        <section class=\"position-relative py-4 py-xl-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row mb-5\">\n");
      out.write("                    <div class=\"col-md-8 col-xl-6 text-center mx-auto\"><img src=\"img/logo-no-background.png\"\n");
      out.write("                                                                            style=\"width: 150px;\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row d-flex justify-content-center\">\n");
      out.write("                    <div class=\"col-md-6 col-xl-4\">\n");
      out.write("                        <div class=\"card mb-5\">\n");
      out.write("                            <div class=\"card-body d-flex flex-column align-items-center\">\n");
      out.write("                                <h2>Change Password</h2>\n");
      out.write("                                <div class=\"bs-icon-xl bs-icon-circle bs-icon-primary bs-icon my-4\"><i\n");
      out.write("                                        class=\"fa-solid fa-unlock fa-l\"></i></div>\n");
      out.write("                                <form class=\"text-center\" method=\"post\" onsubmit=\"return validateForm();\" action='ChangePassword'>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"input-group mb-3\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" id=\"pWord\" name=\"pWord\" placeholder=\"Enter Password\">\n");
      out.write("                                            <span class=\"input-group-text\"><i id=\"toggleButton\" onclick=\"togglePasswordVisibility()\">Show</i></span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"input-group mb-3\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" id=\"password2\" name=\"password2\" placeholder=\"Re-enter Password\">\n");
      out.write("                                            <span class=\"input-group-text\"><i id=\"toggleButton2\" onclick=\"togglePasswordVisibility2()\">Show</i></span>                                 \n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( U_ID);
      out.write("\" />\n");
      out.write("                                    <p id=\"password-error\" style=\"color: red;\"></p>\n");
      out.write("                                    <div class=\"mb-3\"><button class=\"btn btn-primary d-block w-100 mt-4\" type=\"submit\" name=\"login\">Change Password</button></div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            const passwordInput = document.getElementById(\"pWord\");\n");
      out.write("            const passwordConfirmationInput = document.getElementById(\"password2\");\n");
      out.write("            const passwordError = document.getElementById(\"password-error\");\n");
      out.write("\n");
      out.write("            passwordInput.addEventListener(\"input\", validatePassword);\n");
      out.write("\n");
      out.write("            function validatePassword() {\n");
      out.write("                const password = passwordInput.value;\n");
      out.write("\n");
      out.write("                const hasLowerCase = /[a-z]/.test(password);\n");
      out.write("                const hasUpperCase = /[A-Z]/.test(password);\n");
      out.write("                const hasDigit = /\\d/.test(password);\n");
      out.write("                const hasSpecialChar = /[!@#$%^&*()_+{}\\[\\]:;<>,.?~\\-]/.test(password);\n");
      out.write("                const isLengthValid = password.length >= 8 && password.length <= 20;\n");
      out.write("\n");
      out.write("                if (!isLengthValid) {\n");
      out.write("                    passwordError.textContent = \"Password must be between 8 and 20 characters.\";\n");
      out.write("                } else if (!hasLowerCase) {\n");
      out.write("                    passwordError.textContent = \"Password must contain at least one lowercase letter.\";\n");
      out.write("                } else if (!hasUpperCase) {\n");
      out.write("                    passwordError.textContent = \"Password must contain at least one uppercase letter.\";\n");
      out.write("                } else if (!hasDigit) {\n");
      out.write("                    passwordError.textContent = \"Password must contain at least one digit.\";\n");
      out.write("                } else if (!hasSpecialChar) {\n");
      out.write("                    passwordError.textContent = \"Password must contain at least one special character.\";\n");
      out.write("                } else {\n");
      out.write("                    passwordError.textContent = \"\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validateForm() {\n");
      out.write("                const password = passwordInput.value;\n");
      out.write("                const passwordConfirmation = passwordConfirmationInput.value;\n");
      out.write("\n");
      out.write("                if (password !== passwordConfirmation) {\n");
      out.write("                    passwordError.textContent = \"Passwords do not match.\";\n");
      out.write("                    return false; // Prevent form submission\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // If all validation passes, clear any existing error messages and allow form submission\n");
      out.write("                passwordError.textContent = \"\";\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function togglePasswordVisibility() {\n");
      out.write("                var passwordField = document.getElementById(\"pWord\");\n");
      out.write("                var toggleButton = document.getElementById(\"toggleButton\");\n");
      out.write("\n");
      out.write("                if (passwordField.type === \"password\") {\n");
      out.write("                    passwordField.type = \"text\";\n");
      out.write("                    toggleButton.textContent = \"Hide\";\n");
      out.write("                } else {\n");
      out.write("                    passwordField.type = \"password\";\n");
      out.write("                    toggleButton.textContent = \"Show\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function togglePasswordVisibility2() {\n");
      out.write("                var passwordField = document.getElementById(\"password2\");\n");
      out.write("                var toggleButton2 = document.getElementById(\"toggleButton2\");\n");
      out.write("\n");
      out.write("                if (passwordField.type === \"password\") {\n");
      out.write("                    passwordField.type = \"text\";\n");
      out.write("                    toggleButton2.textContent = \"Hide\";\n");
      out.write("                } else {\n");
      out.write("                    passwordField.type = \"password\";\n");
      out.write("                    toggleButton2.textContent = \"Show\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
