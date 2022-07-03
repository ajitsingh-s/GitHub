package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ajit");
		hs.add("Sumit");
		hs.add("Abhay");
		hs.add("Sanjay");
		hs.add("Vaibhav");
		hs.add("Tarun");
		hs.add("Shivam");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string+" ");
		}
		System.out.println(hs.remove("Shivam"));
		System.out.println(hs);
		System.out.println(hs.add("Amit"));
		System.out.println(hs.add("Amit"));
		Iterator<String> itr1 = hs.iterator();
		while (itr1.hasNext()) {
			String string = (String) itr1.next();
			System.out.println(string+" ");
		}
		
	}
}








