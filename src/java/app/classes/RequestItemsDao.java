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
public class RequestItemsDao {

    public int insertRequest(String RID, String sid, String itemId, String quantity) throws ClassNotFoundException {
        int rowsAffected = 0;
        Connection con = null;
        PreparedStatement preparedStatement = null;
       

        try {

            con = DBConector.getConnection();
            String query = "INSERT INTO requestitems (RID, SKID, SID, itemID, Quantity, Date, Status) VALUES (?,'SK0002', ?, ?, ?, '2023-08-11', 'Pending')";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, RID);
            preparedStatement.setString(2, sid);
            preparedStatement.setString(3, itemId);
            preparedStatement.setString(4, quantity);
            rowsAffected = preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
            return rowsAffected;
        
    }
    public static String incrementrequestID() {
        String lastReqID = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT RID FROM requestitems ORDER BY RID DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                lastReqID = rs.getString("RID");
            } else {
                lastReqID = "rbs0000";
            }
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        String prefix = lastReqID.substring(0, 3);
        int numericPart = Integer.parseInt(lastReqID.substring(3));
        numericPart++;
        return prefix + String.format("%04d", numericPart);
    }
    public static String date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nowDate = LocalDate.now();
        return nowDate.toString();
    }
}
