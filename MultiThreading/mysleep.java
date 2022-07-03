package MultiThreading;

class NewThread1 implements Runnable{
	String tn;
	Thread t;
	NewThread1(String name){
		tn  = name;
		t  = new Thread(this, tn);
		t.start();
	}
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
public class mysleep {
	
	public static void main(String[] args) {
		System.out.println("start");
		NewThread1 newt1  = new NewThread1("one");
		NewThread1 newt2  = new NewThread1("Two");
		try {
			System.out.println("entery in try");
			//Thread.sleep(1000);
			newt1.t.suspend();
			System.out.println("Thread one is suspended");
			Thread.sleep(1000*6);
			newt1.t.resume();
			System.out.println("Thread one is resume");
			newt1.t.join();
			newt2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
