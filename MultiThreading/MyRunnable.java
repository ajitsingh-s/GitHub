package MultiThreading;

public class MyRunnable implements Runnable {
	
	
	@Override
	public void run() {
		System.out.println("child thread "+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Main "+Thread.currentThread().getName());
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		//thread.run();
		thread.start();
		System.out.println("end of main");

	}

}
