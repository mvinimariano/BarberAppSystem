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
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class MyBookingsView extends JFrame  {
    MyBookingsController mybookingscontroller;
    private JTextField TF1; // user enter barber location/name
    
    public MyBookingsView (MyBookingsController mybookingscontroller){
        this.mybookingscontroller = mybookingscontroller;
    attributesSetter();   
    components3(); 
    validation();   
    }
    
        private void attributesSetter(){
        //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("My Bookings");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        private void validation(){
         // validating and repainting setter
        this.validate();
        this.repaint();
    }
        
         private void components3(){
        
        BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // top panel
        JPanel topPanel = new JPanel();
        // creating 1 row and 2 columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // adding this to the panel
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Login Successful, Hello *****USERNAME****");
        left.add(l1);
        l1.setBounds(25, 15, 250, 20);
        
        // adding to the top panel
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
         
         
                // main area panel
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding this to the frame
        this.add(mainArea, BorderLayout.CENTER);
        
        // mini top panel
        JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        
       
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        
        // mini area panel
        JPanel miniMainArea = new JPanel();
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating a border line just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting layout null to use bounds

        // creating label
        JLabel lbllog = new JLabel("BOOK AN APPOINTMENT");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(130, 10, 200, 10);

        
        
        JLabel l4 = new JLabel("Find your Hairdresser/Barber by name or location: ");
        TF1 = new JTextField(15);
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(40, 40, 300, 20);
        TF1.setBounds(90, 80, 200, 20);
        

        
        //creating search button
        JButton b3 = new JButton("Search");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(mybookingscontroller);
        b3.setBounds(140, 130, 100, 20);

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
        // setting layout null to use bounds
        upper.setLayout(null);

        //creating some labels
        JLabel lblreg = new JLabel("VIEW YOUR BOOKINGS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);

        JLabel lbl1 = new JLabel("UPCOMING BOOKINGS:  ");
        lbl1.setBounds(60, 60, 200, 20);
        upper.add(lbl1);
        
        JLabel lbl2 = new JLabel("Barber: Irish Barbers");
        lbl2.setBounds(60, 90, 200, 20);
        upper.add(lbl2);
        
        JLabel lbl3 = new JLabel("Location: 3 Irishtown Rd");
        lbl3.setBounds(60, 105, 200, 20);
        upper.add(lbl3);
        
        JLabel lbl4 = new JLabel("Date: 10/05/21");
        lbl4.setBounds(60, 120, 200, 20);
        upper.add(lbl4);
        
        JLabel lbl5 = new JLabel("Time: 04:00PM");
        lbl5.setBounds(60, 135, 200, 20);
        upper.add(lbl5);
        // cancel button with action command
        JButton b4 = new JButton("CANCEL");
        upper.add(b4);
        b4.setBounds(140, 170, 100, 20);
        b4.setActionCommand("b4");
        b4.addActionListener(mybookingscontroller);
        
        
        //pasting bookings label
        JLabel lbl6 = new JLabel("PASTING BOOKINGS:  ");
        lbl6.setBounds(60, 210, 200, 20);
        upper.add(lbl6);
        
        JLabel lbl7 = new JLabel("Review your recent bookings:  ");
        lbl7.setBounds(60, 240, 200, 20);
        upper.add(lbl7);
        
        JLabel lbl8 = new JLabel("Barber: Bruce Barbers");
        lbl8.setBounds(60, 260, 200, 20);
        upper.add(lbl8);
        
        JLabel lbl9 = new JLabel("Location: 2 Spruce St");
        lbl9.setBounds(60, 275, 200, 20);
        upper.add(lbl9);
        
        JLabel lbl11 = new JLabel("Date: 10/02/20");
        lbl11.setBounds(60, 290, 200, 20);
        upper.add(lbl11);
        
        JLabel lbl12 = new JLabel("Time: 01:00PM");
        lbl12.setBounds(60, 305, 200, 20);
        upper.add(lbl12);
        //review button with action command
        JButton b5 = new JButton("REVIEW");
        upper.add(b5);
        b5.setActionCommand("b5");
        b5.addActionListener(mybookingscontroller);
        b5.setBounds(140, 340, 100, 20);

        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }

   
 
        

    
    
        
        
        
        
        
        
        
        
        
        
}
