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
        
            String userEmail = loginview.getValueEmail();
            String userPassword = loginview.getValuePassword();
            
            User user = new User(userEmail,userPassword);
            
            boolean userPage = login.loginPage(user);
            boolean barberPage = login.loginBarber(user);    
        
        
        
        if(e.getActionCommand().equals("b3") && userPage){
            loginview.dispose();
            new HomeCustumerController();        
    
        }
        if(e.getActionCommand().equals("b3")&& barberPage){
            loginview.dispose();
            new HomeServiceController();
   
        }
        
        
        
        
        
        
        
        
//              if(e.getActionCommand().equals("b4")){
//      JOptionPane.showMessageDialog(loginview,
//"<html>User registration successful!<br>PLEASE, LOGIN</html>",
//"Confirmation",
//JOptionPane.INFORMATION_MESSAGE);
//     }
              
    String name = loginview.getName();
    String email = loginview.getEmail();    
    String password = loginview.getPass();
    String location = loginview.getLocationR();
    String phoneNum = loginview.getPhoneNumb();


    
    
    User user1 = new User(name,email,password,location,phoneNum);  
        
        
              
              
              
//       if(e.getActionCommand().equals("b3")){
//                      loginview.dispose();
//            new HomeCustumerController();
////                      new HomeServiceController();
//           
//       } 
       
//              if(e.getActionCommand().equals("Login")){
//                creatingAcc.CreatingAccount1(user);
//                  System.out.println("FOIIIII");
//       } 
    
                if(e.getActionCommand().equals("b4")){
                    
//        try {
//            CreatingAccount CA = new CreatingAccount(this.loginview.getFullName(),this.loginview.getEmail(),this.loginview.getLocationR(),this.loginview.getPhoneNumb(),this.loginview.getLocationR());
//        } catch (SQLException ex) {
//            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//        }


             if(loginview.getFullName().isEmpty()||loginview.getEmail().isEmpty() || loginview.getLocationR().isEmpty() || loginview.getPhoneNumb().isEmpty() || loginview.getLocationR().isEmpty()){
                JOptionPane.showMessageDialog(loginview,"Please, fill all the spaces");
            }else{
                 try{
                     creatingAcc = new CreatingAccount(name,email,password,location,phoneNum);
                     if(creatingAcc.writeUser()){
                         System.out.println("eaeaeaeea");
                         loginview.dispose();
                         new LoginController();                     
                         
                         
                     }
                 }catch(Exception ex){
                     JOptionPane.showMessageDialog(loginview, "DB ERROR: " + ex.getMessage());
                     
                     
                 }
     //instajj
                 
             }
             
    
        }
        
        
        
        
    }
    
}
