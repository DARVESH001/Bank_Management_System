package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField TextName,TextFName,Textemail,Textadd,Textcity,Textpin,Textstat;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()% 9000L)+1000L;
    String first=" "+Math.abs(first4);

    signup(){
        super("APPLICATION FORM");
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon  I3= new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(25, 10 , 100, 100);
        add(image);

        JLabel label1 =new JLabel("APPLICATION FORM NO. "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3= new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName =new JLabel(("Name: "));
        labelName.setFont(new Font("Ralway",Font.BOLD,18));
        labelName.setBounds(100,150,90,20);
        add(labelName);

        TextName =new JTextField();
        TextName.setFont(new Font("Raleway",Font.BOLD,14));
        TextName.setBounds(300,150,400,30);
        add(TextName);

        JLabel labelFName =new JLabel(("Father's Name:"));
        labelFName.setFont(new Font("Ralway",Font.BOLD,18));
        labelFName.setBounds(100,190,200,20);
        add(labelFName);

        TextFName =new JTextField();
        TextFName.setFont(new Font("Raleway",Font.BOLD,14));
        TextFName.setBounds(300,190,400,30);
        add(TextFName);

        JLabel DOB =new JLabel(("Date Of Birth:"));
        DOB.setFont(new Font("Ralway",Font.BOLD,18));
        DOB.setBounds(100,230,200,20);
        add(DOB);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,30);
        add(dateChooser);

        JLabel labelG= new JLabel("Gender: ");
        labelG.setFont(new Font("Ralway",Font.BOLD,18));
        labelG.setBounds(100,270,90,20);
        add(labelG);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,270,60,30);
        add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,270,100,30);
        add(r2);
        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        
        JLabel labelemail= new JLabel("Email Address: ");
        labelemail.setFont(new Font("Ralway",Font.BOLD,20));
        labelemail.setBounds(100,310,150,20);
        add(labelemail);

        Textemail =new JTextField();
        Textemail.setFont(new Font("Ralway",Font.BOLD,14));
        Textemail.setBounds(300,310,400,30);
        add(Textemail);

        JLabel labelms= new JLabel("Marital Status :");
        labelms.setFont(new Font("Ralway",Font.BOLD,20));
        labelms.setBounds(100,350,150,20);
        add(labelms);

        m1= new JRadioButton("Married");
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,350,100,30);
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        add(m1);

        m2= new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(420,350,100,30);
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        add(m2);

        m3= new JRadioButton("OTHERS");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(540,350,100,30);
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttongroup1=new ButtonGroup();
        buttongroup1.add(m1);
        buttongroup1.add(m2);
        buttongroup1.add(m3);

        JLabel labeladd= new JLabel("Address: ");
        labeladd.setFont(new Font("Ralway",Font.BOLD,20));
        labeladd.setBounds(100,400,200,30);
        add(labeladd);

        Textadd =new JTextField();
        Textadd.setFont(new Font("Ralway",Font.BOLD,14));
        Textadd.setBounds(300,400,400,30);
        add(Textadd);

        JLabel labelcity= new JLabel("City: ");
        labelcity.setFont(new Font("Ralway",Font.BOLD,20));
        labelcity.setBounds(100,440,200,30);
        add(labelcity);

        Textcity =new JTextField();
        Textcity.setFont(new Font("Ralway",Font.BOLD,14));
        Textcity.setBounds(300,440,400,30);
        add(Textcity);

        JLabel labelpin= new JLabel("Pincode: ");
        labelpin.setFont(new Font("Ralway",Font.BOLD,20));
        labelpin.setBounds(100,480,200,30);
        add(labelpin);

        Textpin =new JTextField();
        Textpin.setFont(new Font("Ralway",Font.BOLD,14));
        Textpin.setBounds(300,480,400,30);
        add(Textpin);

        JLabel labelstat= new JLabel("State: ");
        labelstat.setFont(new Font("Ralway",Font.BOLD,20));
        labelstat.setBounds(100,520,200,30);
        add(labelstat);

        Textstat =new JTextField();
        Textstat.setFont(new Font("Ralway",Font.BOLD,14));
        Textstat.setBounds(300,520,400,30);
        add(Textstat);

        next= new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,570,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(200,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno =first;
        String name = TextName.getText();
        String fname= TextFName.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= null;
        if(r1.isSelected()){
            gender ="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email = Textemail.getText();
        String martial=null;
        if(m1.isSelected()){
            martial="Married";
        } else if (m2.isSelected()) {
            martial="Unmarried";

        } else if (m3.isSelected()) {
            martial="Other";
        }
        String address= Textadd.getText();
        String city = Textcity.getText();
        String pincode=Textpin.getText();
        String state=Textstat.getText();

        try{
            if(TextName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }else {
                con con1=new con();
                String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}
