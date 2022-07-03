package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		List<Integer> al1  = new ArrayList<>();
		al1.add(5);
		al1.add(10);
		al1.add(15);
		al1.add(20);
		al1.add(25);
		al1.add(27);
		al1.add(29);
		al1.add(30);
		Iterator<Integer> itr = al1.iterator();
		while(itr.hasNext())
			System.out.print(" "+(Integer)itr.next());
		System.out.println("\nSize "+al1.size());
		ArrayList<Integer> al2  = new ArrayList<Integer>();
		al2.add(6);
		al2.add(12);
		al2.add(16);
		al2.add(27);
		al2.add(21);
		al2.add(27);
		al2.add(29);
		al2.add(30);
		System.out.println(al2);
		System.out.println("Size "+al2.size());
		
		System.out.println("Retain "+al1.retainAll(al2));
		System.out.println("after retail al1 :"+al1);
		System.out.println("after retail al2 :"+al2);
		System.out.println("Contains "+al2.containsAll(al1));
		al1.clear();
		System.out.println("after clear al1 "+al1);
		al1.addAll(al2);
		System.out.println("al1 : "+al1);
		System.out.println(al1.hashCode());
		al1.add(10);
		System.out.println("After adding 10 hashcode :"+al1.hashCode());
		System.out.println("al1 equals al2 "+al1.equals(al2));
		al1.remove(new Integer(10));
		System.out.println("After removing 10 from al1 (al1 equals al2) "+al1.equals(al2));
		
		
	}
}
