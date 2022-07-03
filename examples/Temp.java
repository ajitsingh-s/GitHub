package examples;
//import java.util.Scanner;
class Temp{
	int x,y;
	Temp(){
	  /*System.out.println("Default Constructor ...");
	  System.out.println("The Ref. Id of this   "+this);*/
	  x=10;
	  y =20;
	}
	Temp(int x ,int y){
		  this.x=x;
		  this.y =y;
	}
	void show(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public static void main(String []args){
		Temp obj = new Temp();
		//System.out.println("The Ref. Id of obj   "+obj);
		obj.show();
		
		Temp obj1 = new Temp(5,6);
		//System.out.println("The Ref. Id of obj1   "+obj1);
		obj1.show();
		
		//new Temp(123,213);
		new Temp(783,213).show();
	}
}
/*
Parameterized The Constructor take arguments are called parameterized constructor
It is Initialized the value of Data Member at run time whenever new object 
of class is Created  to pass run time value .
*/