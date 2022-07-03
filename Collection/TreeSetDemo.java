package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(); // this is sorted
		ts.add(10);
		ts.add(15);
		ts.add(21);
		ts.add(11);
		ts.add(14);
		ts.add(9);
		ts.add(6);
		ts.add(8);
		System.out.println(ts); // there is no pointer, it use comparator method internally for sorting. 
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.remove(14));
		System.out.println(ts);
		System.out.println(ts.lower(8));
		System.out.println(ts.higher(15));
		System.out.println(ts.headSet(15));
		System.out.println(ts.subSet(9,20));
		System.out.println(ts.tailSet(10));
		System.out.println(ts.floor(8));
//		Iterator<Integer> itr = ts.iterator();
//		while (itr.hasNext()) {
//			System.out.print((Integer) itr.next()+" ");
//		}
		System.out.println();
		Iterator<Integer> ditr = ts.descendingIterator();	// Use it directly because there is no pointer
		while (ditr.hasNext()) {
			System.out.print((Integer) ditr.next()+" ");
		}
			
		
	}
}
