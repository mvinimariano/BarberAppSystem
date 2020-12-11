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
    User usercreating;
    LoginView loginview;
    DataBase db;
    
public CreatingAccount(String name, String email,String password, String location, String phoneNum) throws SQLException{
    this.usercreating = new User(name,email,password,location,phoneNum);
          
}

 public boolean writeUser(){
        try {
            DataBase db = new DataBase();
            
            String query = "INSERT INTO Marcos_2019146.User (full_name, email, mobile_number,password, location) VALUES ('" + usercreating.getName()+ "','" +  usercreating.getEmail() + "','"+  usercreating.getPhoneNum() +"','" + usercreating.getPassword() +"','" + usercreating.getLocation() + "')";
            
            //Execute the query
            db.execute(query);
            
            db.close();
            
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
    
    public boolean checkingPassword (){
        if (!usercreating.getPassword().equals(usercreating.getPassword())){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    boolean checkingEmail(String email) {
        try {
            
            
            String query = "SELECT COUNT(email) from Marcos_2019146.User WHERE email = '"+email+"'";
            
            ResultSet rs = db.executeQuery(query);
            if(rs.next()){
                if (rs.getInt(1)>0){
                    return true;
                }
            }
            db.close();
            
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
        return false;
        
    }
    
    
    
}




     
            
                  
               
     
    
