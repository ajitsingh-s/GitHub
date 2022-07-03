package SwingJava;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Sframe implements ActionListener{
	JFrame f;
	JButton b1;
	Button b2;
	JTextField tf;
	Icon i;
	
	Sframe(String str){
	f = new JFrame(str);
	
	b1 = new JButton();
	b1.setBounds(20, 40, 70, 40);
	b2 = new Button();
	b2.setBounds(150, 40, 70, 40);
	tf = new JTextField();
	tf.setBounds(40, 100, 100, 40);
	i = new ImageIcon("pic.gif");
	Container c = f.getContentPane();
	c.add(b1);
	c.add(b2);
	c.add(tf);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	c.setLayout(null);
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1)
			tf.setText("swing button");
		if (e.getSource()==b2)
			tf.setText("awt button");
	}
	
	public static void main(String []args) {
		new Sframe("Sframe swing");
	}
	
}
