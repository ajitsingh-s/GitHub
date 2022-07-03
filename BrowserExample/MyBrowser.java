package BrowserExample;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.event.*;

public class MyBrowser extends JFrame implements ActionListener, HyperlinkListener {

	JEditorPane editorpane;
	JLabel url;
	JTextField turl;

	MyBrowser(String str) {
		super(str);
		url = new JLabel("URL:");
		turl = new JTextField(30);
		turl.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(url);
		panel.add(turl);
		panel.setBackground(Color.GRAY);
		panel.setFont(new Font("Arial", Font.BOLD, 24));
		getContentPane().add(panel, BorderLayout.NORTH);

		try {
			editorpane = new JEditorPane();
			editorpane.setEditable(false);
			editorpane.addHyperlinkListener(this);

			JScrollPane scrollpane = new JScrollPane(editorpane);
			getContentPane().add(scrollpane, BorderLayout.CENTER);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Invalid URL/Page!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		setSize(600, 450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String url = null;
		if (e.getSource() == turl)
			url = turl.getText();
		try {
			editorpane.setPage(new URL(url));
			turl.setText(url);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(this, "Invalid LINK!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
		if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
			try {
				editorpane.setPage(e.getURL());
				turl.setText(e.getURL().toExternalForm());
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(this, "Invalid LINK!","Error",JOptionPane.ERROR_MESSAGE );
			}		
		}
	}

	public static void main(String[] args) {
		new MyBrowser("MyBrowser");
	}
}
