package MainFunction;

public class Main1 {

	/*public static void main(String[] s) {
		System.out.println("String[] s");
		main("hello");
		main(5);
		main('a');
	}
	*/
	public static void main(String ...s) {
		System.out.println("String ...s");//vag-rag arguments, comes from 1.5 JDK
		main("hello");
		main(5);
		main('a');
	}
	public static void main(String s) {
	System.out.println("String "+s);	
	}
	
	public static void main(char s) {
	System.out.println("Char "+s);
	}
	
	public static void main(int s) {
		System.out.println("Int "+s);
	}
}
