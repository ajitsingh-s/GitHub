package MultiThreading;

class CustomThread1 extends Thread {
	public CustomThread1() {}
	public CustomThread1(String str) {
		super(str);
	}
	public void run() {
		System.out.println("CustomThread1  "+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class CustomThread2 extends Thread {
	public CustomThread2() {}
	public CustomThread2(String str) {
		super(str);
	}
	public void run() {
		System.out.println("CustomThread2  "+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
class CustomThread3 extends Thread {
	public CustomThread3() {}
	public CustomThread3(String str) {
		super(str);
	}
	public void run() {
		System.out.println("CustomThread3  "+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}


public class MultiThreaded {

	public static void main(String[] args) {
		//Thread thread = new Thread();
		System.out.println("Main Thread - "+Thread.currentThread().getName());
		System.out.println("Main start");
		//thread.start();// main thread
		CustomThread1 t1 = new CustomThread1("One");
		t1.start();
		CustomThread2 t2 = new CustomThread2("Two");
		t2.start();
		CustomThread3 t3 = new CustomThread3("Three");
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end");
	}

}
