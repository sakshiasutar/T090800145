package com.daysix.usingfinal;

final class FinalClass{
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from final class

public class FinalClassDemo {
    public static void main(String[] args) {
    	FinalClass f1 = new FinalClass();
    	f1.show();
    }
}
