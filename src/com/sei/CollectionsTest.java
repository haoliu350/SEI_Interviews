package com.sei;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

	public List<Color> removeRed(List<Color> colors){
		
		//Question: write your code to remove all the "Red" color from the list and return back.
		
		//my answer as follow
		List<Color> result = new ArrayList<Color>();
		
		for(Color c : colors) {
			if(!"red".equals(c.getColor())){
				result.add(c);
			}
		}
		
		return result;
		
	}
	
	
	
}
