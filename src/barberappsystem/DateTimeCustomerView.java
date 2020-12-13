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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class DateTimeCustomerView extends JFrame implements ActionListener{
      private JTextField TF1; // user enter barber location/name
    
    DateTimeCustomerController datetimecustomercontroller;
    
    public DateTimeCustomerView (DateTimeCustomerController datetimecustomercontroller){
        this.datetimecustomercontroller = datetimecustomercontroller;
    attributesSetter();   
    components2(); 
    validation();   
    }
    
    
    
        private void attributesSetter(){
        //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Pick a Date and Time");
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
        //creating panel
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
        
        // adding to the top panel
        topPanel.add(left);
        // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        
        // adding ti to the top
        topPanel.add(right);

        JPanel mainArea = new JPanel();
        BorderLayout mainAreaLayout = new BorderLayout();
        mainArea.setLayout(mainAreaLayout);
        
        // adding this to the frame
        this.add(mainArea, BorderLayout.CENTER);
        
        // top panel 2
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
        
        // creating a border jut for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        // setting the layout null to use bounds (easier)
        miniMainLeft.setLayout(null);
      
        //creating jlabel and setting using bounds
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
        b3.addActionListener(datetimecustomercontroller);
        b3.setBounds(140, 130, 100, 20);

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       //creating another panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting layout null to use bounds
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("PICK A DATE & TIME");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("**BARBER PICKED** ");
        lbl1.setBounds(130, 60, 200, 20);
        upper.add(lbl1);
        //creating a table to select date and hour
        String[] colNames = {"Date","Hour","Availability"};
        String[][] data = {
                {"10/12/2020","10:00AM","Available"},
                {"10/12/2020","10:30AM","Available"},
                {"10/12/2020","11:00AM","Available"},
                {"10/12/2020","11:30AM","Busy :("},
                {"10/12/2020","12:00AM","Busy :("}
            
        };
        
        JTable t = new JTable(data, colNames);
        JScrollPane sp = new JScrollPane(t);
        upper.add(sp);
        sp.setBounds(40, 100, 300, 150);

        //creating button and setting action command
        JButton b4 = new JButton("BOOK");
        upper.add(b4);
        b4.setBounds(140, 280, 100, 20);
        b4.setActionCommand("b4");
        b4.addActionListener(this);
        mainArea.add(miniMainArea, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getActionCommand().equals("b4")){
         //creating JoptionPane to show a message when the user click in the book button
      JOptionPane.showMessageDialog(this,
"You successfully created your booking!",
"Confirmation",
JOptionPane.INFORMATION_MESSAGE);
         
     }
    
    }
    
}
