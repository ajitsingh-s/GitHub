package Generic;

public class Test1<T,U> {
	T obj1;
	U obj2;
	Test1() {	
	}
	Test1(T obj1,U obj2){
		this.obj1  = obj1;
		this.obj2 = obj2;
	}
	void show() {
		System.out.println("obj1: "+obj1);
		System.out.println("obj2: "+obj2);
	}
	public static void main(String[] args) {
		Test1<String,Integer> t1 = new Test1<String,Integer>("ajit",466);
		t1.show();
		Test1<Integer,Float> t2 = new Test1<Integer,Float>(6546,46.9894f);
		t2.show();
	}
}
