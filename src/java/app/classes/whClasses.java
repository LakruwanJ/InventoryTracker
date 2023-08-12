/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class whClasses {
    private  Connection connection;
    private  String jdbcURL = "jdbc:mysql://localhost:3306/it_2";
    private  String jdbcUsername = "root";
    private  String jdbcPassword = "";
    
    public whClasses(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet getWH() throws SQLException{
    int rowCount = 0;
        String query = "SELECT * FROM stock";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet whData = statement.executeQuery();
        return whData;
    }

    public ResultSet getItemsAR() throws SQLException{
    int rowCount = 0;
        String query = "SELECT * FROM addremove,items WHERE addremove.itemID=items.itemID AND addremove.Status = 'add'"; 
               
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet itData = statement.executeQuery();
        return itData;
    }
    

}
   

    

