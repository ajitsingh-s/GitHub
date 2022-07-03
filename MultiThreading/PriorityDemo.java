package MultiThreading;

class Counter implements Runnable{
	Thread t;
	int counter = 0;
	boolean goflag;
	
	Counter(int i, String str){
		t  = new Thread(this,str);
		t.setPriority(i);
	}
	public void start() {
		goflag = true;
		t.start();	
	}
	public void end() {
		goflag = false;
	}
	
	@Override
	public void run() {
		while(goflag)
			counter++;
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		Counter t1 = new Counter(Thread.NORM_PRIORITY -2,"1");
		Counter t2 = new Counter(Thread.NORM_PRIORITY -1, "2");
		Counter t3 = new Counter(Thread.NORM_PRIORITY +1, "3");
		Counter t4 = new Counter(Thread.NORM_PRIORITY +2,"4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.end();
		t2.end();
		t3.end();
		t4.end();
		System.out.println("t1 counter  = "+ t1.counter);
		System.out.println("t2 counter  = "+ t2.counter);
		System.out.println("t3 counter  = "+ t3.counter);
		System.out.println("t4 counter  = "+ t4.counter);
	}

}
