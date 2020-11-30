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
public class AvailabilityServiceController implements ActionListener {
    AvailabilityServiceView availabilityserviceview;
    
    
    
        public AvailabilityServiceController(){
        this.availabilityserviceview = availabilityserviceview; 
        this.availabilityserviceview = new AvailabilityServiceView(this);

  
}
       

    @Override
    public void actionPerformed(ActionEvent e) {
             if(e.getActionCommand().equals("b5")){
        JOptionPane.showMessageDialog(availabilityserviceview,
        "You have submited your availability!",
        "Confirmation",
        JOptionPane.INFORMATION_MESSAGE);
         } 
                       if(e.getActionCommand().equals("b3")){
                      availabilityserviceview.dispose();
                      new UpcomingServiceController();
           
       } 
                       if(e.getActionCommand().equals("b4")){
                      availabilityserviceview.dispose();
                      new AppointStatusController();
           
       }              
             
             
             
             
             
             
        }
        
        
        
        
        
    }
    
    
    

