package codewithharry;

class Circle {
	private int r;
	
	public void setRadius(int r) {
		this.r  = r;
	}
	public void checkPara(double p) {
		if (2*3.14*r == p)
			System.out.println("Correct parameter of circle");
		else
			System.out.println("Incorrect parameter of circle");
	}
	public void getPara() {
		System.out.println("Parameter of circle is "+(2*3.14*r));
	}
	public void checkArea(double ar) {
		if (3.14*r*r==ar)
			System.out.println("Correct area of circle");
		else
			System.out.println("Incorrect area of circle");
	}
}
class Circle1 {
	public static void main(String []args) {
		Circle cr = new Circle();
		cr.setRadius(5);
		cr.checkArea(78.4);
		cr.checkPara(31.400000000000002);
		cr.getPara();
		
	}
}
