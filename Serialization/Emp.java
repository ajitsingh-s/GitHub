package Serialization;

public class Emp extends Base {
	int a;
	static int b;
	transient int c;
	volatile int x;
	String name;
	int y;
	Emp() {	}
	Emp(String name, int a,int b, int c, int x, int y, int z) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.x = x;
		this.y  = y;
		this.z  = z;
		
	}
}
