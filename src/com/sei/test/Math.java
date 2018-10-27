package com.sei.test;

import junit.framework.Assert;
import junit.framework.TestCase;


public class Math extends TestCase {

	public void testAdd(){
		
		//Question: what is the result of this code segment. Green or Red? Why? How can you improve this code. 
		
		try{
			com.sei.Math m = new com.sei.Math();
			
			int x = m.add(4, 5);
			Assert.assertTrue(x==9);
			
			int y = m.add("4", "5");
			Assert.assertEquals("not equal", 9, y);
			
			int z = m.add("xxx", "aaa");
			Assert.assertEquals("not equal", 9, z);
		} catch (NumberFormatException e){
			e.printStackTrace();
		}
	}
	
}
