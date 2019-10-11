package com.yash.org.assignment.five;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.org.assignment.five.CreateSubList;

public class CreateSubListTest {
	
	@Test
	public void shouldReturnSublistFromGivenListGivenStartAndEndIndex(){
		CreateSubList createSubList=new CreateSubList();
		List<String> inputData=new ArrayList<>();
		inputData.add("One");
		inputData.add("Two");
		inputData.add("Three");
		inputData.add("Four");
		inputData.add("Five");
		inputData.add("Six");
		inputData.add("Seven");
		inputData.add("Eight");
		List<String> expectedList=new ArrayList<>();
		expectedList.add("Three");
		expectedList.add("Four");
		expectedList.add("Five");
		expectedList.add("Six");
		expectedList.add("Seven");
		List<String> actualList=createSubList.getSubList(inputData,2,7);
		
		assertEquals(expectedList,actualList);
		
	}

}
