package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Empty "+al.isEmpty());
		System.out.println("Size "+al.size());
		int x[] = {1,-1,-2,2,-3,3,4,-4,5,-5};
		for(int arr: x) {
			Integer obj = new Integer(arr);
			//System.out.print(" "+arr);
			System.out.print(" "+obj);
		}
		System.out.println(al);
		System.out.println(al.size());
		for(int i=0;i<x.length;i++) {
			Integer obj = new Integer(x[i]);
			al.add(obj);
			//al.add(x[i]);
		}
		System.out.println(al);
		al.clear();
		for(int i=0;i<x.length;i++) {
			Integer obj = new Integer(x[i]);
//			al.add(obj);
			al.add(x[i]);
//			if(obj>0)
//				al.add(obj);
//			if(x[i]>0)
//				al.add(x[i]);
		}
		System.out.println(al);
		System.out.println("Empty "+al.isEmpty());
		System.out.println("Size "+al.size());
		
		Iterator<Integer> itr = al.iterator();
//		while(itr.hasNext()) {
//			Integer a = (Integer)itr.next();
//			//int a = itr.next();
//			System.out.print(" "+a);
//		}
		while(itr.hasNext()) {
			Integer a = (Integer)itr.next();
			if(a.intValue()>0)
			System.out.print(" "+a);
		}
	}
}
