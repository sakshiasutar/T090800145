package com.daynine.nested.interfacedemo;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Outer Interface");
		
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		System.out.println("Inner Interface");
	
		
	}
    
}
