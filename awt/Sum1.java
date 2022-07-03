package awt;
import java.awt.*;
import java.awt.event.*;

public class Sum1 extends Frame implements ActionListener {
	
	//Frame f;
	Button b1;
	TextField tf1;
	TextField tf2;
	TextField tf3;
	Label l1;
	
	public Sum1 (String str) {
		super(str);
		b1 = new Button("sum");
		b1.setBounds(60,170,40,40);
		add(b1);
		l1 = new Label("Give two numbers");
		l1.setBounds(getBounds());
		add(l1);
		
		tf1  =  new TextField();
		tf2  =  new TextField();
		tf3  =  new TextField();
		tf1.setBounds(40,40,50,50);
		tf2.setBounds(100,40,50,50);
		tf3.setBounds(60,110,50,50);
		add(tf1);
		add(tf2);
		add(tf3);
		b1.addActionListener(this);
		setLayout(null);
		setSize(350,400);
		setVisible(true);
		addWindowListener(new WindowClose());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(tf1.getText());
		int y = Integer.parseInt(tf2.getText());
		int z = 0;
		if(e.getSource()==b1) 
			z = x+y;
		tf3.setText(String.valueOf(z).toString());
	}
	
	
	public static void main(String[] args) {
		new Sum1("Sum calculator");
	}



	
			
}

class WindowClose extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
	System.exit(0);
}
}



