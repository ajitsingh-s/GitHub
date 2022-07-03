package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.size());
		al.add(5);
		al.add(12);
		al.add(19);
		al.add(21);
		al.add(24);
		al.add(27);
		al.add(31);
		al.add(42);
		al.add(45);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(13);
		al1.add(14);
		al1.add(18);
		al1.add(25);
		al1.add(29);
		al1.add(31);
		al1.add(42);
		al1.add(45);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer z = (Integer)itr.next();
			System.out.print(" "+z);
		}
		System.out.println();
//		al.addAll(al1);
		System.out.println(al);
//		System.out.println(al.removeAll(al1));
		System.out.println(al.retainAll(al1));
		
		Iterator<Integer> itr1 = al.iterator();
		while(itr1.hasNext()) {
			Integer y = (Integer)itr1.next();
			System.out.print(" "+y);
		}
		
		
		
	}
}












