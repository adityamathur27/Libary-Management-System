/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author adima
 */
public class ConnectionProvider {
    public static Connection getCon(){
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Define the database URL
            String url = "jdbc:mysql://localhost:3306/library_management";
            
            // Provide your database credentials
            String username = "root";
            String password = "Vijanshu@5";

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection; 
        
    }
    
}
