package com.daynine;

public interface Bank {
	
	final static float minBal = 5000;
	final static float depositLimit = 25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
	
}


