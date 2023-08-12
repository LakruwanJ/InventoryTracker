/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lenovo
 */
public class addItemToStore {

    public int insertItem(String ARID, String StockID, String itemId, String quantity, String nowDate) throws ClassNotFoundException {
        int rowsAffected = 0;
        Connection con = null;
        PreparedStatement preparedStatement = null;
       

        try {

            con = DBConector.getConnection();
            String query = "INSERT INTO addremove (ARID, StockID, SID, itemID, Quantity, Date, Status) VALUES (?, ?, 'SK0002', ?, ?, ?, 'add')";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, ARID);
            preparedStatement.setString(2, StockID);
            preparedStatement.setString(3, itemId);
            preparedStatement.setString(4, quantity);
            preparedStatement.setString(4, nowDate);
            
            rowsAffected = preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
            return rowsAffected;
        
    }
    public static String incrementaddID() {
        String lastAddID = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT ARID FROM addremove ORDER BY RID DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                lastAddID = rs.getString("ARID");
            } else {
                lastAddID = "ar0000";
            }
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        String prefix = lastAddID.substring(0, 3);
        int numericPart = Integer.parseInt(lastAddID.substring(3));
        numericPart++;
        return prefix + String.format("%04d", numericPart);
    }
    public static String date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nowDate = LocalDate.now();
        return nowDate.toString();
    }
}
