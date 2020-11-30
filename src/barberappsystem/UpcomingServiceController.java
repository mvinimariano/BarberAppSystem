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
public class UpcomingServiceController implements ActionListener{
    UpcomingServiceView upcomingserviceview;
    
     public UpcomingServiceController(){
        this.upcomingserviceview = upcomingserviceview;
        this.upcomingserviceview = new UpcomingServiceView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("b3")){
      JOptionPane.showMessageDialog(upcomingserviceview,
"You have confirmed the appointment!",
"Confirmation",
JOptionPane.INFORMATION_MESSAGE);
         
     }
                
                       if(e.getActionCommand().equals("b4")){
                      upcomingserviceview.dispose();
                      new AppointStatusController();
           
       } 
                       
                              if(e.getActionCommand().equals("b5")){
                      upcomingserviceview.dispose();
                      new AvailabilityServiceController();
           
       } 
    
    
    
    
    }
    
    
}
