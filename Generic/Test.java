package Generic;

public class Test<T> {
	T obj;
	Test(){
		
	}
	Test(T obj){
		this.obj = obj;
		Class c = obj.getClass();
		System.out.println(c.getName());
	}
	void show() {
		System.out.println("obj: "+obj);
	}
	public static void main(String[] args) {
		Test t1 = new Test(123);
		t1.show();
		Test t2 = new Test("ajit");
		t2.show();
		Test t3  = new Test(15646.3213f);
		t3.show();
			
		
	}
}
