package com.daynine;
// interface will by default make the data member as static, final variables.
// Special kind of class which consists of only the constants and the method signature

// Need of abstraction
// Total Abstraction
// Multiple Inheritance 
// Loose coupling : all the methods and classes are entirely independent and archives Loose Coupling.


// interface face is IS-A relation
// it cannot have constructor

//Types of Interface
// 1. Functional Interface : when the interFace contains only one abstract method then it is known as a function interface.
// 2. Marker Interface : it is empty interface.eg cloneable.



public class InterfaceExample {
    public static void main(String[] args) {
    	SavingAccount s1 = new SavingAccount("Zeel","Pune",1234567,50000);
    	
    	s1.deposit(12000);
    	System.out.println(s1);
    	
    	s1.withdraw(10000);
    	System.out.println(s1);
    	
    	s1.withdraw(51000);
    	System.out.println(s1);
    	
    }
}
