package com.daynine.nested.interfacedemo;

public interface OuterInterface {
    void calArea();
    
    interface InnerInterface{
    	int id = 20;
    	void print();
    }
}
