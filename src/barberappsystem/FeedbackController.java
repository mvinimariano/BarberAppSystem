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
public class FeedbackController implements ActionListener {
    FeedbackView feedbackview;
    
    
    
    
    public FeedbackController(){
        this.feedbackview =feedbackview; 
   this.feedbackview = new FeedbackView(this);

  
}

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
                     if(e.getActionCommand().equals("b3")){
                      feedbackview.dispose();
                      new HomeCustumerController();
 
           
       }  }
    
}
