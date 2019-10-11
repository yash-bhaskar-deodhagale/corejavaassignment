package com.yash.org.assignment.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceElement {

	public List<Integer> replaceNumber(Integer numberTobeReplaced, Integer replacementNumber) {
		List<Integer> actualOutputList=new ArrayList<Integer>();
		actualOutputList.add(55);
		actualOutputList.add(25);
		actualOutputList.add(25);
		actualOutputList.add(368);
		if(!actualOutputList.contains(numberTobeReplaced)){
			throw new ElementNotFoundException("Element to be replaced not found");
		}
		else{
		Collections.replaceAll(actualOutputList, numberTobeReplaced, replacementNumber);
		}
		return actualOutputList;
		
	}

}
