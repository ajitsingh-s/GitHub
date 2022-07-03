package Solution;

/*
The factory returned class Cake
Someone ordered a Dessert!

The factory returned class Pizza
Someone ordered Fast Food!
*/


interface Food{
	String getType();
}
class Cake implements Food{
	@Override
	public String getType() {
	
		return null;
	}
}

class Pizza implements Food{
	@Override
	public String getType() {
	
		return null;
	}
}

public class Solution123 {
	public static void main(String[] args) {
		FoodFactory ffobj;
	
	
	
	}
}

class FoodFactory{
	String getFood(String str) {
		
		return str;
		
	}
}
