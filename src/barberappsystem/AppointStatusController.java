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
    //calling the view class
    AppointStatusView appointstatusview;
    
    
        public AppointStatusController(){
        //setting up the view class in this class    
        this.appointstatusview = appointstatusview; 
        this.appointstatusview = new AppointStatusView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
                        //set the action command when click the button in the view class
                       if(e.getActionCommand().equals("b3")){
                           //when you click it you dispose this frame
                      appointstatusview.dispose();
                           // when you click it you open the other class frame
                      new UpcomingServiceController();
           
       }                 //set the action command when you clikc the button in the view class
                           if(e.getActionCommand().equals("b5")){
                               //disposing this view
                      appointstatusview.dispose();
                              // open the other class frame
                      new AvailabilityServiceController();
           
       }
    
    
    
    }
    
    
    
}
