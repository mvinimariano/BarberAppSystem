/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mvini
 */
public class LoginController implements ActionListener{
    LoginView loginview;
    CreatingAccount creatingAcc;
    User user;
    Login login;

        public LoginController(){
            this.loginview = new LoginView (this);
            this.login = new Login();
        }
    

 
    
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e)  {
            //creating 2 strings to get the input from the user
            String userEmail = loginview.getValueEmail();
            String userPassword = loginview.getValuePassword();
            //putting the user input in the User
            User user = new User(userEmail,userPassword);
            
            boolean userPage = login.loginPage(user);

        if(e.getActionCommand().equals("b3")){
            //dispose this view and opens a new one
            loginview.dispose();
            new HomeCustumerController();        
    
        }

    //creating the variables to get the user input
    String name = loginview.getFullName();
    String password = loginview.getPass();
    String email = loginview.getEmail();
    String location = loginview.getLocationR();
    String phoneNum = loginview.getPhoneNumb();


    
    //putitng the variables into the user
    User user1 = new User(name,email,password,location,phoneNum);  
        

                if(e.getActionCommand().equals("b4")){
                    //checking if the text fields are empty or not
                    if(loginview.getFullName().isEmpty()||loginview.getEmail().isEmpty() || loginview.getLocationR().isEmpty() || loginview.getPhoneNumb().isEmpty() || loginview.getLocationR().isEmpty()){
                JOptionPane.showMessageDialog(loginview,"Please, fill all the spaces");
            }else{
                 try{
                     //creating the user
                     creatingAcc = new CreatingAccount(name,email,password,location,phoneNum);
                     if(creatingAcc.CreateUser()){
                         JOptionPane.showMessageDialog(loginview,
                "<html>User registration successful!<br>PLEASE, LOGIN</html>",
                    "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);

                         loginview.dispose();
                         new LoginController();                     
                         
                         
                     }
                 }catch(Exception ex){
                     JOptionPane.showMessageDialog(loginview, "DB ERROR: " + ex.getMessage());
                     
                     
                 }

             }
             
    
        }
        
        
        
        
    }
    
}
