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
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("My Bookings");
        this.setLocationRelativeTo(null);
    }
    
        private void validation(){
        this.validate();
        this.repaint();
    }
        
         private void components3(){
        
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
        b3.setActionCommand("b3");
        b3.addActionListener(mybookingscontroller);
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
        
        JLabel lblreg = new JLabel("VIEW YOUR BOOKINGS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("UPCOMING BOOKINGS:  ");
        lbl1.setBounds(60, 60, 200, 20);
        upper.add(lbl1);
        
        JLabel lbl2 = new JLabel("Barber 03:");
        lbl2.setBounds(60, 90, 200, 20);
        upper.add(lbl2);
        
        JLabel lbl3 = new JLabel("Location: blablabalaba");
        lbl3.setBounds(60, 105, 200, 20);
        upper.add(lbl3);
        
        JLabel lbl4 = new JLabel("Date: 10/05/21");
        lbl4.setBounds(60, 120, 200, 20);
        upper.add(lbl4);
        
        JLabel lbl5 = new JLabel("Time: 04:00PM");
        lbl5.setBounds(60, 135, 200, 20);
        upper.add(lbl5);

        JButton b4 = new JButton("CANCEL");
        upper.add(b4);
        b4.setBounds(140, 170, 100, 20);
        b4.setActionCommand("b4");
        b4.addActionListener(mybookingscontroller);
        
        
        
        JLabel lbl6 = new JLabel("PASTING BOOKINGS:  ");
        lbl6.setBounds(60, 210, 200, 20);
        upper.add(lbl6);
        
        JLabel lbl7 = new JLabel("Review your recent bookings:  ");
        lbl7.setBounds(60, 240, 200, 20);
        upper.add(lbl7);
        
        JLabel lbl8 = new JLabel("Barber 03:");
        lbl8.setBounds(60, 260, 200, 20);
        upper.add(lbl8);
        
        JLabel lbl9 = new JLabel("Location: blablabalaba");
        lbl9.setBounds(60, 275, 200, 20);
        upper.add(lbl9);
        
        JLabel lbl11 = new JLabel("Date: 10/05/21");
        lbl11.setBounds(60, 290, 200, 20);
        upper.add(lbl11);
        
        JLabel lbl12 = new JLabel("Time: 04:00PM");
        lbl12.setBounds(60, 305, 200, 20);
        upper.add(lbl12);

        JButton b5 = new JButton("REVIEW");
        upper.add(b5);
        b5.setActionCommand("b5");
        b5.addActionListener(mybookingscontroller);
        b5.setBounds(140, 340, 100, 20);
        
    
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }

   
 
        

    
    
        
        
        
        
        
        
        
        
        
        
}
