package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo implements ActionListener{
	Label l1;
	Button b1,b2;
	TextField tf;
	Frame f;
	EventDemo(String str) {
		f = new Frame(str);
		l1= new Label ("Click any one");
		l1.setBounds(50, 50, 100, 20);
		tf = new TextField();
		tf.setBounds(160, 50, 180, 30);
		b1 = new Button("Yes");
		b1.setBounds(50, 90, 50, 20);
		b2 = new Button("No");
		b2.setBounds(120, 90, 50, 20);
		
		f.add(l1);
		f.add(tf);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == b1)
			tf.setText("YOU CLICKED - YES");
		if (e.getSource() == b2)
			tf.setText("YOU CLICKED - NO");
	}
	public static void main(String[] args) {
		new EventDemo("EventDemo");

	}

}
