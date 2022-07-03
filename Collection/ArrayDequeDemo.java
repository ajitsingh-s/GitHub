package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();// store in ramdom order
		ad.push(12);
		ad.add(15);
		ad.push(24);
		ad.add(13);
		ad.push(53);
		ad.add(26);
		ad.addFirst(8);
		ad.addLast(80);
		System.out.println(ad);
		System.out.println(ad.peek()); // extract head element
		System.out.println(ad.pop()); // remove head element
		System.out.println(ad.pollFirst()); // remove first element
		System.out.println(ad.pollLast()); // remove last element
		System.out.println(ad.getFirst()); // get first
		System.out.println(ad.getLast()); // get last
		System.out.println(ad.peekFirst());// get first
		System.out.println(ad.peekLast());// get last
		System.out.println(ad.remove()); // remove head element
		System.out.println(ad.poll()); // remove head element
		System.out.println(ad);
		Iterator<Integer> itr = ad.iterator();
		while (itr.hasNext()) {
			System.out.print((Integer) itr.next()+" ");
		}
		System.out.println();
		Iterator<Integer> ditr = ad.descendingIterator();
		while (ditr.hasNext()) {
			System.out.print((Integer) ditr.next()+" ");
		}
	}
}









