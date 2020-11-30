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
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Book an Appointment");
        this.setLocationRelativeTo(null);
    }
    
       private void validation(){
        this.validate();
        this.repaint();
    }
       
              private void viewBookings(){

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
        
    
        
        JButton b3 = new JButton("SEARCH");
        miniMainLeft.add(b3);
        b3.setActionCommand("b3");
        b3.addActionListener(homecustumerController2);
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
        
        JLabel lblreg = new JLabel("HAIRDRESSERS AND BARBERS: ");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        JLabel l5 = new JLabel("Barber 01");
        JLabel l6 = new JLabel("Location : blabalbalbal");
        upper.add(l5);
        upper.add(l6);
        l5.setBounds(40, 45, 250, 20);
        l6.setBounds(40, 60, 250, 20);
        
        JLabel l7 = new JLabel("Barber 02");
        JLabel l8 = new JLabel("Location : blabalbalbal");
        upper.add(l7);
        upper.add(l8);
        l7.setBounds(40, 85, 250, 20);
        l8.setBounds(40, 100, 250, 20);
        
        JLabel l9 = new JLabel("Barber 03");
        JLabel l10 = new JLabel("Location : blabalbalbal");
        upper.add(l9);
        upper.add(l10);
        l9.setBounds(40, 125, 250, 20);
        l10.setBounds(40, 140, 250, 20);
        
        JLabel l11 = new JLabel("Barber 04");
        JLabel l12 = new JLabel("Location : blabalbalbal");
        upper.add(l11);
        upper.add(l12);
        l11.setBounds(40, 165, 250, 20);
        l12.setBounds(40, 180, 250, 20);
        

        JButton b4 = new JButton("BOOK");
        upper.add(b4);
        b4.setActionCommand("b4");
        b4.addActionListener(homecustumerController2);        
        b4.setBounds(140, 230, 100, 20);
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
           
           
           
           
           
    }
    
}
