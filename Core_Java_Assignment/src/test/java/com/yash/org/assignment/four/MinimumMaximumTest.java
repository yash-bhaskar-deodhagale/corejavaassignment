package com.yash.org.assignment.four;

import java.util.Map;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.four.FindMinimumMaximum;

public class MinimumMaximumTest {
	
	@Rule
	public ExpectedException expect= ExpectedException.none();
	
	@Test
	public void shouldReturnExceptionFromGivenInvalidArray(){
		int numArray[]=null;
		FindMinimumMaximum minMax=new FindMinimumMaximum();
		expect.expect(RuntimeException.class);
		expect.expectMessage("Invalid Array");
		minMax.findMinMax(numArray);
		
	}
	@Test
	public void shouldReturnMinimumNumberFromGivenArray(){
		int numArray[]={5,4,8,3,6,1,9};
		FindMinimumMaximum minMax=new FindMinimumMaximum();
		Map<String,Integer> resultMap=minMax.findMinMax(numArray);
		assertEquals(resultMap.get("min"),(Integer)1);
		assertEquals(resultMap.get("max"),(Integer)9);
		
	}

}
