package com.sei.test;

import junit.framework.Assert;
import junit.framework.TestCase;


public class MathEnhance extends TestCase {

	public void testAdd(){

		com.sei.Math m = new com.sei.Math();
		int x = 0;
		int y = 0;
		int z = 0;
		
		try{
			
			x = m.add(4, 5);
			
			y = m.add("4", "5");
			
			z = m.add("xxx", "aaa");
			
		} catch (NumberFormatException e){
			e.printStackTrace();
		} finally{
			Assert.assertTrue(x==9);
			Assert.assertEquals("not equal", 9, y);
			Assert.assertEquals("not equal", 9, z);
			
		}
	}
	
}
