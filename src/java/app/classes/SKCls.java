/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class SKCls {

    public List<String> getAllItemIds() throws ClassNotFoundException {
        List<String> itemIds = new ArrayList<>();
        try {
            Connection con = DBConector.getConnection();
            String query = "SELECT itemID FROM items";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String itemId = resultSet.getString("itemID");
                itemIds.add(itemId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemIds;
    }

    public List<String> getAllSupplierIds() throws ClassNotFoundException {
        List<String> supIds = new ArrayList<>();
        try {
            Connection con = DBConector.getConnection();
            String query = "SELECT SID FROM supplier";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String sid = resultSet.getString("SID");
                supIds.add(sid);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return supIds;
    }
    public List<String> getAllWHID() throws ClassNotFoundException {
        List<String> WHIds = new ArrayList<>();
        
        try {
            Connection con = DBConector.getConnection();
            String query = "SELECT StockID FROM stock";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String WHId = resultSet.getString("StockID");
                WHIds.add(WHId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return WHIds;
    }
    
    public List<Integer> getAC() throws ClassNotFoundException {
    List<Integer> ACS = new ArrayList<>();
    
    try {
        Connection con = DBConector.getConnection();
        String query = "SELECT FullCapacity, StoredCapacity FROM stock";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int FC = resultSet.getInt("FullCapacity");
            int FiC = resultSet.getInt("StoredCapacity");
            int AC = FC - FiC;
            ACS.add(AC);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return ACS;
}
    public List<String> getAllMTeamIds() throws ClassNotFoundException {
        List<String> mIds = new ArrayList<>();
        try {
            Connection con = DBConector.getConnection();
            String query = "SELECT MID FROM marketingteam";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String mid = resultSet.getString("MID");
                mIds.add(mid);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mIds;
    }

}
