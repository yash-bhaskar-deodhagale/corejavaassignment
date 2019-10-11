package com.yash.org.assignment.two;

import java.util.ArrayList;
import java.util.List;

public class SpyNumber {

	public Boolean checkSpyNumber(Integer inputNumber) {
		if(inputNumber==null){
			throw new RuntimeException("Invalid number");
		}
		List<Integer> digitList=new ArrayList<Integer>();
		while(inputNumber!=0){
			digitList.add(inputNumber%10);
			inputNumber=inputNumber/10;
		}
		int sum=digitList.stream().reduce(0,Integer::sum);
		int mul=digitList.stream().reduce(1, (x,y)->x*y);
		if(sum==mul){
			return true;
		}
		return false;
	}

}
