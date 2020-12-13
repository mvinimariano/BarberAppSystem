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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class HomeServiceView extends JFrame implements ActionListener{
    HomeServiceController homeservice;
    
    public HomeServiceView (HomeServiceController homeservicecontrolle){
        this.homeservice = homeservice;
    attributesSetter();   
    components1(); 
    validation();
    }
    
    
    
    private void attributesSetter(){
        //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Home Page");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
       private void validation(){
           // validating and repainting setter
        this.validate();
        this.repaint();
    }
       
              private void components1(){
        
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // top section
        JPanel topPanel = new JPanel();
        // spliting in 1 row and 2 columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // adding panel to the frame
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // adding the top section
        topPanel.add(left);
        // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        //adding it to the top section
        topPanel.add(right);
         
         
                // main area
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding this to the frame
        this.add(mainArea, BorderLayout.CENTER);
         JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        

        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);

        JPanel miniMainArea = new JPanel();
        
        //creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating border line just for desing
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting the layout null to use the bounds
        miniMainLeft.setLayout(null);

        JLabel lbllog = new JLabel("UPCOMING APPOINTMENTS");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(110, 10, 200, 10);

        JLabel l4 = new JLabel("<html>Check your upcoming appointments and let your customer know.</html>");
        miniMainLeft.add(l4);
        l4.setBounds(40, 40, 300, 50);
        //check button with action command
        JButton b10 = new JButton("CHECK");
        miniMainLeft.add(b10);
        b10.setActionCommand("b10");
        b10.addActionListener(this);
        b10.setBounds(140, 100, 100, 20);
        
        
        JLabel lbllog2 = new JLabel("SET AVAILABILITY");
        miniMainLeft.add(lbllog2);
        lbllog2.setBounds(130, 210, 200, 10);

        JLabel l5 = new JLabel("Set your availability for next week");
        miniMainLeft.add(l5);
        l5.setBounds(90, 240, 300, 50);
        //set button with action command
        JButton b5 = new JButton("SET");
        miniMainLeft.add(b5);
        b5.setActionCommand("b5");
        b5.addActionListener(this);
        b5.setBounds(140, 290, 100, 20);

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       //upper panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting layout null to use bounds
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("APPOINTMENT STATUS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);

        JLabel lbl1 = new JLabel("Check your appointment status for today");
        lbl1.setBounds(80, 80, 250, 20);
        upper.add(lbl1);
        //check button with action command
        JButton b4 = new JButton("CHECK");
        upper.add(b4);
        b4.setBounds(140, 130, 100, 20);
        b4.setActionCommand("b4");
        b4.addActionListener(this);
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                      if(e.getActionCommand().equals("b10")){
                          //dispose this frame and opens a new one
                      this.dispose();
                      new UpcomingServiceController();
           
       } 
                          if(e.getActionCommand().equals("b5")){
                              //dispose this frame and opens a new one
                      this.dispose();
                      new AvailabilityServiceController();
           
       }
                          if(e.getActionCommand().equals("b4")){
                              //dispose this frame and opens a new one
                      this.dispose();
                      new AppointStatusController();
           
       }
    
    
    
    
    
    }
    
}
