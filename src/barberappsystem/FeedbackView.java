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
        this.feedbackcontroller = feedbackcontroller;
    attributesSetter();   
    components2(); 
    validation();   
    }


        private void attributesSetter(){
            //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Feedback");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        private void validation(){
            // validating and repainting setter
        this.validate();
        this.repaint();
    }
        
                private void components2(){
        
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // creating a panel
        JPanel topPanel = new JPanel();
        // spliting it in 1 row and 2 columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // adding it to the frame
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // adding it to the panel
        topPanel.add(left);
         // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);
        topPanel.add(right);
         
         
                // main area
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding this to the frame
        this.add(mainArea, BorderLayout.CENTER);
        //new panel
        JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        
        // main panel
        JPanel miniMainArea = new JPanel();
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // adding border just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        // setting layout null to use bounds
        miniMainLeft.setLayout(null);

                
        JLabel lbllog = new JLabel("BOOK AN APPOINTMENT");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(130, 10, 200, 10);
        JLabel l4 = new JLabel("Find your Hairdresser/Barber by name or location: ");
        TF1 = new JTextField(15);
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(40, 40, 300, 20);
        TF1.setBounds(90, 80, 200, 20);
        //search button with action command
        JButton b3 = new JButton("Search");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(feedbackcontroller);
        
        b3.setBounds(140, 130, 100, 20);

        //right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        //creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        // upper panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting layout null to use bounds
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
        //creating a text area to the feedback and using scrollbar
        feedback = new JTextArea();
        upper.add(feedback);
        feedback.setBounds(20, 170, 350, 200);
        JScrollPane js = new JScrollPane();
        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(20, 170, 350, 200);
        js.getViewport().add(feedback);
        
        upper.add(js);
        //submit button
        JButton b4 = new JButton("SUBMIT");
        upper.add(b4);
        b4.setBounds(150, 380, 100, 20);
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
