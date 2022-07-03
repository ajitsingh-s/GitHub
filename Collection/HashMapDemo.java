package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(10,"Ajit");
		hm.put(11,"Sumit");
		hm.put(15,"Aman");
		hm.put(9,"Lalit");
		hm.put(14,"Vikas");
//		hm.put(14, "Rittu"); // it replace the previous value
//		hm.put(12,"Aman");// It contains multiple duplicate values
//		hm.put(null, null);
		hm.put(null, "Vibhor");// it contains null key and null value
//		System.out.println(hm.get(14));  // it gives value of a particular key
//		System.out.println(hm.containsValue("Am1an"));
		System.out.println(hm.clone());// it give a clone of a Map
//		System.out.println(hm.remove(15));
//		System.out.println(hm.remove(null,null));
//		System.out.println(hm.containsKey(14));
//		System.out.println(hm.replace(10,"Anil"));
		
		System.out.println("Through iterator");
		
		Set<Integer> set = hm.keySet();
		Iterator<Integer> itr = set.iterator(); 
		while(itr.hasNext()) {
			Object x =itr.next();
			System.out.println(x+" = "+hm.get(x));
		}
		
		Set<Entry<Integer,String>> set1 = hm.entrySet();
		Iterator<Entry<Integer,String>> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
	}
}







