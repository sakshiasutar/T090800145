package com.dayten;

public class StringExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = new String("INDIAN");
        
        System.out.println(s1);
        
        String s2 = s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s1.length());
        int a = s2.length();
        System.out.println("Length is :"+a);
        String s3 = s1.substring(1,5);
        System.out.println(s3);
        System.out.println(s1.trim());
        
        System.out.println(s1.stripTrailing());
        
        s2 = new String(s1);
        
        System.out.println(s1.equals(s2));
	}

}
