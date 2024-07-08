package com.daysix.usingfinal;

public class FinalVariable {
	//final instance variable must be initialized 
	final int x = 100;
	
	static final int y ;
	
	//Declare and initialized static final variable 
	final static int z = 10;
	
	void change() {
//		x = 30;  final variables can't be reassigned
//		y = 200; final static variables can't be reassigned
	}
	
	public String toString() {
		return "FinalVarible [x=" + x + ", y=" + y +"]";
	}
	
	//declare a static block to initialize the final static variable ---- y
	
	static {
		y = 20;
		//z=100;// once initialized can't be reassigned 
		System.out.println("Valur of Y :" + y);
	}
}
