package awt;
import java.awt.*;
public class MyFrame1 {
	public MyFrame1 (String str) {
		Frame f = new Frame(str);
		Label l = new Label ("Enter the value");
		l.setBounds(50, 50, 100, 50);
		f.add(l);
		Button b = new Button ("ok");
		b.setBounds(150, 50, 80, 40);
		f.add(b);
		TextField tf  = new TextField();
		tf.setBounds(50, 120, 100, 40);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame1("My app");
	}

}
