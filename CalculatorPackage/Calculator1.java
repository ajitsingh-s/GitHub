package CalculatorPackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Calculator1 extends Frame implements ActionListener{
	
	
	TextField tf;
	//Panel p;
	int n;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
	float no1 = 0, no2 = 0, result = 0;
	
    int cases;
    public Calculator1() {
		
		tf = new TextField();
		//tf.setFont(new Font("null", Font.BOLD,20));
		
		b1  = new Button("7");
		b2 =  new Button("8");
		b3  = new Button("9");
		b4 =  new Button("%");
		b5  = new Button("AC");
		b6 =  new Button("4");
		b7  = new Button("5");
		b8 =  new Button("6");
		b9  = new Button("/");
		b10 =  new Button("x");
		b11  = new Button("1");
		b12 =  new Button("2");
		b13  = new Button("3");
		b14 =  new Button("+");
		b15  = new Button("-");
		b16 =  new Button("+/-");
		b17 = new Button("0");
		b18 =  new Button(".");
		b19 =  new Button("=");
		
		
		tf.setBounds(20, 40, 240, 50);
		
		b1.setBounds(20, 100, 40, 50);
		b2.setBounds(70, 100, 40, 50);
		b3.setBounds(120, 100, 40, 50);
		b4.setBounds(170, 100, 40, 50);
		b5.setBounds(220, 100, 40, 50);
		
		b6.setBounds(20, 160, 40, 50);
		b7.setBounds(70, 160, 40, 50);
		b8.setBounds(120, 160, 40, 50);
		b9.setBounds(170, 160, 40, 50);
		b10.setBounds(220, 160, 40, 50);
		
		b11.setBounds(20, 220, 40, 50);
		b12.setBounds(70, 220, 40, 50);
		b13.setBounds(120, 220, 40, 50);
		b14.setBounds(170, 220, 40, 110);
		b15.setBounds(220, 220, 40, 50);
		
		b16.setBounds(20, 280, 40, 50);
		b17.setBounds(70, 280, 40, 50);
		b18.setBounds(120, 280, 40, 50);
		b19.setBounds(220, 280, 40, 50);
		
		add(tf);
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
		add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);
		add(b15);add(b16);add(b17);add(b18);add(b19);		
		
		
		
		b1.addActionListener(this);b2.addActionListener(this);
		b3.addActionListener(this);b4.addActionListener(this);
		b5.addActionListener(this);b6.addActionListener(this);
		b7.addActionListener(this);b8.addActionListener(this);
		b9.addActionListener(this);b10.addActionListener(this);
		b11.addActionListener(this);b12.addActionListener(this);
		b13.addActionListener(this);b14.addActionListener(this);
		b15.addActionListener(this);b16.addActionListener(this);
		b17.addActionListener(this);b18.addActionListener(this);
		b19.addActionListener(this);
		setLayout(null);
		setSize(280,350);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s  = e.getActionCommand();
		if (s == "+")  {//add =1
			cases = 1;
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }
		else if (s == "-") { //Sub = 2
			cases = 2;
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }
		else if (s == "x") { //Mul=3
			cases = 3;
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }
		else if (s == "/") { //Div=4
			cases = 4;
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }		
		else if (s == "%") { //percent=5
			cases = 5;	
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }		
		else if (s == "+/-") { //AC=6
			cases = 6;
			no1 = Float.parseFloat(tf.getText());
			tf.setText("");
    }
		else if (s == "=") {  
		no2 = Float.parseFloat(tf.getText());
		
		switch (cases) {
        case 1:
            result = no1 + no2;//+
            break;
        case 2:
        	result = no1 - no2;//-
            break;
        case 3:
        	result = no1 * no2;//
            break;
        case 4:
        	result = no1 / no2;
            break;
        case 5:
            result = (no1 * no2) / 100;
            break;
        case 6:
            result = no1 - (no1 * 2);
            break;
       
		}
		tf.setText(result + "");
		} else if (s== "AC") {
            tf.setText("");
            no1= no2 = result = 0;
        } else {
            tf.setText(tf.getText() + s);
        }
    }
	
	public static void main(String[] args) {
		new Calculator1();

	}

	

}
