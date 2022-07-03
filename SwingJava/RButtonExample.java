package SwingJava;

import java.awt.*;

import javax.swing.*;

public class RButtonExample extends JFrame {
	RButtonExample(){
		JRadioButton jb[] = new JRadioButton[5];
		ButtonGroup bg = new ButtonGroup();
		for(int i=0; i<jb.length;i++) {
			jb[i] = new JRadioButton(i+1+"");
			bg.add(jb[i]);
			add(jb[i]);
		}
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new RButtonExample();

	}

}
