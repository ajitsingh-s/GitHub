package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(54);
		al.add(24);
		al.add(46);
		al.add(64);
		al.add(25);
		al.add(34);
//		System.out.println(al);
		System.out.println("Forward order");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print((Integer)itr.next()+" ");
		}
//		al.forEach((a)->System.out.print(" "+a)); //Lambda Expression
//		ListIterator<Integer> litr =  al.listIterator();
//		
//		System.out.println("Forward order");
//		while (litr.hasNext()) {
//			System.out.print((Integer)litr.next()+" ");						
//		}
//
//		System.out.println("\nReverse order");
//		while (litr.hasPrevious()) {
//			System.out.print((Integer)litr.previous()+" ");						
//		}
	}

}
