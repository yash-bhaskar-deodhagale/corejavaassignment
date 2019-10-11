package com.yash.org.assignment.five;

import java.util.ArrayList;
import java.util.List;

public class CreateSubList {

	public List<String> getSubList(List<String> inputData,int start,int end) {
		List<String> subList=new ArrayList<>();
		subList=inputData.subList(start,end);
		return subList;
	}

}
