package Reflection;

import java.awt.Button;

public class SimpleGetName {
	
	public static void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}
	
	public static void printName(String str) throws Exception {
		Class c = Class.forName(str);
		System.out.println(c.getName());
		SimpleGetName sgn = (SimpleGetName) c.newInstance();
		sgn.checkWorking();
	}
	void checkWorking() {
		System.out.println("checked method");
	}
	
	public static void main(String[] args) throws Exception {
		SimpleGetName obj  = new SimpleGetName();
		printName(obj);
		Thread t1 = new Thread();
		printName(t1);
		Button b1  = new Button();
		printName(b1);
		printName("Reflection.SimpleGetName");
		
		Class c1 = Reflection.SimpleGetName.class;
		System.out.println(c1.getName());
		SimpleGetName ob = (SimpleGetName) c1.newInstance();
		ob.checkWorking();
	}

}
