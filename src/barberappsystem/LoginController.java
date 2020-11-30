/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mvini
 */
public class LoginController implements ActionListener{
    
    LoginView loginview;
    
    
        public LoginController(){
        this.loginview = loginview;
        this.loginview = new LoginView (this);

  
}
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
              if(e.getActionCommand().equals("b4")){
      JOptionPane.showMessageDialog(loginview,
"<html>User registration successful!<br>PLEASE, LOGIN</html>",
"Confirmation",
JOptionPane.INFORMATION_MESSAGE);
     }
       if(e.getActionCommand().equals("b3")){
                      loginview.dispose();
//            new HomeCustumerController();
                      new HomeServiceController();
           
       } 
        
        
        
        
        
        
    }
    
}
