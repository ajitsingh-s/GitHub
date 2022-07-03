package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("Sumit");
		v.addElement("Amit");
		v.addElement("Sanjay");
		v.addElement("Manish");
		v.addElement("Ankit");
		System.out.println(v);
		System.out.println(v.elementAt(3));
		System.out.println(v.capacity());
		System.out.println(v.contains("Amit"));
		System.out.println(v.firstElement());
		v.trimToSize();
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.indexOf("Manish"));
		System.out.println(v.remove("Ankit"));
		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) {
			String string = (String) enu.nextElement();
			System.out.print(string+" ");
		}
		Vector<String> v1 = new Vector<String>(v);
		System.out.println("\n"+v1);
		
		Collections.sort(v);
		System.out.println();
		
		
	}
}
