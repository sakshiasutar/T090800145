package com.dayfour.firstpackage;

public class Base {
    // declare default, private, protected and public variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	// declare  default, private protected and public methods
	
	void methodDefault() {
		System.out.println("Default access Base class");
		System.out.println("Default Variable : " + varDefault);
	}
	
	void methodPublic() {
		System.out.println("Public access Base class");
		System.out.println("Public Variable : " + varPublic);
	}
	
	void methodPrivate() {
		System.out.println("Private access Base class");
		System.out.println("Private Variable : " + varPrivate);
	}
	
	void methodProtected() {
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : " + varProtected);
	}
}
