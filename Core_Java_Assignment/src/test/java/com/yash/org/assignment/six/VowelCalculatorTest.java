package com.yash.org.assignment.six;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.six.VowelCalculator;

public class VowelCalculatorTest {
	
	@Rule
	public ExpectedException expect=ExpectedException.none();
	
	@Test
	public void shouldReturnVowelCountGivenInputString(){
		VowelCalculator vCalculator=new VowelCalculator();
		int actualVowelCount=vCalculator.getVowelCount("includehelp");
		int expectedVowelCount=4;
		assertEquals(expectedVowelCount,actualVowelCount);
	}
	
	@Test
	public void shouldReturnZeroCountGivenInputString(){
		VowelCalculator vCalculator=new VowelCalculator();
		int actualVowelCount=vCalculator.getVowelCount("");
		int expectedVowelCount=0;
		assertEquals(expectedVowelCount,actualVowelCount);
	}
	
	@Test
	public void shouldReturnExceptionGivenInvalidString(){
		VowelCalculator vCalculator=new VowelCalculator();
		expect.expect(RuntimeException.class);
		expect.expectMessage("Invalid inputstring");
		vCalculator.getVowelCount(null);
	}

}
