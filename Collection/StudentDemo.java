package Collection;

public class StudentDemo implements Comparable<StudentDemo>{
	int rollNo;
	String name;
	int age;
	
	
	public StudentDemo(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(StudentDemo o) {
		if(rollNo==o.rollNo)
			return 0;
		else if (rollNo>o.rollNo)
			return 1;
		else
			return -1;
	}
	
}
