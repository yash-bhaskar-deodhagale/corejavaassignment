package com.yash.org.assignment.ten;

import java.util.List;

public class NextNumberSeries {

	public Integer getNextNumber(List<Integer> series) {
		int number=series.get(0);
		int next=number;
		for(int i=1;i<=series.size();i++){
			if(i%2==0){
				next=next-2;
			}
			else{
				next=next+3;
			}
		}
		return next;
	}

}
