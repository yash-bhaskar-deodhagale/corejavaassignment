package com.yash.org.assignment.nine;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.org.assignment.nine.WrongNumberCalculator;

public class WrongNumberCalculatorTest {
	
	@Test
	public void shouldGetWrongNumberGivenTheSeriesIsIncorrect(){
	List<Integer> numberList=new ArrayList<>();	
	numberList.add(3);
	numberList.add(12);
	numberList.add(8);
	numberList.add(19);
	numberList.add(13);
	numberList.add(32);
	numberList.add(18);
	numberList.add(42);
	numberList.add(23);
	numberList.add(52);
	WrongNumberCalculator wrongNumbeCal=new WrongNumberCalculator();
	Integer actualWrongNumber=wrongNumbeCal.findWrongNumber(numberList);
	Integer expectedWrongNumber=19;
	assertEquals(expectedWrongNumber,actualWrongNumber);
	List<Integer> numberListTwo=new ArrayList<>();	
	numberListTwo.add(3);
	numberListTwo.add(12);
	numberListTwo.add(8);
	numberListTwo.add(22);
	numberListTwo.add(13);
	numberListTwo.add(32);
	numberListTwo.add(18);
	numberListTwo.add(42);
	numberListTwo.add(22);
	numberListTwo.add(52);
	actualWrongNumber=wrongNumbeCal.findWrongNumber(numberListTwo);
	expectedWrongNumber=22;
	assertEquals(expectedWrongNumber,actualWrongNumber);
	}
	
	@Test
	public void shouldReturnMinusOneNumberGivenTheSeriesIsCorrect(){
	List<Integer> numberList=new ArrayList<>();	
	numberList.add(3);
	numberList.add(12);
	numberList.add(8);
	numberList.add(22);
	numberList.add(13);
	numberList.add(32);
	numberList.add(18);
	numberList.add(42);
	numberList.add(23);
	numberList.add(52);
	WrongNumberCalculator wrongNumbeCal=new WrongNumberCalculator();
	Integer actualWrongNumber=wrongNumbeCal.findWrongNumber(numberList);
	Integer expectedWrongNumber=-1;
	assertEquals(expectedWrongNumber,actualWrongNumber);
	}
	

}
