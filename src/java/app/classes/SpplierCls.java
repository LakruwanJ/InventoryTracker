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
    
    public static void updateItem(String ID,String itemName, String category, double unitPrice) {
        
        try {
            Connection con = DBConector.getConnection();
            String sql = "UPDATE items SET Name=?,type=?,UnitPrice=? WHERE itemID=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, itemName);
            pstmt.setString(2, category);
            pstmt.setDouble(3, unitPrice);
            pstmt.setString(4, ID);
            pstmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteItem(String ID) {
        try {
            Connection con = DBConector.getConnection();
            String sql = "DELETE FROM items WHERE itemID=?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, ID);
            pstmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet viewitems() {
        ResultSet rs = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT * FROM items";
            PreparedStatement pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet RequestBySK() {
        ResultSet rs = null;
        try {
            Connection con = DBConector.getConnection();
            String sql = "SELECT * FROM requestitems";
            PreparedStatement pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet TransferToSK() {
        ResultSet rs = null;
        try {
            Connection con = DBConector.getConnection();          
            String sql = "SELECT SupplyID,SID as Suppplier ,itemID as Item,SKID as Stock_Keeper,Quantity,date,Confirm FROM supply";
            PreparedStatement pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
  
    
    

}
