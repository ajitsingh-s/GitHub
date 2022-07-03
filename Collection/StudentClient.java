package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentClient {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Sumit");
		student.setId(128);
		student.setSubject("SST");
		student.setMarks(59);
		System.out.println("Name : "+student.getName()+"  Id : "+student.getId()+"  Subject : "+student.getSubject()+"  Marks : "+student.getMarks()+"\n");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Ajit",121,"Hindi",95));
		al.add(new Student("Ajit",121,"English",85));
		al.add(new Student("Ajit",121,"Science",78));
		al.add(new Student("Ajit",121,"Maths",81));
		al.add(new Student("Shweta",122,"Hindi",78));
		al.add(new Student("Shweta",121,"English",95));
		al.add(new Student("Shweta",121,"Science",82));
		al.add(new Student("Sanjay",121,"Maths",76));
		al.add(new Student("Manya",121,"Hindi",64));
		al.add(new Student("Manya",121,"English",75));
		al.add(new Student("Suved",121,"Science",68));
		al.add(new Student("Suved",121,"Maths",87));
		System.out.println("\tName"+"\tId"+"\tSubject"+"\tMaths");
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.print("\t"+st.getName()+"\t"+st.getId()+"\t"+st.getSubject()+"\t"+st.getMarks());
			System.out.println();
		}
		
	}
}




