package com.daysix.staticblockmethod;

public class MyClass {
    private int section;//non-static or instance variable
    
    private static int srNo; // static or class variable
    
    // static block
    
    static {
    	System.out.println("--------Within static block---------");
    	srNo = 1000;
    }
    
//    default Constructor
    MyClass(){
    	System.out.println("--------Within Default Constructor----------");
    	srNo++;//1001
    	section++;//1
    }
    
    public String toString() {
    	return "MyClass [serial No " + srNo + ",section=" + "]";
    }
    
//    static method
    static void display() {
//    	System.out.println("Section :" + section);// can't access non static members
    	
    	System.out.println("Serial No :" + srNo);
    }
}
