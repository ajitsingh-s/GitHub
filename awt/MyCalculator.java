package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator implements ActionListener {
	Label L1,L2,L3;
	TextField tf1, tf2, tf3;
	Button b1,b2,b3,b4;
	Frame f;
	
	MyCalculator (String str) {
		f = new Frame(str);
		L1 = new Label("First Number :");
		L2 = new Label("Second Number :");
		L3 = new Label("Result :");
		tf1 = new TextField(10);
		tf2 = new TextField();
		tf3 = new TextField();
		b1 = new Button("Add");
		b2 = new Button("Sub");
		b3 = new Button("Mul");
		b4 = new Button("Div");
		L1.setBounds(20, 50, 100, 30);
		tf1.setBounds(130, 50, 50, 30);
		L2.setBounds(20, 90, 100, 30);
		tf2.setBounds(130, 90, 50, 30);	
		L3.setBounds(20, 130, 100, 30);
		tf3.setBounds(130, 130, 50, 30);
		b1.setBounds(20, 170, 40, 30);
		b2.setBounds(80, 170, 40, 30);
		b3.setBounds(140, 170, 40, 30);
		b4.setBounds(200, 170, 40, 30);
		
		f.add(L1);
		f.add(L2);
		f.add(L3);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.setLayout(null);
		f.setSize(260, 350);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int z = 0;
		String s1  = tf1.getText();
		String s2 = tf2.getText();
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		if (e.getSource() == b1)  //add
			z = x + y ;
		if (e.getSource() == b2)  //Sub
			z = x - y ;
		if (e.getSource() == b3)  //Mul
			z = x * y ;
		if (e.getSource() == b4)  //Div
			z = x / y ;			
		tf3.setText(String.valueOf(z).toString());
	}
	
	public static void main(String[] args) {
		new MyCalculator("My Calculator");

	}





}
