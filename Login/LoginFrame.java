package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Container c=getContentPane();
    
    JLabel headLabel=new JLabel("LOGIN FORM");
    
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel msgLabel=new JLabel("");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("RESET");

    LoginFrame()
    {
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);
   
       headLabel.setBounds(120,40,150,30);
       headLabel.setFont(new Font("Arial",Font.BOLD,16));
       userLabel.setBounds(50,120,100,30);
       passwordLabel.setBounds(50,180,100,30);
       userTextField.setBounds(150,120,150,30);
       passwordField.setBounds(150,180,150,30);
       loginButton.setBounds(50,270,100,30);
       resetButton.setBounds(200,270,100,30);
       msgLabel.setBounds(80,320,250,30);
       msgLabel.setFont(new Font("Arial",Font.ITALIC,14));
       msgLabel.setForeground(Color.RED);

       c.add(headLabel);
       c.add(userLabel);
       c.add(passwordLabel);
       c.add(userTextField);
       c.add(passwordField);
       c.add(loginButton);
       c.add(resetButton);
       c.add(msgLabel);
       
       c.setLayout(null);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==loginButton) {
    	System.out.println("Login pressed");
    	String username = userTextField.getText();
    	String password = passwordField.getText();
    	LoginBean lb = new LoginBean();
    	lb.setUser(username);
    	lb.setPassword(password);
    	
    	boolean flag = lb.loginverify();
    	if(flag) {
    		System.out.println("Login Successfully!");
    		msgLabel.setText("        Login Successfully!");
    	} else {
     		System.out.println("Invalid Username or Password!");
     		msgLabel.setText("Invalid Username or Password!");
    	}
    	} else if (e.getSource()==resetButton) {
    		userTextField.setText("");
    		passwordField.setText("");
    		msgLabel.setText("");
    	}
    }

    public static void main(String[] a){
        LoginFrame jf=new LoginFrame();
        jf.setTitle("Login Form");
        jf.setVisible(true);
        jf.setBounds(10,10,370,450);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

    }

}