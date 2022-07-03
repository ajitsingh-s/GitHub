package Collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,Integer> tm  = new TreeMap<String,Integer>();// Sorted order
		tm.put("AZ", 12);
		tm.put("ZA", 23);
		tm.put("AF", 31);
		tm.put("AQ", 1);
		tm.put("I", 19);
		tm.put("T", 2);
		tm.put("I", 5);
		tm.put("ZW", 9);
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.floorKey("S"));// before the previous element 
		System.out.println(tm.ceilingKey("ZX"));// after the given element
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey("AQ"));// Before the element
		System.out.println(tm.remove("T",2));
		System.out.println(tm);
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.higherKey("AZ"));// after the element
		System.out.println(tm.headMap("AQ"));
		Set<Entry<String, Integer>> set = tm.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next(); 
			System.out.print(obj+" ");
		}
		System.out.println("\nKey Set");
		Set<String> set1 = tm.keySet();
		Iterator<String> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Object obj = itr1.next();
			System.out.print(obj+" = "+tm.get(obj)+" ");
		}
	
	}
	
}
