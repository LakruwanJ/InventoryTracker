/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class RequestItemsDao {
    public boolean insertRequest(String sid, String itemId, int quantity) throws ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;

        try {
            
           Connection con = DBConector.getConnection();            
            String query = "INSERT INTO requestitems (SID, itemID, Quantity) VALUES (?, ?, ?)";        
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sid);
            preparedStatement.setString(2, itemId);
            preparedStatement.setInt(3, quantity);           
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return success;
    }
}
