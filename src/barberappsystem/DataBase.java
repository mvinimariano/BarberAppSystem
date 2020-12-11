/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mvini
 */
public class DataBase {
    String dbServer = "jdbc:mysql://apontejaj.com:3306/Marcos_2019146?useSSL=false";
    String dbUser = "Marcos_2019146";
    String dpPassword = "2019146";
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    public ResultSet executeQuery(String query) throws SQLException{
        // Get a connection to the database
        conn = DriverManager.getConnection(dbServer, dbUser, dpPassword);
        // Get a statement from the connection
        stmt = conn.createStatement();
        //Execute the query
        rs = stmt.executeQuery(query);
        
        return rs;
    }
    public boolean execute(String query) throws SQLException{
        // Get a connection to the database
        conn = DriverManager.getConnection(dbServer, dbUser, dpPassword);
        // Get a statement from the connection
        stmt = conn.createStatement();
        //Execute the query
        boolean result = stmt.execute(query);
        
        return result;
    }
    
    public void close() throws SQLException{
        // Close the result set, statement and the connection
            
        if(stmt != null){
            stmt.close();
        }
        if(conn != null){
            conn.close();
        }
        if(rs != null){
            rs.close();
        }
    }
}
    

