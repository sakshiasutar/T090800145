package com.dayten;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer ("Hello");
		System.out.println("Buffer ="+buffer);
		System.out.println("length ="+buffer.length());
		System.out.println("Capacity ="+buffer.capacity());
		
		
		//appending and inserting into buffer
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		
		buffer=new StringBuffer("I Java!");
		buffer.insert(2, "like");
		System.out.println(buffer);
		
		
		
        System.out.println(buffer.reverse());
	}

	
}
