package MultiThreading;


class NewThread implements Runnable {
	Thread h;
	String name;
	boolean counter;
	NewThread(String str){
		name = str;
		h = new Thread(this,name);
		counter = false;
		h.start();
		
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0;i<5;i++) {
				Thread.sleep(400);
				System.out.println(Thread.currentThread().getName()+" "+i);
				//Thread.sleep(400);
				synchronized (this) {
					while (counter) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void mysuspend() {
		counter = true;
	}
	
	synchronized void myresume() {// use of it
		counter = false;
		notify();					// function on it
	}
}


public class SuspendResume {
	public static void main(String[] args) {
		NewThread  t1 = new NewThread("one");
		NewThread  t2 = new NewThread("two");
		t1.mysuspend();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.myresume();
		System.out.println("End of main");

	}

}
