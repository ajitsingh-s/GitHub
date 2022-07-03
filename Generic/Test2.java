package Generic;

public class Test2 {
	static <T> void display(T e) {
		System.out.println(e);
		Class c = e.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[] args) {
		display(13);
		display("ajit");
		display(1231.123f);
		display(new Test2());
	}
}
