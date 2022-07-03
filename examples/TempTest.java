package examples;

class Temp4 {
Temp4 () {
	this(10);
	System.out.println("Default Constructor");
}
Temp4 (int x) {
	this (10,12);
	System.out.println("x ="+x);
}
Temp4 (int x, int y) {
	this ("hello");
	System.out.println("x = "+x+"y = "+y);
}
Temp4  (String x) {
	System.out.println("String x = "+x);
}
}

public class TempTest{
	public static void main(String [] args) {
		new Temp4(10);
	}
}


