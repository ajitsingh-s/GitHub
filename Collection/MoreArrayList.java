package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MoreArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ajit");
		al.add("amit");
		al.add("sumit");
		al.add("ankit");
		al.add("ajay");
		al.add("ramesh");
		System.out.println(al);
//		Iterator itr = al.iterator();
//		while (itr.hasNext()) {
//			String str = (String) itr.next();
//			System.out.println(str);
//		}
		al.add(3, "abhay");
		al.set(0, "shweta");
		System.out.println(al);
		
		
		
	}

}
