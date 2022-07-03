package Reflection;

import java.awt.Frame;

class A {}
class B extends A{}
class C extends B{}

public class SimpleSuper extends C {
	public static void printSuperName(Object obj) {
		Class c1 = obj.getClass();
		Class c2 = c1.getSuperclass();
		System.out.println(c1.getName());
		
		while(c2!=null) {
			System.out.println(c2.getName());
			c1 = c2;
			c2 = c1.getSuperclass();
		}
	}
	
	public static void main(String[] args) {
		SimpleSuper obj1  = new SimpleSuper();
		printSuperName(obj1);
		Frame f = new Frame();
		printSuperName(f);	
	}
}
