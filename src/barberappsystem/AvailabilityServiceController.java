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
        
        this.availabilityserviceview = new AvailabilityServiceView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
     int n = JOptionPane.showConfirmDialog(null,"Are you sure you want to close?", "Confirm", JOptionPane.YES_NO_OPTION);
        
    if(n == 0){
      System.exit(0);
            
        }
        
        
        
        
        
    }
    
    
    
}
