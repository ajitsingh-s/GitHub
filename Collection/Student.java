package Collection;

public class Student {
	private String name;
	private int id;
	private String subject;
	private int marks;
	
	Student() {
		System.out.println("Default constructor");
	}
	Student(String name, int id, String subject, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}
	