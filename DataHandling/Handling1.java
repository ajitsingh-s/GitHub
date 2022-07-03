package DataHandling;

public class Handling1 {
	
	static void func1()throws Exception{
		func2();
	}
	static void func2() throws Exception {
		func3();
	}
	static void func3() throws Exception {
		int x = 10/0;
		throw new Exception("Exception aagya");
	}
	public static void main(String[] args) throws Exception  {
		Handling1.func1();
	}

}
