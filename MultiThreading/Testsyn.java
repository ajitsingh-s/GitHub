package MultiThreading;

class CThread1 extends Thread {
	Demo d;
	String n;
	CThread1(Demo obj, String name){
		super(name);
		this.d = obj;
		this.n = name;
		start();
	}
	@Override
	public void run() {
		System.out.println(n +" " + d.add(10,20));
	}
}
class CThread2 extends Thread {
	Demo d;
	String n;
	CThread2(Demo obj, String name){
		super(name);
		this.d = obj;
		this.n = name;
		start();
	}
	@Override
	public void run() {
		System.out.println(n + " "+d.add(20,30));
	}
}
class CThread3 extends Thread {
	Demo d;
	String n;
	CThread3(Demo obj, String name){
		super(name);
		this.d = obj;
		this.n = name;
		start();
	}
	@Override
	public void run() {
		System.out.println(n + " "+d.add(30,40));
	}
}

public class Testsyn {

	public static void main(String[] args) {
		Demo obj = new Demo();
		CThread1 t1 = new CThread1(obj,"one");
		CThread2 t2 = new CThread2(obj,"two");
		CThread3 t3 = new CThread3(obj,"three");

	}

}
