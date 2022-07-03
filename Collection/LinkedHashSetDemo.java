package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs =  new LinkedHashSet<String>();
		lhs.add("Ajit");
		lhs.add("Suved");
		lhs.add("Gaurav");
		lhs.add("Shweta");
		lhs.add("Naitik");
		lhs.add("Pari");
		lhs.add("Bittu");
		
		Iterator<String> itr = lhs.iterator() ;
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		lhs.add("Sumit");
		lhs.remove("Ajit");
		lhs.add("Sumit");
		System.out.println(lhs.add("Pari"));
		lhs.add(null);
		System.out.println(lhs);
	}
}
