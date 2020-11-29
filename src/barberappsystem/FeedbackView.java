/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author mvini
 */
public class FeedbackView extends JFrame{
    FeedbackController feedbackcontroller;
    private JTextField TF1; // user enter barber location/name
    private JTextArea feedback; // feedback field
    
    public FeedbackView (FeedbackController feedbackcontroller){
    attributesSetter();   
    components2(); 
    validation();   
    }


        private void attributesSetter(){
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Home Page");
        this.setLocationRelativeTo(null);
    }
    
        private void validation(){
        this.validate();
        this.repaint();
    }
        
                private void components2(){
        
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // TOP SECTION SETUP
        JPanel topPanel = new JPanel();
        // DEVIDING TOP SECTION INTO TWO (ONE ROW - TWO COLUMNS)
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // ADDING THE PANEL TO THE FRAME
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // ORGANISING LEFT HAND SIDE
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // ADDING IT TO THE TOP SECTION
        topPanel.add(left);
 // ORGANISING THE RIGHT HAND SIDE
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        // ADDING IT TO THE TOP SECTION
        topPanel.add(right);
         
         
                // MAIN AREA SETUP
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // ADDING THIS TO THE FRAME
        this.add(mainArea, BorderLayout.CENTER);
        
        // INNER TOP SECTION SETUP
        JPanel miniTopPanel = new JPanel();
        // HERE WE DON'T NEED TWO SECTIONS, SO JUST THE FLOW
        // LAYOUT WILL DO
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        
       
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        
        // INNER MAIN SECION SETUP
        JPanel miniMainArea = new JPanel();
        
        // DEVIDING TOP SECTION INTO TWO (ONE ROW - TWO COLUMNS)
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // ORGANISING LEFT HAND SIDE
        JPanel miniMainLeft = new JPanel();
        
        // JUST A BIT OF A TREAT TO SEE THE BORDER OF THE PANEL
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        
        miniMainLeft.setLayout(null);
      
        // WE CAN ADD A FLOW LAYOUT MANAGER HERE TO PUT IT IN THE MIDDLE
                
        JLabel lbllog = new JLabel("BOOK AN APPOINTMENT");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(130, 10, 200, 10);

        
        
        JLabel l4 = new JLabel("Find your Hairdresser/Barber by name or location: ");
        TF1 = new JTextField(15);
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(40, 40, 300, 20);
        TF1.setBounds(90, 80, 200, 20);
        

        
        
        JButton b3 = new JButton("Search");
        miniMainLeft.add(b3);
        b3.setBounds(140, 130, 100, 20);

        // ORGANISING RIGHT HAND SIDE
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // DEVIDING MINI RIGHT SECCTION INTO TWO (TWO ROWS - ONE COLUMN)
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("REVIEW YOUR RECENT VISITS");
        lblreg.setBounds(100, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("<html>Your feedback help us to improve<br> the experience for our customers.</html>");
        lbl1.setBounds(100, 60, 450, 70);
        upper.add(lbl1);
        
        JLabel lbl2 = new JLabel("How was your visit?");
        lbl2.setBounds(20, 150, 200, 10);
        upper.add(lbl2);
        
        feedback = new JTextArea();
        upper.add(feedback);
        feedback.setBounds(20, 170, 350, 200);
        JScrollPane js = new JScrollPane();
        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(20, 170, 350, 200);
        js.getViewport().add(feedback);
        
        upper.add(js);
       


	
	
	
      
        
        

        JButton b4 = new JButton("SUBMIT");
        upper.add(b4);
        b4.setBounds(150, 380, 100, 20);
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
