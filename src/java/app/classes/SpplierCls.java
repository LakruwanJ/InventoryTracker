/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;

import java.sql.*;

public class SpplierCls {


    public static String incrementItemID() {
        String lastItemID = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT itemID FROM items ORDER BY itemID DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                lastItemID = rs.getString("itemID");
            } else {
                lastItemID = "item0000";
            }            
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        System.out.println(lastItemID);

        String prefix = lastItemID.substring(0, 4);
        int numericPart = Integer.parseInt(lastItemID.substring(4));
        numericPart++;
        return prefix + String.format("%04d", numericPart);
    }

    public static void addItem(String newID,String itemName, String category, double unitPrice) {
        try {
            Connection con = DBConector.getConnection();
            String sql = "INSERT INTO items (itemID, Name, type, UnitPrice) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, newID);
            pstmt.setString(2, itemName);
            pstmt.setString(3, category);
            pstmt.setDouble(4, unitPrice);
            pstmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
