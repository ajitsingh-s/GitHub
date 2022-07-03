package Login;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Registration extends JFrame implements ActionListener {
	private Container c;
	
	private JLabel title;
	private JLabel name;
	private JLabel mail;
	private JLabel mob;
	private JLabel gender;
	private JLabel dob;
	private JLabel add;
	private JLabel done;
	
	private JTextField tname;
	private JTextField tmail;
	private JTextField tmob;
	
	private JTextArea tadd;
	private JTextArea area;
	
	private JRadioButton male;
	private JRadioButton female;
	
	private JButton sub;
	private JButton rset;
	
	private JComboBox day;
	private JComboBox month;
	private JComboBox year;
	
	private JCheckBox terms;
	
	public Registration(String str) {
		super(str);
		c = getContentPane();
		Font fl = new Font("Arial",Font.BOLD,18);
		Font ft = new Font("Arial",Font.PLAIN,18);
		title = new JLabel("Registration Form");
		title.setBounds(350, 20, 200, 30);
		title.setFont(new Font("Arial",Font.BOLD,20));
		c.add(title);
		
		name = new JLabel("Name:");
		name.setLocation(70, 80);
		name.setSize(100, 30);
		name.setFont(fl);
		c.add(name);
		
		tname = new JTextField();
		tname.setLocation(200, 80);
		tname.setSize(240, 30);
		tname.setFont(ft);
		c.add(tname);
		
		mail = new JLabel("Email-ID:");
		mail.setLocation(70, 120);
		mail.setSize(100, 30);
		mail.setFont(fl);
		c.add(mail);
		
		tmail = new JTextField();
		tmail.setLocation(200, 120);
		tmail.setSize(240, 30);
		tmail.setFont(ft);
		c.add(tmail);
		
		mob = new JLabel("Phone No.:");
		mob.setLocation(70, 160);
		mob.setSize(100, 30);
		mob.setFont(fl);
		c.add(mob);
		
		tmob = new JTextField();
		tmob.setLocation(200, 160);
		tmob.setSize(240, 30);
		tmob.setFont(ft);
		c.add(tmob);
		
		gender = new JLabel("Gender:");
		gender.setLocation(70, 200);
		gender.setSize(100, 30);
		gender.setFont(fl);
		c.add(gender);
		
		male = new JRadioButton("Male");
		male.setLocation(200, 200);
		male.setSize(100, 30);
		male.setFont(fl);
		c.add(male);
		
		female = new JRadioButton("Female");
		female.setLocation(300, 200);
		female.setSize(100, 30);
		female.setFont(fl);
		c.add(female);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		dob = new JLabel("Date of Birth:");
		dob.setLocation(70, 240);
		dob.setSize(150, 30);
		dob.setFont(fl);
		c.add(dob);
		String d [] = {"DD","01","02","03","04","05","06","07","08","09","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		day = new JComboBox(d);
		day.setLocation(200, 240);
		day.setSize(60, 30);
		day.setFont(fl);
		c.add(day);	
		String [] m = {"MM","01","02","03","04","05","06","07","08","09","10","11","12"};
		month = new JComboBox(m);
		month.setLocation(265, 240);
		month.setSize(60, 30);
		month.setFont(fl);
		c.add(month);	
		String [] y = {"YY","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
		year = new JComboBox(y);
		year.setLocation(330, 240);
		year.setSize(65, 30);
		year.setFont(fl);
		c.add(year);	
		
		add = new JLabel("Address:");
		add.setLocation(70, 280);
		add.setSize(100, 30);
		add.setFont(fl);
		c.add(add);
		
		tadd = new JTextArea();
		tadd.setLocation(200, 285);
		tadd.setSize(240, 100);
		tadd.setFont(ft);
		c.add(tadd);
		
		terms = new JCheckBox("Accept Terms and Conditions."); 
		terms.setLocation(120, 400);
		terms.setSize(300, 30);
		terms.setFont(ft);
		c.add(terms);
		
		sub = new JButton("Submit"); 
		sub.setLocation(140, 460);
		sub.setSize(100, 30);
		sub.setFont(ft);
		sub.addActionListener(this);
		c.add(sub);
		
		
		rset = new JButton("Reset"); 
		rset.setLocation(260, 460);
		rset.setSize(100, 30);
		rset.setFont(ft);
		rset.addActionListener(this);
		c.add(rset);
		
		done = new JLabel("");
		done.setLocation(140, 520);
		done.setSize(500, 30);
		done.setFont(new Font("Arial",Font.BOLD,20));
		done.setForeground(Color.RED);
		c.add(done);
		
		area = new JTextArea();
		area.setLocation(470, 80);
		area.setSize(380, 400);
		area.setFont(fl);
		area.setForeground(Color.BLUE);
		c.add(area);
		
		c.setLayout(null);
		setSize(900,650);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sub) {
			if((tname.getText().length() > 3)&&(tmob.getText().length() >= +10)&&(tadd.getText().length() > 3)) {
			if(terms.isSelected()) {
			String gend;
			String textinfo1 = "Name: "+tname.getText()+"\n"+"Email-ID: "+tmail.getText()+"\n"+
			"Phone No. :"+tmob.getText()+"\n";
			if (male.isSelected()) {
				gend = "Gender: Male"+"\n";
			}
			else {
				gend = "Gender: Female"+"\n";
			}
			String textinfo2 = "Date of Birth:" +  (String)day.getSelectedItem()+"/"
			+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n"+"Adress:"
					+tadd.getText()+"\n"+"\n"+"SUBMITTED..!";
			
			area.setText(textinfo1+gend+textinfo2);
			area.setEditable(false);
			done.setText("Registration Successful!");
			
		}
			else {
				area.setText("");
				done.setText("Please accept the terms & conditions...");
			}
		}
			else {
				done.setText("Invalid data");
			}
		}
		else if (e.getSource() == rset) {
			String blank = "";
			tname.setText(blank);
			tmail.setText(blank);
			tmob.setText(blank);
			tadd.setText(blank);
			area.setText(blank);			
			day.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			terms.setSelected(false);
			done.setText(blank);
		}
	}
	public static void main(String[] args) {
		new Registration("Registation Form");
	}
}


