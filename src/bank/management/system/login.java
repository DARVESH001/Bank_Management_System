package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel Label1,Label2, Label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    login(){
        super("Bank Management System");

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon  I3= new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(350, 16 , 100, 100);
        add(image);


        ImageIcon II1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image II2 = II1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon  II3= new ImageIcon(II2);
        JLabel iimage = new JLabel(II3);
        iimage.setBounds(630, 350 , 100, 100);
        add(iimage);

        Label1 = new JLabel("WELCOME TO THE BANK");
        Label1.setForeground(Color.white);
        Label1.setFont(new Font("AvantGarde",Font.BOLD,30));
        Label1.setBounds(230,125,450,40);
        add(Label1);

        Label2 = new JLabel("ACCOUNT NO:");
        Label2.setFont(new Font("Ralway",Font.BOLD,28));
        Label2.setForeground(Color.white);
        Label2.setBounds(120,190,375,30);
        add(Label2);

        textField2=new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        Label3 = new JLabel("PIN :");
        Label3.setFont(new Font("Ralway",Font.BOLD,28));
        Label3.setForeground(Color.white);
        Label3.setBounds(150,250,375,30);
        add(Label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 =new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 =new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 =new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,250,30);
        button3.addActionListener(this);
        add(button3);





        ImageIcon III1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image III2 = III1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon III3= new ImageIcon(III2);
        JLabel IIImage= new JLabel(III3);
        IIImage.setBounds(0,0,850,480);
        add(IIImage);

        setLayout(null);
        setSize(850,480);
        setLocation(200, 50);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1) {
                connn c=new connn();
                String cardno =textField2.getText();
                String pin =passwordField3.getText();
                String q ="select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }

                
            } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField3.setText("");
                
            } else if (e.getSource()==button3) {
                new signup();
                setVisible(false);
                
            }

        }catch(Exception E){
            E.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new login();
    }
}
