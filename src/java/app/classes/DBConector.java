/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.classes;

import java.sql.*;

public class DBConector {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/inventorytracker";
    static final String DB_USER = "inventory";
    static final String DB_PASSWORD = "inventory";
    static Connection con;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        return con;
    }
}
