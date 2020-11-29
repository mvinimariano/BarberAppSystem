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

/**
 *
 * @author mvini
 */
public class UpcomingServiceView extends JFrame implements ActionListener{
    UpcomingServiceController upcomingservicecontroller;
    
     public UpcomingServiceView (UpcomingServiceController upcomingservicecontroller){
    attributesSetter();   
    components1(); 
    validation();
    }
    
       private void attributesSetter(){
        this.setVisible(true);
        this.setSize(800,600);
        this.setTitle("Home Page");
        this.setLocationRelativeTo(null);
    }
    
       private void validation(){
        this.validate();
        this.repaint();
    }
    
                  private void components1(){
        
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
                
        JLabel lbllog = new JLabel("UPCOMING APPOINTMENTS");
        miniMainLeft.add(lbllog);
        lbllog.setBounds(110, 10, 200, 10);

        JLabel l4 = new JLabel("<html>Amilcar Aponte<br>Phone: 0838122<br>Date:07/11/2020<br>Time: 10:00AM</html>");
        miniMainLeft.add(l4);
        l4.setBounds(40, 40, 300, 150);
 
        JButton b3 = new JButton("CONFIRM");
        miniMainLeft.add(b3);
        b3.setBounds(160, 80, 100, 20);
        b3.setActionCommand("b3");
        b3.addActionListener(this);
        
        JButton b7 = new JButton("CANCEL");
        miniMainLeft.add(b7);
        b7.setBounds(160, 110, 100, 20);
        
        JLabel lbllog2 = new JLabel("SET AVAILABILITY");
        miniMainLeft.add(lbllog2);
        lbllog2.setBounds(130, 210, 200, 10);

        JLabel l5 = new JLabel("Set your availability for next week");
        miniMainLeft.add(l5);
        l5.setBounds(90, 240, 300, 50);
 
        JButton b5 = new JButton("SET");
        miniMainLeft.add(b5);
        b5.setBounds(140, 290, 100, 20);

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
        
        JLabel lblreg = new JLabel("APPOINTMENT STATUS");
        lblreg.setBounds(130, 10, 200, 10);
        upper.add(lblreg);
        
        
        JLabel lbl1 = new JLabel("Check your appointment status for today");
        lbl1.setBounds(80, 80, 250, 20);
        upper.add(lbl1);

        JButton b4 = new JButton("CHECK");
        upper.add(b4);
        b4.setBounds(140, 130, 100, 20);
        


        
        mainArea.add(miniMainArea, BorderLayout.CENTER);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
               if(e.getActionCommand().equals("b3")){
      JOptionPane.showMessageDialog(this,
"You have confirmed the appointment!",
"Confirmation",
JOptionPane.INFORMATION_MESSAGE);
         
     }
        
        
    }
    
}