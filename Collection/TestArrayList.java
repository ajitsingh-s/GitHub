package Collection;

import java.util.ArrayList;

public class TestArrayList {
	public String toString() {
		return "[]";
	}
	public static void main(String[] args) {
		TestArrayList obj = new TestArrayList();
		System.out.println("Ref. "+obj);
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println("Empty "+al.isEmpty());
		System.out.println("Size "+al.size());
		al.add(10);
		al.add("ajit");
		al.add('a');
		al.add(121.123f);
		al.add(132.32);
		al.add(new Integer(10));
		System.out.println(al);
		System.out.println("Empty "+al.isEmpty());
		System.out.println("Size "+al.size());
	}
}
