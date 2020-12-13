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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class HomeCustumerView extends JFrame {
        private JTextField TF1; // user enter barber location/name
    
  HomeCustumerController homecustumerController;  
    
  
    public HomeCustumerView (HomeCustumerController homecustumerController){
        this.homecustumerController = homecustumerController;
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
        //top section
         JPanel topPanel = new JPanel();
        // spliting in 1 row and 2 columns
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
        
        // adding to the top section
        topPanel.add(left);
        // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        // adding to the top section
        topPanel.add(right);
         
         
                // main panel
        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding to the frame
        this.add(mainArea, BorderLayout.CENTER);

        JPanel miniTopPanel = new JPanel();
        FlowLayout miniTopLayout = new FlowLayout();
        miniTopPanel.setLayout(miniTopLayout);
        miniTopLayout.setAlignment(FlowLayout.LEFT);
        
       
        mainArea.add(miniTopPanel, BorderLayout.PAGE_START);
        JPanel miniMainArea = new JPanel();
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating border just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting layout null to use bounds
        miniMainLeft.setLayout(null);

         //creating a label
        JLabel lbllog = new JLabel("BOOK AN APPOINTMENT");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(130, 10, 200, 10);

        JLabel l4 = new JLabel("Find your Hairdresser/Barber by name or location: ");
        TF1 = new JTextField(15);
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(40, 40, 300, 20);
        TF1.setBounds(90, 80, 200, 20);
        //creating a button with action command
        JButton b10 = new JButton("Search");
        miniMainLeft.add(b10);
        b10.setActionCommand("b10");
        b10.addActionListener(homecustumerController);    
        b10.setBounds(140, 130, 100, 20);
        

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // creating 1 row ans 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       //upper panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting layout null to use bounds
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("VIEW YOUR BOOKINGS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("Order History ");
        lbl1.setBounds(150, 80, 100, 20);
        upper.add(lbl1);
        //creating button with action command
        JButton b4 = new JButton("Check");
        upper.add(b4);
        b4.setActionCommand("b4");
        b4.addActionListener(homecustumerController);
        b4.setBounds(140, 130, 100, 20);

        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }
  

       
       
}
