package com.dayten;

//String Buffer class creates of flexible length which can be modified

public class StringExample {
    public static void main(String[] args) {
    	//initialising String
    	
    	char c[] = {'I','N','D','I','A'};
    	
    	String s1 = new String(c);
    	System.out.println(s1);
    	
    	String s2 = new String(s1);
    	
    	System.out.println(s2);
    	
    	//concatenation to prevent long lines
    	
    	String longstr = "This is to show"+" how long sentence"+" can be printed";
    	System.out.println(longstr);
    }
}


