package com.daynine;

public class SavingAccount extends Customer implements Bank {
	
	private int accNo;
	private float balance;
	
	
    public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount < 0 || amount > depositLimit) {
			System.out.println("Please deposit valid amount");
		}
		else {
			balance += amount;
			
			System.out.println("Rs : " + amount +" is deposited successfully");
		}
	}
	
	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount <= balance-minBal) {
			balance -= amount;
			System.out.println("Rs : " + amount +" is withdrawal successfully");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance() + "]";
	}

}
