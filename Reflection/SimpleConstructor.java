package Reflection;

import java.lang.reflect.Constructor;

public class SimpleConstructor {
	public static void nameConstructor(Object obj) {
		Class c1 = obj.getClass();
		Constructor[] arr = c1.getConstructors();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i].getName()+"( ");
			Class arr2[] = arr[i].getParameterTypes();
			for(int j=0; j<arr2.length; j++) {
				System.out.print(arr2[j].getName()+ " ");
			}
			System.out.println(")");
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread();
		nameConstructor(t1);
	}

}
