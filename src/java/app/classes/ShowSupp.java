/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lakru
 */
public class ShowSupp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("actionSup");

        SpplierCls sup = new SpplierCls();
        ResultSet data;
        HttpSession session;
        if (action != null) {
            switch (action) {
                case "viewitems":
                    // Handle link 1 logic
                    data = sup.viewitems();
                    session = request.getSession();
                    session.setAttribute("Data", data);
                    session.setAttribute("title", "Product list");
                    response.sendRedirect("aa.jsp");
                    break;
                case "RequestBySK":
                    // Handle link 1 logic
                    data = sup.RequestBySK();
                    session = request.getSession();
                    session.setAttribute("Data", data);
                    session.setAttribute("title", "Item Requests by Stock Keepers");
                    response.sendRedirect("aa.jsp");
                    break;
                case "TransferToSK":
                    // Handle link 1 logic
                    data = sup.TransferToSK();
                    session = request.getSession();
                    session.setAttribute("Data", data);
                    session.setAttribute("title", "Transfer History");
                    response.sendRedirect("aa.jsp");
                    break;
                default:
                // Handle default case or show an error page
            }

        } else {

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
