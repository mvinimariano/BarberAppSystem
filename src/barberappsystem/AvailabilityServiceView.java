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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author mvini
 */
public class AvailabilityServiceView extends JFrame {
 //calling the controller in this class
    AvailabilityServiceController availabilityservicecontroller;
    
   public AvailabilityServiceView(AvailabilityServiceController availabilityservicecontroller){
    this.availabilityservicecontroller = availabilityservicecontroller;
    attributesSetter();   
    components1(); 
     validation();   
    }


      //setting the frame to make it visible, size, title, position and to stop the program when you close the window
       private void attributesSetter(){
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Set Availability");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       // validating and repainting setter
       private void validation(){
        this.validate();
        this.repaint();
    }
    
       private void components1(){
        
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);
        //creating the panel
        JPanel topPanel = new JPanel();
        // spliting the panel in 1 row and 2 columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // adding the panel to the frame
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // adding to the left side
        topPanel.add(left);
        // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        // adding to the top panel
        topPanel.add(right);
         
         
                // main area
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding to the frame
        this.add(mainArea, BorderLayout.CENTER);
        
        // top panel
        JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        
       
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        
        // top panel area
        JPanel miniMainArea = new JPanel();
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating a border just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting the layout null to configure the positions (easier)
        miniMainLeft.setLayout(null);
      
        //creating some labels and using the bounds
        JLabel lbllog = new JLabel("UPCOMING APPOINTMENTS");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(110, 10, 200, 10);

        JLabel l4 = new JLabel("<html>Check your upcoming appointments and let your customer know.</html>");
        miniMainLeft.add(l4);
        l4.setBounds(40, 40, 300, 50);
          // creating buttons and setting actioncommand
        JButton b3 = new JButton("CHECK");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(availabilityservicecontroller);
        b3.setBounds(140, 100, 100, 20);
        
        
        JLabel lbllog2 = new JLabel("SET AVAILABILITY");
        miniMainLeft.add(lbllog2);
        lbllog2.setBounds(130, 210, 200, 10);
         //creating a table to submit the hours
        String[] colNames = {"Date","Hour","Availability"};
        String[][] data = {
            {"  ","  ","  "},
                        
        };
        
        JTable t = new JTable(data, colNames);
        JScrollPane sp = new JScrollPane(t);
        
        
        miniMainLeft.add(sp);
        sp.setBounds(40, 240, 300, 60);
         //creating a button and setting actioncommand
        JButton b5 = new JButton("SUBMIT");
        miniMainLeft.add(b5);
        b5.setActionCommand("b5");
        b5.setBounds(140, 310, 100, 20);
        b5.addActionListener(availabilityservicecontroller);
        
        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       //creating a panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting the layout null
        upper.setLayout(null);
        //creating a label and setting the bounds
        JLabel lblreg = new JLabel("APPOINTMENT STATUS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("Check your appointment status for today");
        lbl1.setBounds(80, 80, 250, 20);
        upper.add(lbl1);
         //creating a button to check the appointment status
        JButton b4 = new JButton("CHECK");
        upper.add(b4);
        b4.setActionCommand("b4");
        b4.addActionListener(availabilityservicecontroller);
        b4.setBounds(140, 130, 100, 20);
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }
       
       
       

    
}
