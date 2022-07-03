package examples;
class Temp3{
	int x,y;
	Temp3(){  }
	Temp3(int x ,int y){
	  System.out.println("Parameterized Constructor ...");
	  
	  this.x=x;
	  this.y =y;
	}
	 
	Temp3(Temp3 z ){
	  System.out.println("Copy (Parameterized) Constructor ...");
	  System.out.println("The Ref id of z  "+z);
	  System.out.println("The Ref id of this  "+this);
	  this.x = z.x;
	  this.y = z.y;
	   
	}
	void show(){
		System.out.println("x = "+this.x);
		System.out.println("y = "+y);
	}
	public static void main(String []args){
	    System.out.println("Object1..  ");
		Temp3 obj1 = new Temp3(100,200);
		//System.out.println("The Ref id of obj1 "+obj1);
		//obj1.show();
	 	Temp3  obj2 = new Temp3(obj1);
	 	obj2.show();
	}
	
}
/*
Copy The value of Data Member one object to another object it is known as copy
 constructor But thgis work done  in c++ 
 In java copy Constructor is not supported
 This work done with help of Parameterized Constructor
 
 */