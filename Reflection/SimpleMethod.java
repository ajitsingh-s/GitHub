package Reflection;

import java.awt.Frame;
import java.lang.reflect.Method;


public class SimpleMethod {
	public static void printMethods(Object obj) {
		Class c1 = obj.getClass();
		Method[] arr = c1.getMethods();
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i].getReturnType().getName());// it shows return type of methods
			System.out.print(" "+arr[i].getName()+" (");// it shows the name of methods
			Class args [] = arr[i].getParameterTypes(); // it get the methods parameter in array
			for (int j=0; j<args.length; j++) {
				System.out.print(" "+args[j].getName()); // it shows the name of the parameter of methods.
			}
			System.out.println(" )");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		SimpleMethod obj = new SimpleMethod();
		//printMethods(obj);
		Frame obj1 = new Frame();
		printMethods(obj1);
	}

}
