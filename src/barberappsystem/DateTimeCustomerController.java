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
public class DateTimeCustomerController implements ActionListener{
    //calling the other class
    DateTimeCustomerView datetimecustomerview;
    
    
         public DateTimeCustomerController(){
        this.datetimecustomerview = datetimecustomerview;
        this.datetimecustomerview = new DateTimeCustomerView(this);

  
}
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
                    if(e.getActionCommand().equals("b3")){
                        //setting action command and dispose this frame and opens other one
                      datetimecustomerview.dispose();
                      new HomeCustumerController();
 
           
       } 
    
    
    
    }
    
}
