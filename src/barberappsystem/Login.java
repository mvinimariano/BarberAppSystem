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
public class Login {
    LoginView loginview;
    String email;
    String password;
    //login method
    public Login(){
        this.email = email;
        this.password = password;


    }
    //login with user parameter
    public boolean loginPage(User user){


        boolean userPage = false;

        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Marcos_2019146?useSSL=false";
            String dbUser = "Marcos_2019146";
            String dbPassword = "2019146";
            String query = "SELECT * FROM User WHERE email = '" + loginview.getValueEmail() + "' AND password = '" + loginview.getValuePassword() + "';";
            

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);
            
            // Loop through the result set
            if (rs.next()) {
                userPage = true;
            }

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return userPage;
 
         
        
    }


}
