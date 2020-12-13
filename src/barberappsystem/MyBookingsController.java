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
public class MyBookingsController  implements ActionListener{
    
    MyBookingsView mybookingsview;
    
    
    
     public MyBookingsController(){
        this.mybookingsview = mybookingsview;
        this.mybookingsview = new MyBookingsView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
               if(e.getActionCommand().equals("b5")){
                   //dispose this frame and opens a new one
                      mybookingsview.dispose();
            new FeedbackController();
           
       }          
                    if(e.getActionCommand().equals("b3")){
                        //dispose this frame and opens a new one
                      mybookingsview.dispose();
                      new HomeCustumerController();
 
           
       }   
        
        
        if(e.getActionCommand().equals("b4")){
            //option pane asking with the user wants to cancel the booking
       
  int option = JOptionPane.showConfirmDialog(mybookingsview, "Cancel your booking?", "Cancel your booking", JOptionPane.YES_NO_OPTION);

if (option == 0) { 
   
   JOptionPane.showMessageDialog(mybookingsview, "Booking successfully canceled!");
} 
    
 
        
    
    
    
    
    }
    }   
}
