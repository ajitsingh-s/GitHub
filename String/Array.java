package String;

public class Array {

	public static void main(String[] args) {
	String [] cars = {"Honda City", "Swift", "Thar", "Wagonr", "Scorpio"};
	int [] amount = {100,120,160,180};
	amount[3] = 500;
	System.out.println(cars[4]);
	System.out.println(amount[3]);
	System.out.println(cars.length);
	//for (int i=0;i<=4;i++)
	//System.out.println(cars [i]);
	for (String i : cars)
		System.out.println(i);
	for (int i : amount)
		System.out.println(i);
	}

}
