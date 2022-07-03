package Collection;

import java.util.ArrayList;

public class LamdaDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(14);
		al.add(21);
		al.add(22);
		al.add(42);
		al.add(13);
		al.add(15);
		//System.out.println(al);
		al.forEach((a)->{
			System.out.println(a);
		});
	}

}
// Lamda expresion
//	(a)->{
//		System.out.println(a);
//	}

//interface A{
//	void show();
//}
//
//class Temp{
//	public static void main(String[] args) {
//		A a = new A(){
//			public void show(){
//			System.out.println("hello");
//			}
//		};
//		a.show();
//	}
//}
