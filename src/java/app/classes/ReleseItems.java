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
public class ReleseItems {

    public int insertRelese(String RLID, String MID, String itemID, String quantity) throws ClassNotFoundException {
        int rowsAffected = 0;
        Connection con = null;
        PreparedStatement preparedStatement = null;
       

        try {

            con = DBConector.getConnection();
            String query = "INSERT INTO releaseitem (RLID, SKID, MID, itemID, Quantity, Date, Status) VALUES (?,'SK0002', ?, ?, ?, '2023-08-11', 'Delivered')";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, RLID);
            preparedStatement.setString(2, MID);
            preparedStatement.setString(3, itemID);
            preparedStatement.setString(4, quantity);
            rowsAffected = preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
            return rowsAffected;
        
    }
    public static String incrementrlID() {
        String lastRtmID = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT RLID FROM releaseitem ORDER BY RLID DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                lastRtmID = rs.getString("RLID");
            } else {
                lastRtmID = "rtm0000";
            }
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        String prefix = lastRtmID.substring(0, 3);
        int numericPart = Integer.parseInt(lastRtmID.substring(3));
        numericPart++;
        return prefix + String.format("%04d", numericPart);
    }
    public static String date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nowDate = LocalDate.now();
        return nowDate.toString();
    }
}
