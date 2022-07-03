package SwingJava;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class JLabels extends JFrame {
	public JLabels(String str) {
		super(str);
		/*WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());*/
		Container content = getContentPane();// make a container
		Font font  = new Font("Serif",Font.PLAIN, 30); // set font 
		content.setFont(font); // font set to container
		
		String labelText = 
				"<html><FONT COLOR = RED> The colour is Red.</FONT> and"+ // label msg
				"<FONT COLOR = BLUE> The colour is blue.</FONT></html>";
		JLabel colorLabel = new JLabel(labelText, JLabel.CENTER); // label msg and orientation 
		colorLabel.setBorder(BorderFactory.createTitledBorder("Mixed Colour"));//Border line with heading
		content.add(colorLabel,BorderLayout.NORTH);
		
		labelText ="<html><B>Bold</B> and <I>Italic</I> Text</html>";
	    JLabel boldLabel = new JLabel(labelText, JLabel.CENTER);
	    boldLabel.setBorder(BorderFactory.createTitledBorder("Mixed Fonts"));
	    content.add(boldLabel, BorderLayout.CENTER);
	    
	    labelText = "<html>India is a good country" +
	    	      "in the world" +
	    	      "<P>" +
	    	      "Major cities of india" +
	    	      "<UL>" +
	    	      "  <LI>delhi" +
	    	      "  <LI>noida" +
	    	      "  <LI>mumbai" +
	    	      "  <LI>meerut" +
	    	      "  <LI>lucknow" +
	    	      "  <LI>patna" +
	    	      "  <LI>bralie" +
	    	      "  <LI>etc" +
	    	      "</UL>";
	    	    JLabel fancyLabel =
	    	      new JLabel(labelText);
	    	    fancyLabel.setBorder(BorderFactory.createTitledBorder("Multi-line HTML"));
	    	    content.add(fancyLabel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JLabels("J Labels using HTML");

	}

}
