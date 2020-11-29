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
public class MyBookingsController  implements ActionListener{
    
    MyBookingsView mybookingsview;
    
    
    
     public MyBookingsController(){
        
        this.mybookingsview = new MyBookingsView(this);

  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
