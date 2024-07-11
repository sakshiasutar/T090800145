package com.dayten;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating string using literals //pools memrory
		String s1 = "SAKSHI";
		String s2 = "SAKSHI";
		
		//create new string operator// heap memroy
		String s3 = new String("SAKSHI");
		String s4 = new String("SAKSHI");
		
		//==
		System.out.println("Case 1:" + (s1==s2));// it will compare object reference
		System.out.println("Case 2:" + (s1==s3));// reference is not getting match
		System.out.println("Case 3:" + (s2.equals(s1)));//it will compare data
		System.out.println("Case 4:" + (s2.equals(s4)));// it will compare data
		System.out.println("Case 5:" + (s3==s4));
		System.out.println("Case 6:" + (s3.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.compareTo("SAKSHI"));
		



	}

}
