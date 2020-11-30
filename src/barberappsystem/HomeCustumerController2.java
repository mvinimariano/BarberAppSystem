/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mvini
 */
public class HomeCustumerController2 implements ActionListener {
        HomeCustumerView2 homecustomerView2;
    
    
     public HomeCustumerController2(){
         
        this.homecustomerView2 = homecustomerView2;
        this.homecustomerView2 = new HomeCustumerView2(this);

  
}
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("b3")){
                      homecustomerView2.dispose();
            new HomeCustumerController();
           
       } 
             if(e.getActionCommand().equals("b4")){
                      homecustomerView2.dispose();
            new DateTimeCustomerController();
           
       }  
       
        }

    
}
    

