package com.daysix.staticblockmethod;

public class MyClassDemo {
    public static void main(String[] args) {
    	MyClass.display();
    	
    	System.out.println();
    	
    	MyClass o = new MyClass();
    	System.out.println(o);
    	
    	//static method with class name 
    	MyClass.display();
    	
    	System.out.println();
    	
    	MyClass o2=new MyClass();
		System.out.println(o2);
		
		MyClass.display();
		
		MyClass o3=new MyClass();
		System.out.println(o3);
		MyClass.display();
    }
}
