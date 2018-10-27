package com.sei;

public class Math {

	public int add(int a, int b){
		return a + b;
	}
	
	public int add(String a, String b){
		Integer aInteger = Integer.parseInt(a);
		Integer bInteger = Integer.parseInt(b);
		return aInteger.intValue() + bInteger.intValue();
	}
	
}
