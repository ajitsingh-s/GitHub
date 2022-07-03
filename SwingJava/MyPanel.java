package SwingJava;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyPanel implements ActionListener {
	JFrame jf;
	JTextField tf;
	JButton b;
	JPanel jp;
	MyPanel(String str) {
		jf  = new JFrame();
		tf  = new JTextField();
		tf.setBounds(20, 20, 110, 50);
		b = new JButton("Jbutton");
		jp = new JPanel();
		b.setBounds(20,120,110,40);
		b.addActionListener(this);
		jf.add(tf);
		jp.add(b);
		jf.add(jp);
		jp.setLayout(null);
		//jp.setLayout(new FlowLayout());
		jf.setSize(350,450);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new MyPanel("My Panel");
	}
	
	
	

}
