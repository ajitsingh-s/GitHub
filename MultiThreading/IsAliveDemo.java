package MultiThreading;

class CustomThread extends Thread{
	CustomThread(String name) {
		super(name);
		start();
	}
	public void run() {
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(" thread here..."+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) { }
		System.out.println(Thread.currentThread().getName() + " ending");
	}
}
public class IsAliveDemo{
	public static void main(String args[]) {
		CustomThread thread1 = new CustomThread("1");
		CustomThread thread2 = new CustomThread("2");
		CustomThread thread3 = new CustomThread("3");
		CustomThread thread4 = new CustomThread("4");
		System.out.println("Thread1 is alive- "+thread1.isAlive());
		try {
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		}
		catch (InterruptedException e) { }
		System.out.println(thread4.isAlive());
	}
}