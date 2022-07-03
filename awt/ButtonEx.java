package awt;
import java.awt.*;    
import java.awt.event.*;
public class ButtonEx implements ActionListener{
	TextField tf;
	Button b;
	Frame f;
	ButtonEx() {
	// create instance of frame with the label   
    f = new Frame("Button Example");    
    tf=new TextField();    
    tf.setBounds(50,50, 150,20);  
    // create instance of button with label  
     b=new Button("Click Here");    
    // set the position for the button in frame   
    b.setBounds(50,100,60,30);  
    f.add(b);
    b.addActionListener(this);  
// adding button the frame  
      
// adding textfield the frame  
    f.add(tf);    
// setting size, layout and visibility   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
	}
	
	public void actionPerformed (ActionEvent e) {  
		if (e.getSource()== b)
        tf.setText("Welcome to Javatpoint.");    
    }    
	public static void main(String[] args) {    
		new ButtonEx();
	}    
}