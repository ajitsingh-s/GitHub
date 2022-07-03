package SwingJava;

import java.awt.BorderLayout;

import javax.swing.*;

public class BLayout1 {
	JFrame f;
	JButton b[];
	
	BLayout1(String str){
		f = new JFrame(str);
		b = new JButton[5];
		String s[] = { "North", "South","East", "West","Center" };
		String x[] = { BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER };
		
		for(int i=0; i<s.length;i++) {
			b[i] = new JButton (s[i]);
			f.add(b[i],x[i]);
		}
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 300);
		f.setVisible(true);
		f.pack();
		
	}
	public static void main(String[] args) {
		new BLayout1("Border Layout");
	}
	
}
