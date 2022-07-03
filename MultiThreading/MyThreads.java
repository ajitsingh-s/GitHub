package MultiThreading;

public class MyThreads extends Thread {
	public void run() {
		System.out.println("run start  "+Thread.currentThread().getName());
		for (int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end start  "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
	String name = "Ajit";
	//System.out.println("Main start - "+Thread.currentThread().getName());
	
	
	//Thread.currentThread().setName("ajit");
	
	MyThreads thread1 = new MyThreads();
	thread1.start();
	MyThreads thread2 = new MyThreads();
	thread2.start();
	
	
	System.out.println("Maine end  "+ Thread.currentThread().getName());
	}

}

/*
main

1.child1-methods 
2.child2 -methods

*/