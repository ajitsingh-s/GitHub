package Reflection;

import java.util.ArrayList;

public class SimpleInterface {
	
	public static void nameInterface(Object obj) {
		Class c1 = obj.getClass();
		Class arr [] = c1.getInterfaces();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Temp t1 = new Temp();
		nameInterface(t1);
		Thread t2 = new Thread();
		nameInterface(t2);
		ArrayList t3 = new ArrayList();
		nameInterface(t3);
	}

}

interface A1 {}
interface B1 {}
interface C1 {}
interface D1 {}
class Temp implements A1,B1,C1,D1{

}