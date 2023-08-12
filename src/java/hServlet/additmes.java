package hServlet;

import app.classes.addItemToStore;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class additmes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        addItemToStore data2 = new addItemToStore();
        String ARID = data2.incrementaddID();
        String StockID = request.getParameter("whID");
        String itemId = request.getParameter("itemID");
        String quantity = request.getParameter("quantity");
        String nowDate = data2.date();
        
        int rowsAffected = data2.insertItem(ARID, StockID, itemId, quantity, nowDate);
        
        if (rowsAffected > 0) {       
            response.sendRedirect("DashSK.jsp");
        } else {
            // Handle insertion failure
            response.sendRedirect("ErrorPage.jsp");
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(additmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(additmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}