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
public class AppointStatusController implements ActionListener {
    AppointStatusView appointstatusview;
    
    
        public AppointStatusController(){
        this.appointstatusview = appointstatusview; 
        this.appointstatusview = new AppointStatusView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
                       if(e.getActionCommand().equals("b3")){
                      appointstatusview.dispose();
                      new UpcomingServiceController();
           
       } 
                           if(e.getActionCommand().equals("b5")){
                      appointstatusview.dispose();
                      new AvailabilityServiceController();
           
       }
    
    
    
    }
    
    
    
}
