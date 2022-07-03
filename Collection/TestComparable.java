package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparable {
	public static void main(String[] args) {
		ArrayList<StudentDemo> al = new ArrayList<StudentDemo>();
		al.add(new StudentDemo(103,"Ajit",24));
		al.add(new StudentDemo(101,"Aman",25));
		al.add(new StudentDemo(102,"Anil",21));
		
		Collections.sort(al);
		Iterator<StudentDemo> itr = al.iterator();
		while (itr.hasNext()) {
			StudentDemo obj = (StudentDemo) itr.next();
			System.out.println("Roll no: "+obj.rollNo+" Name: "+obj.name+" Age: "+obj.age);
		}
	}
}
