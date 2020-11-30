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
public class HomeCustumerController implements ActionListener {
    
    HomeCustumerView homecustomerView;
    
    
     public HomeCustumerController(){
         
        this.homecustomerView = homecustomerView;
        this.homecustomerView = new HomeCustumerView(this);

  
}
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("b10")){
                      homecustomerView.dispose();
            new HomeCustumerController2();
           
       } 
             if(e.getActionCommand().equals("b4")){
                      homecustomerView.dispose();
            new MyBookingsController();
           
       }  
       
       
    }
    
}
