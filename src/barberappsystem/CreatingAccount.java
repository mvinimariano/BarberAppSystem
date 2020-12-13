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
public class CreatingAccount {
    //calling the other classes
    User usercreating;
    LoginView loginview;
   DataBase datab;
        //method to create an account
    public CreatingAccount(String name, String email,String password, String location, String phoneNum) throws SQLException{
        this.usercreating = new User(name,email,password,location,phoneNum);
        datab = new DataBase();
    }
       //method to send the information to the database
 public boolean CreateUser(){
        try {
            String query = "INSERT INTO Marcos_2019146.User (full_name, email, mobile_number,password, location) VALUES ('" + usercreating.getName()+ "','" +  usercreating.getEmail() + "','"+  usercreating.getPhoneNum() +"','" + usercreating.getPassword() +"','" + usercreating.getLocation() + "')";
            
            //Execute the query
            datab.execute(query);
            
            datab.close();
            
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            
            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                
                se = se.getNextException();
            }
            return false;
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }


    
}




     
            
                  
               
     
    
