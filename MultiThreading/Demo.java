package MultiThreading;
public class Demo {
	int x,y;
	synchronized public int add(int a,int b) {
		x =a;
		y =b;
		System.out.println("Start in add ");
		try {
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {			 
			e.printStackTrace();
		}
		System.out.println("end of add ");
		return (x+y);
	}

}