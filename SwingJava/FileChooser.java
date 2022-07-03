package SwingJava;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class FileChooser extends JFrame implements ActionListener {
	JFileChooser jfc;
	FileChooser(){
		super("File Chooser");
		jfc = new JFileChooser();
		JButton jb = new JButton("Browser");
		jb.addActionListener(this);
		getContentPane().add(jb);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int x =  jfc.showOpenDialog(null);
		System.out.println(x);
		if (x == JFileChooser.APPROVE_OPTION) {
			File f = jfc.getSelectedFile();
			String s = jfc.getName(f);
			System.out.println(s);
		}
		if (x == JFileChooser.CANCEL_OPTION) {
			System.out.println("cancel");
		}
		
	}
	
	public static void main(String[] args) {
		new FileChooser();

	}

}
