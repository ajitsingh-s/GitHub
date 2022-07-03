package Generic;

public class Test3 {
	static<E>void getArray(E [] inarr){
		System.out.println("output of "+inarr.getClass().getName());
		for(Object obj:inarr) {
			System.out.print(" "+obj);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer intarr[] = {3,43,31,123,5,3,43,54,64};
		getArray(intarr);
		Character charr[] = {'w','e','l','l','c','o','m','e'};
		getArray(charr);
		
	}
}
