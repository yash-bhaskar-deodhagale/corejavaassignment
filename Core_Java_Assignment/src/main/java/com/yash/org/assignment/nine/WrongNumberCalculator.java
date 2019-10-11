package com.yash.org.assignment.nine;

import java.util.List;

public class WrongNumberCalculator {

	public Integer findWrongNumber(List<Integer> numberList) {
		Integer evenPosition=numberList.get(0);
		Integer oddPosition=numberList.get(1);
		Integer wrongNumber=-1;
		for(int i=2;i<numberList.size();i++){
			if(i%2==0){
				evenPosition=evenPosition+5;
				if(!(evenPosition==numberList.get(i))){
				wrongNumber= numberList.get(i);
				break;
				}
			}
			else{
				oddPosition=oddPosition+10;
				if(!(oddPosition==numberList.get(i))){
				wrongNumber= numberList.get(i);
				break;
				}
			}
		}
		return wrongNumber;
		
	}

}
