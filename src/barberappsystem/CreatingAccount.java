/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mvini
 */
public class CreatingAccount {
    User usercreating;
    LoginView loginview;
    
public CreatingAccount(String name, String email,String password, String location, String phoneNum) throws SQLException{
    this.usercreating = new User(name,email,password,location,phoneNum);
    this.CreatingAccount1(usercreating);
      
}

     
    public void CreatingAccount1(User usercreating) throws SQLException{
                Connection conn = null;
                
                    try {
               
     
                String dbServer = "jdbc:mysql://apontejaj.com:3306/Marcos_2019146?useSSL=false";
                String user = "Marcos_2019146";
                String password = "2019146";
                String query = "INSERT INTO Marcos_2019146.User (full_name,email,mobile_number,password,location) VALUES ('" + usercreating.getName() + "','" + usercreating.getEmail() + "','" + usercreating.getPhoneNum()+ "','" + usercreating.getPassword()+ "','" + usercreating.getLocation()+ "')" ;
                        System.out.println("OQUE QUE EHH");

                
                
               conn = DriverManager.getConnection(dbServer, user, password);

               Statement stmt = conn.createStatement();
               stmt.execute(query);


              
                stmt.close();
//                conn.close();

                } catch (SQLException se) {
                System.out.println("SQL Exception:");

                
                
                while (se != null) {
                    System.out.println("State  : " + se.getSQLState());
                    System.out.println("Message: " + se.getMessage());
                    System.out.println("Error  : " + se.getErrorCode());

                    se = se.getNextException();
                }
            } catch (Exception e) {
                System.out.println(e);     
        }finally{conn.close();}
                    
          
        }
    
    
    
        
        
    }
    

