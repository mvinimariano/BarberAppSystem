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
public class HomeServiceController implements ActionListener{
    HomeServiceView homeservice;
    
    
   public HomeServiceController(){
        this.homeservice = homeservice;
        this.homeservice = new HomeServiceView(this);

  
}

    
    @Override
    public void actionPerformed(ActionEvent e) {
                    if(e.getActionCommand().equals("b10")){
                        //dispose this frame and opens a new one
                      homeservice.dispose();
                      new HomeCustumerController();
           
       } 
  
       
        }

    

    
    
}
