package com.Ravi;

public class Calculator {
public int sum(int a, int b) {
	if(a<0||b<0) {
		throw new IllegalArgumentException();
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return a+b;
}
}
