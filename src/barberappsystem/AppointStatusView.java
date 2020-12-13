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

/**
 *
 * @author mvini
 */
public class AppointStatusView extends JFrame {
    //setting the controller class in this class
    AppointStatusController appointstatuscontroller;
    
    
        public AppointStatusView (AppointStatusController appointstatuscontroller){
            this.appointstatuscontroller = appointstatuscontroller; 
    attributesSetter();   
    components1(); 
     validation();   
    }
    
        private void attributesSetter(){
       //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Appointment Status");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
       private void validation(){
           // validating and repainting setter
        this.validate();
        this.repaint();
    }
      
                private void components1(){
                //Border layout to set the right position
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // top section
        JPanel topPanel = new JPanel();
        // top section one row two columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // add the panel to the frame
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // panel to the left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // adding it to the top section
        topPanel.add(left);
        // panel to the right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        // logout button
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        // adding to the top panel
        topPanel.add(right);
         
         
        //main area setup
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding to the frame
        this.add(mainArea, BorderLayout.CENTER);
        
        // inner top section setup
        JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        
       
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        
        // inner main section
        JPanel miniMainArea = new JPanel();
        
        // op section into 1 row 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating a line to divide it
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        
        // setting layout null to use the boudns (easier)
        miniMainLeft.setLayout(null);
      
       //creating labels and adding it to the panel               
        JLabel lbllog = new JLabel("UPCOMING APPOINTMENTS");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(110, 10, 200, 10);

        JLabel l4 = new JLabel("<html>Check your upcoming appointments and let your customer know.</html>");
        miniMainLeft.add(l4);
        l4.setBounds(40, 40, 300, 50);
 
        //creating a button with action command (override in controller class
        JButton b3 = new JButton("CHECK");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(appointstatuscontroller);
        b3.setBounds(140, 100, 100, 20);
        
        // adding labels to the panel
        JLabel lbllog2 = new JLabel("SET AVAILABILITY");
        miniMainLeft.add(lbllog2);
        lbllog2.setBounds(130, 210, 200, 10);

        JLabel l5 = new JLabel("Set your availability for next week");
        miniMainLeft.add(l5);
        l5.setBounds(90, 240, 300, 50);
 
        //creating buttons with action command (override in controller class)
        JButton b5 = new JButton("SET");
        miniMainLeft.add(b5);
        b5.setActionCommand("b5");
        b5.addActionListener(appointstatuscontroller);
        b5.setBounds(140, 290, 100, 20);

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // right side into 1 row 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
        // creating a panel to the right side and creating a border to divide it
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        //setting the layout null to user bonds (easier)
        upper.setLayout(null);
        // creating some labels
        JLabel lblreg = new JLabel("APPOINTMENT STATUS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("<html>Amilcar Aponte<br>Phone: 0838713273286<br>Date: 10/11/2020<br>Time: 11:00PM</html>");
        lbl1.setBounds(80, 80, 250, 80);
        upper.add(lbl1);
        
        //creating some buttons
        JButton b4 = new JButton("COMPLETED");
        upper.add(b4);
        b4.setBounds(240, 100, 105, 20);
        
        JButton b6 = new JButton("NO-SHOW");
        upper.add(b6);
        b6.setBounds(240, 130, 100, 20);


        //adding to the panel
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }  
        
        
    
    
}
