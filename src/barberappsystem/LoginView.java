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
public class LoginView extends JFrame{
    private JTextField TF1; // email login
    private JTextField TF2; // password login
    private JTextField TF3; //full name register
    private JTextField TF4; // email register
    private JTextField TF5; // mobile register
    private JTextField TF6; // password register
    private JTextField TF7; // location register
    public JRadioButton optionsMenu;
    public JRadioButton optionsMenu2;
    
    LoginController logincontroller;
    CreatingAccount creatingAcc;
    
    
    
    
    
    public LoginView (LoginController logincontroller){
        this.logincontroller = logincontroller;
        this.creatingAcc = creatingAcc;
    attributesSetter();   
    components(); 
    validation();   
    }
    
    
    
    
    private void components(){
        
                BorderLayout frameLayout = new BorderLayout();
        this.setLayout(frameLayout);

                // top panel
        JPanel topPanel = new JPanel();
        // spliting it in 1 row and 2 columns
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        
        // adding this to the frame
        this.add(topPanel, BorderLayout.PAGE_START);
        
        // left side
        JPanel left = new JPanel();
        FlowLayout leftLayout = new FlowLayout();
        //setting layout null to use the bounds
        left.setLayout(null);
        
        
        JLabel l1 = new JLabel("Welcome to Barber System");
        left.add(l1);
        l1.setBounds(25, 15, 200, 20);
        
        // adding it to the panel
        topPanel.add(left);
        // right side
        JPanel right = new JPanel();
        FlowLayout rightLayout = new FlowLayout();
        right.setLayout(rightLayout);
        rightLayout.setAlignment(FlowLayout.RIGHT);
        
        JButton b2 = new JButton("LOGOUT");
        right.add(b2);

        // adding it to the top section
        topPanel.add(right);
         
         
         // main area panel
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
        
        // mini area panel
        JPanel miniMainArea = new JPanel();
        
        // creating 1 row and 1 column
        GridLayout miniMainLayout = new GridLayout(1,1);
        miniMainArea.setLayout(miniMainLayout);
        
        // left side
        JPanel miniMainLeft = new JPanel();
        
        // creating border line just for design
        miniMainLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        miniMainArea.add(miniMainLeft);
        //setting layout null to use bounds
        miniMainLeft.setLayout(null);

        JLabel lbllog = new JLabel("LOGIN");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(160, 10, 100, 10);

        JLabel l4 = new JLabel("Email: ");
        TF1 = new JTextField(15);
        this.TF1 = TF1;
        miniMainLeft.add(l4);
        miniMainLeft.add(TF1);
        l4.setBounds(20, 40, 100, 20);
        TF1.setBounds(85, 40, 200, 20);
        
        JLabel l5 = new JLabel("Password: ");
        TF2 = new JTextField(15);
        this.TF2 = TF2;
        miniMainLeft.add(l5);
        miniMainLeft.add(TF2);
        l5.setBounds(20, 70, 100, 20);
        TF2.setBounds(85, 70, 200, 20);
        
        
        JButton b3 = new JButton("Login");
        miniMainLeft.add(b3);
        b3.setBounds(140, 130, 100, 20);
        b3.setActionCommand("b3");
        b3.addActionListener(logincontroller);

        // right side
        JPanel miniMainRight = new JPanel();
        miniMainArea.add(miniMainRight);
        
        // creating 1 row and 1 column
        GridLayout miniMainRightLayout = new GridLayout(1,1);
        miniMainRight.setLayout(miniMainRightLayout);
        
       // upper panel
        JPanel upper = new JPanel();
        miniMainRight.add(upper);
        upper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //setting layout null to use bounds
        upper.setLayout(null);
        
        JLabel lblreg = new JLabel("REGISTER");
        lblreg.setBounds(160, 10, 100, 10);
        upper.add(lblreg);
        

        
        //creating radio button
         String[] options = { "Customer", "Barber/HairDresser"};
        
        //Create the radio buttons.
        optionsMenu = new JRadioButton(options[0]);
        optionsMenu.setSelected(true);
        optionsMenu.setBounds(20, 30, 100, 20);
        optionsMenu2 = new JRadioButton(options[1]);
        optionsMenu2.setBounds(160, 30, 150, 20);
  

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(optionsMenu);
        group.add(optionsMenu2);
        upper.add(optionsMenu);
        upper.add(optionsMenu2);
        optionsMenu.addActionListener(logincontroller);
        optionsMenu.setActionCommand("customer");
        optionsMenu2.addActionListener(logincontroller);
        optionsMenu2.setActionCommand("barber");
       
       
        //creating labels and text fields
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
        //setting the frame to make it visible, size, title, position and to stop the program when you close the window
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Barber System");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    

    private void validation(){
        // validating and repainting setter
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
    public String getEmail(){ // get email register
        return TF4.getText();
    }
        public String getPhoneNumb(){  // get mobile number
        return TF5.getText();
    }
    public String getPass(){ // get password register
        return TF6.getText();
    }
        public String getLocationR(){  // get location register
        return TF7.getText();
    }


    public boolean UserButton(){
        if (optionsMenu.isSelected()){
            return true;
        }
         else{
           return false;
       }

    }

     public boolean ServiceButton(){
        if (optionsMenu2.isSelected()){
            return true;
        }
         else{
           return false;
       }
     }







}
