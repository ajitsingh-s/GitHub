package awt;
import java.awt.*;
public class MyFrame extends Frame {
	public MyFrame(String str){
		super(str);
		Label l = new Label ("Enter your Name :");
		l.setBounds(50, 50, 120, 50);
		add(l);
		TextField tf = new TextField("Your name");
		tf.setBounds(180, 50, 100, 60);
		add(tf);
		Button b = new Button("Submit");
		b.setBounds(140,130 ,70, 45);
		add(b);
		setLayout(null);
		setSize(420,420);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("AppFrame");

	}

}
