package Methods;
public class Overloading {
	static int Overloading(int x,int y) {
	return x+y;
	}
	static double Overloading(double x, double y) {
	return x+y;
	}
	public static void main (String [] args) {
		
		double num1 = Overloading(7.456,8.97);
		int num2 =Overloading(45,78);
	System.out.println("num1 = "+num1);
	System.out.println("num2 = "+num2);
	}
}
