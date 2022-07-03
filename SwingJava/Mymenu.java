package SwingJava;

import java.awt.event.*;

import javax.swing.*;

public class Mymenu extends MouseAdapter {
	JFrame jf;
	JPopupMenu p;
	
	public Mymenu() {
	jf = new JFrame();
	p = new JPopupMenu("pop");
	JMenuItem i1 = new JMenuItem("New");
	JMenuItem i2 = new JMenuItem("Open");
	JMenuItem i3 = new JMenuItem("Save");
	JMenuItem i4 = new JMenuItem("Exit");
	p.add(i1);
	p.add(i2);
	p.add(i3);
	p.add(i4);
	jf.addMouseListener(this);
	jf.setSize(350,400);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getButton());
		System.out.println("1st  " + MouseEvent.BUTTON1);
		System.out.println("2nd  " + MouseEvent.BUTTON2);
		System.out.println("3rd  " + MouseEvent.BUTTON3);
		if(e.getButton() == MouseEvent.BUTTON3)
			p.show(e.getComponent(),e.getX(),e.getY());
	}
	
	
	public static void main(String[] args) {
		new Mymenu();
	}
}
