package com.yash.org.assignment.four;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMinimumMaximum {

	public Map<String,Integer> findMinMax(int[] inputArray) {
		 Map<String,Integer> minMaxMap=new HashMap<>();
         if(inputArray==null){
        	 throw new RuntimeException("Invalid Array");
         }
         Arrays.sort(inputArray);
         minMaxMap.put("min",inputArray[0]);
         minMaxMap.put("max", inputArray[inputArray.length-1]);
		 return minMaxMap;
	}

}
