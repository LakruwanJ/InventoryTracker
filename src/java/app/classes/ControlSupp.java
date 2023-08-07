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
public class ControlSupp extends HttpServlet {

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

        ItemData item = new ItemData();
        SpplierCls supcls = new SpplierCls();
        ResultSet data;
        String itemName;
        String category;
        Double unitPrice;
        String ID;

        HttpSession session;
        if (action != null) {
            switch (action) {

                case "add":
                    item.setItemName(request.getParameter("itemName"));
                    item.setCategory(request.getParameter("category"));
                    item.setUnitPrice(Double.parseDouble(request.getParameter("unitPrice")));

                    String newID = supcls.incrementItemID();

                    itemName = item.getItemName();
                    category = item.getCategory();
                    unitPrice = item.getUnitPrice();
                    supcls.addItem(newID, itemName, category, unitPrice);

                    response.sendRedirect("DashSupplier.jsp");
                    break;

                case "edit":
                    ID = request.getParameter("id");
                    itemName = request.getParameter("itemName");
                    category = request.getParameter("category");
                    unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
                    supcls.updateItem(ID, itemName, category, unitPrice);
                    response.sendRedirect("DashSupplier.jsp");
                    break;

                case "delete":
                    ID = request.getParameter("id");
                    supcls.deleteItem(ID);
                    response.sendRedirect("DashSupplier.jsp");
                    break;

                case "send":
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
