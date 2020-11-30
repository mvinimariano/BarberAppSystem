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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author mvini
 */
public class LoginView extends JFrame {
    private JTextField TF1; // email login
    private JTextField TF2; // password login
    private JTextField TF3; //full name register
    private JTextField TF4; // email register
    private JTextField TF5; // mobile register
    private JTextField TF6; // password register
    private JTextField TF7; // location register
    
    LoginController logincontroller;
    
    
    
    
    public LoginView (LoginController logincontroller){
        this.logincontroller = logincontroller;
    attributesSetter();   
    components(); 
    validation();   
    }
    
    
    
    
    private void components(){
        
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
        
        
        JLabel l1 = new JLabel("Welcome to Barber System");
        left.add(l1);
        l1.setBounds(25, 15, 200, 20);
        
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
                
        JLabel lbllog = new JLabel("LOGIN");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(160, 10, 100, 10);

        
        
        JLabel l4 = new JLabel("Email: ");
        TF1 = new JTextField(15);
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(20, 40, 100, 20);
        TF1.setBounds(85, 40, 200, 20);
        
        JLabel l5 = new JLabel("Password: ");
        TF2 = new JTextField(15);
        miniMainLeft.add(l5);
        miniMainLeft.add(TF2);
        l5.setBounds(20, 70, 100, 20);
        TF2.setBounds(85, 70, 200, 20);
        
        
        JButton b3 = new JButton("Login");
        miniMainLeft.add(b3);
        b3.setBounds(140, 130, 100, 20);
        b3.setActionCommand("b3");
        b3.addActionListener(logincontroller);

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
        
        JLabel lblreg = new JLabel("REGISTER");
        lblreg.setBounds(160, 10, 100, 10);
        upper.add(lblreg);
        

        
        
         String[] options = { "Customer", "Barber/HairDresser"};
        
        //Create the radio buttons.
        JRadioButton optionsMenu = new JRadioButton(options[0]);
        optionsMenu.setSelected(true);
        optionsMenu.setBounds(20, 30, 100, 20);
        optionsMenu.setActionCommand("optionsMenu");
        JRadioButton optionsMenu2 = new JRadioButton(options[1]);
        optionsMenu2.setBounds(160, 30, 150, 20);
  

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(optionsMenu);
        group.add(optionsMenu2);
        upper.add(optionsMenu);
        upper.add(optionsMenu2);
        
        optionsMenu2.setActionCommand("optionsMenu2");
//        optionsMenu2.addActionListener(this);
       
        
        JLabel lbl1 = new JLabel("Full Name: ");
        TF3 = new JTextField(15);
        lbl1.setBounds(20, 60, 100, 20);
        TF3.setBounds(90, 60, 200, 20);
        upper.add(lbl1);
        upper.add(TF3);

        JLabel lbl2 = new JLabel("Email: ");
        TF4 = new JTextField(15);
        lbl2.setBounds(20, 90, 100, 20);
        TF4.setBounds(90, 90, 200, 20);
        upper.add(lbl2);
        upper.add(TF4);
        
        JLabel lbl3 = new JLabel("Mobile Num: ");
        TF5 = new JTextField(10);
        lbl3.setBounds(20,120, 100, 20);
        TF5.setBounds(90,120, 200, 20);
        upper.add(lbl3);
        upper.add(TF5);
        
        JLabel lbl4 = new JLabel("Password: ");
        TF6 = new JTextField(15);
        lbl4.setBounds(20,150, 100, 20);
        TF6.setBounds(90,150, 200, 20);
        upper.add(lbl4);
        upper.add(TF6);
        
        JLabel loc = new JLabel("Location: ");
        TF7 = new JTextField(10);
        loc.setBounds(20,180, 100, 20);
        TF7.setBounds(90,180, 200, 20);
        upper.add(loc);
        upper.add(TF7);

        JButton b4 = new JButton("Register");
        upper.add(b4);
        b4.setBounds(140,220, 100, 20);
        b4.setActionCommand("b4");
        b4.addActionListener(logincontroller);
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }
    
    
        private void attributesSetter(){
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Barber System");
        this.setLocationRelativeTo(null);
    }
    
    
    
        // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
    
        public String getValueEmail(){ // get email login
        return TF1.getText();
    }
    public String getValuePassword(){ // get password login
        return TF2.getText();
    }
    
        public String getFullName(){ // get full name register
        return TF3.getText();
    }
    public String getEmailR(){ // get email register
        return TF4.getText();
    }
        public String getMobileNumber(){  // get mobile number
        return TF5.getText();
    }
    public String getPassR(){ // get password register
        return TF6.getText();
    }
        public String getLocationR(){  // get location register
        return TF7.getText();
    }

  
    
    
    

    
    
    
    
}
