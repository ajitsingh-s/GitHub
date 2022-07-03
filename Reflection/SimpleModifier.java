package Reflection;

import java.lang.reflect.Modifier;

public class SimpleModifier {
	public static void nameModifier(Object obj) {
		Class c1 = obj.getClass();
		int m = c1.getModifiers();
		if(Modifier.isPublic(m))
			System.out.print("Public ");
		if(Modifier.isPrivate(m))
			System.out.print("Private ");
		if(Modifier.isProtected(m))
			System.out.print("Protected ");
		if(Modifier.isStatic(m))
			System.out.print("Static ");
	}
	
	public static void main(String[] args) {
		SimpleModifier obj = new SimpleModifier();
		nameModifier(obj);
		String obj1 = new String();
		nameModifier(obj1);
	}
}
