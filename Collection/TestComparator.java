package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<StudentDemo1> al = new ArrayList<StudentDemo1>();
		al.add(new StudentDemo1(101,"Ajit",21));
		al.add(new StudentDemo1(106,"Aman",25));
		al.add(new StudentDemo1(100,"Shweta",29));
		
		System.out.println("Age sort\n");
		Collections.sort(al, new AgeComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			StudentDemo1 obj = (StudentDemo1) itr.next();
			System.out.println(obj.rollNo+" "+obj.name+" "+obj.age);
		}
		
		System.out.println("\nRoll No sort\n");
		
		Collections.sort(al, new RollnoComparator());
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			StudentDemo1 obj1 = (StudentDemo1) itr1.next();
			System.out.println(obj1.rollNo+" "+obj1.name+" "+obj1.age);
		}
	}
}
