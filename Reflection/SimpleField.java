package Reflection;

import java.awt.Color;
import java.lang.reflect.Field;

public class SimpleField {
	int x;
	public static void nameField(Object obj) {
		Class c1  = obj.getClass();
		Field[] arr = c1.getFields();
		for (int i=0;i<arr.length;i++) {
			Class type = arr[i].getType();
			System.out.print(type.getName() +" ");
			System.out.println(arr[i].getName());
			
		}
		
	}

	
	
	
	
	public static void main(String[] args) {
		SimpleField obj = new SimpleField();
		nameField(obj);
		Thread t1 = new Thread();
		nameField(t1);
		Color cl  = new Color(1);
		nameField(cl);
	}
}
