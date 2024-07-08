package com.dayfour.firstpackage;

public class Executor {
    public static void main(String[] args) {
    	
    	//accessing same package class
    	Base b1 = new Base();
    	b1.methodDefault();
    	b1.methodProtected();
    	b1.methodPublic();
    	
    	b1.varDefault = 11;
    	b1.methodDefault();
    	
    	// Private member can't be accessible
//    	b1.methodPrivate();
    	
    	b1.varProtected= 21;
    	b1.methodProtected();
    	
    	b1.varPublic = 345;
    	b1.methodPublic();
    	
//      instance of operator
    	System.out.println(b1 instanceof Base);//returns true
    	
    }
}
