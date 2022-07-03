package SwingJava;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FLayout implements ActionListener {
	JFrame f;
	JButton b[];
	String s[] = {"North", "South", "East", "West", "Center"};
	FLayout(String str){
		f = new JFrame(str);
		b = new JButton[5];
		for(int i=0;i<s.length;i++) {
			b[i] = new JButton(s[i]);
			f.add(b[i]);
		}
		f.setLayout(new FlowLayout());
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setLayout(new FlowLayout(FlowLayout.TRAILING));
		f.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350, 400);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new FLayout("FLayout program");
	}
}
