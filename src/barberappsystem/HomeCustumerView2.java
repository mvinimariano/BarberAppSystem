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
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class HomeCustumerView2 extends JFrame {
    private JTextField TF1; // user enter barber location/name
    
  HomeCustumerController2 homecustumerController2;  
    
  


    public HomeCustumerView2(HomeCustumerController2 homecustumerController2) {
  this.homecustumerController2 = homecustumerController2;
           attributesSetter();   
    viewBookings();
    validation(); 
        
        
        
    }

       private void attributesSetter(){
           //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Book an Appointment");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
       private void validation(){
           // validating and repainting setter
        this.validate();
        this.repaint();
    }
       
              private void viewBookings(){

               BorderLayout frameLayout = new BorderLayout();
               this.setLayout(frameLayout);

                // top panel
        JPanel topPanel = new JPanel();
        // spliting it in 1 row and 2 column
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
         //right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        // adding it to the top section
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
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating border just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting the layout null to use the bounds
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
        
        //creating button with action command
        JButton b3 = new JButton("SEARCH");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(homecustumerController2);
        b3.setBounds(140, 130, 100, 20);

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        //creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       // upper panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // setting layout null to use the bounds
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("HAIRDRESSERS AND BARBERS: ");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        // barber's labels, should be database barbers
        JLabel l5 = new JLabel("Barber: Duke Barber");
        JLabel l6 = new JLabel("Location :01 Duke st");
        upper.add(l5);
        upper.add(l6);
        l5.setBounds(40, 45, 250, 20);
        l6.setBounds(40, 60, 250, 20);
        
        JLabel l7 = new JLabel("Barber: Old Town Barber");
        JLabel l8 = new JLabel("Location : 5 Old Dublin Rd");
        upper.add(l7);
        upper.add(l8);
        l7.setBounds(40, 85, 250, 20);
        l8.setBounds(40, 100, 250, 20);
        
        JLabel l9 = new JLabel("Barber: The Church Barber");
        JLabel l10 = new JLabel("Location : 9 Church St");
        upper.add(l9);
        upper.add(l10);
        l9.setBounds(40, 125, 250, 20);
        l10.setBounds(40, 140, 250, 20);
        
        JLabel l11 = new JLabel("Barber: Bruce Barbers");
        JLabel l12 = new JLabel("Location : 4 Spruce Ave");
        upper.add(l11);
        upper.add(l12);
        l11.setBounds(40, 165, 250, 20);
        l12.setBounds(40, 180, 250, 20);
        
        // creating button with action command
        JButton b4 = new JButton("BOOK");
        upper.add(b4);
        b4.setActionCommand("b4");
        b4.addActionListener(homecustumerController2);        
        b4.setBounds(140, 230, 100, 20);

        mainArea.add(miniMainArea, BorderLayout.CENTER);

           
    }
    
}
