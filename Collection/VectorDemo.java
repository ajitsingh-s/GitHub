package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(10);
		v.add(13);
		v.add(21);
		v.add(24);
		v.add(29);
		v.add(33);
		v.add(10);
		v.add(13);
		v.add(21);
		v.add(24);
		v.add(29);
		v.add(33);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println("Enumeration........");
		Enumeration<Integer> eum = v.elements();
		while (eum.hasMoreElements()) {
			Integer integer = (Integer) eum.nextElement();
			System.out.print(integer+" ");
		}
		System.out.println("\nIterator........");
		Iterator<Integer> itr = v.iterator();
		while (itr.hasNext()) {
			Integer b = (Integer) itr.next();
			System.out.print(b+" ");
		}
		System.out.println();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(10);
		al.add(13);
		al.add(21);
		al.add(24);
		System.out.println(al);
		Vector<Integer> v1 = new Vector<Integer>(al);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		al.add(42);
		System.out.println("v2");
		Vector<Integer> v2 = new Vector<Integer>(al);
		System.out.println("after add v2 : "+v2.capacity());
		System.out.println(v2.size());
		System.out.println("v3");
		Vector<Integer> v3 = new Vector<Integer>(5);
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		v3.add(10);
		v3.add(13);
		v3.add(21);
		v3.add(24);
		v3.add(29);
		v3.add(33);
		System.out.println("after add v3 : "+v3.capacity());
		System.out.println(v3.size());
		System.out.println("v4");
		Vector<Integer> v4 = new Vector<Integer>(5,3);
		System.out.println(v4.capacity());
		System.out.println(v4.size());
		v4.add(10);
		v4.add(13);
		v4.add(21);
		v4.add(24);
		v4.add(29);
		v4.add(33);
		System.out.println("after add v4 : "+v4.capacity());
		System.out.println(v4.size());
		
		
		
		
		
	}
}
