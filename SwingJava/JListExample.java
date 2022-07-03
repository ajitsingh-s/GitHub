package SwingJava;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class JListExample extends JFrame {
	JList list;
	JTextField tf;
	Container content;
	public JListExample() {
		super("JList simple example");
		Font font = new Font("ARIAL",Font.PLAIN, 18);
		
		content = getContentPane();
		String name[] = { "Agra", "Delhi", "Noida", "Mumbai", "UttarPradesh", "Goa"};
		
		list = new JList(name);
		list.setVisibleRowCount(4);
		list.setFont(font);
		content.add(list);
		list.addListSelectionListener(new Selector());
		
		
		JScrollPane scroll = new JScrollPane(list);
		JPanel spanel  = new JPanel();
		spanel.add(scroll);
		
		content.add(spanel);
		
		tf = new JTextField("None",10);
		tf.setFont(font);
		JLabel label = new JLabel("Select any city");
		label.setFont(font);
		JPanel lpanel = new JPanel();
		lpanel.add(label);
		lpanel.add(tf);
	
		content.add(lpanel);
		content.setLayout(new FlowLayout());
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JListExample();

	}
	class Selector implements ListSelectionListener {
		
		public void valueChanged(ListSelectionEvent e) {
			tf.setText(list.getSelectedValue().toString());
			
		}
	}
}

 