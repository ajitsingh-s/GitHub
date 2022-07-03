package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(5);
		al1.add(10);
		al1.add(15);
		al1.add(20);
		al1.add(25);
		al1.add(30);
		al1.add(35);
		al1.add(40);
		al1.add(45);
		al1.add(46);
		al1.add(47);
		System.out.println("Size "+al1.size());
		System.out.println("Empty "+al1.isEmpty());
		Iterator<Integer> itr = al1.iterator();
		while(itr.hasNext())
			System.out.print(" "+(Integer)itr.next());
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(34);
		al2.add(36);
		al2.add(37);
		al2.add(40);
		al2.add(41);
		al2.add(45);
		al2.add(46);
		al2.add(47);
		System.out.println("\nSize "+al2.size());
		Object x [] = al2.toArray();
		for(int i=0;i<x.length;i++) {
			System.out.print((Integer)x[i]+" ");
		}
		al1.addAll(al2);
		System.out.println("\n"+al1);
		System.out.println(al1.contains(10));
		System.out.println(al1.containsAll(al2));
		System.out.println(al2.containsAll(al1));
		System.out.println("Remove 5th index "+al1.remove(5));
		System.out.println("Remove 10 "+al1.remove(new Integer(10)));
		System.out.println(al1);
		System.out.println(al1.removeAll(al2));
		System.out.println(al1);
		
		
		
		
		
		
	}
}
