/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author IMPERIAL JURIE
 */
public class ClientAdmin extends JFrame implements ActionListener  {
    private JLabel label = new JLabel();
    private JLabel lblYouAreA = new JLabel();
    private JButton btnClient,btnAdmin;
    private JLabel lbltitle, rent;
    
   ClientAdmin(){
        setTitle("Avaible Page");
       setSize(800,600);
       getContentPane().setBackground(Color.black);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       
       //img
        rent = new JLabel();
        rent.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gboyc\\Documents\\NetBeansProjects\\Car Rental System\\src\\rent.jpg").getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        rent.setBounds(0, 0, 800, 600);
 
        
        lbltitle = new JLabel("WELCOME TO OUR CAR RENTAL SYSTEM ");
        lbltitle.setBounds(190, 60, 490,20);
        lbltitle.setFont(new Font("Arial", Font.BOLD,22));
        lbltitle.setForeground(Color.white);


        lblYouAreA = new JLabel("Are You A?");
        lblYouAreA.setBounds(360, 105, 150,20);
        lblYouAreA.setFont(new Font("Arial", Font.BOLD,20));
        lblYouAreA.setForeground(Color.white);


        btnClient = new JButton("CLIENT");
        btnClient.setBounds(320,150,180,40);
        btnClient.setFont(new Font("Arial", Font.BOLD,20));
        btnClient.setForeground(Color.black);
        btnClient.setBackground(Color.orange);


        btnAdmin = new JButton("ADMIN");
        btnAdmin.setBounds(320, 210, 180, 40);
        btnAdmin.setFont(new Font("Arial", Font.BOLD,20));
        btnAdmin.setForeground(Color.black);
        btnAdmin.setBackground(Color.orange);
        
     

        add(label);
        add(lbltitle);
        add(lblYouAreA);
        add(btnClient);
        add(btnAdmin);
        add(rent);
      

        btnClient.addActionListener(this);
        btnAdmin.addActionListener(this);
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnClient){
            Login lg=new Login();
                lg.setVisible(true);
        }
        else if(e.getSource()==btnAdmin){
            dispose();
            Login lg=new Login();
            lg.setVisible(true);
        }
    }
    
}