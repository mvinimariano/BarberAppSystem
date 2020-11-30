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
    
    DateTimeCustomerView datetimecustomerview;
    
    
         public DateTimeCustomerController(){
        this.datetimecustomerview = datetimecustomerview;
        this.datetimecustomerview = new DateTimeCustomerView(this);

  
}
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
                    if(e.getActionCommand().equals("b3")){
                      datetimecustomerview.dispose();
                      new HomeCustumerController();
 
           
       } 
    
    
    
    }
    
}
