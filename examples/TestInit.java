package examples;

class Temp5  {

	     
		Temp5 (){
		 
			System.out.println("Default Constr..");
			 
		}
		{
			System.out.println("First Init Block"); 
			
		}
		Temp5(int x){
		 
			System.out.println(" x = "+ x);
		
		}
		{
			System.out.println("Second Init Block"); 
			
		}
		 
	}
public class TestInit{
		public static  void main(String ...s){
		System.out.println(" object 1st"); 
		  new Temp5();
		System.out.println(" object 2nd"); 
		  new Temp5(10);
		}
	}

