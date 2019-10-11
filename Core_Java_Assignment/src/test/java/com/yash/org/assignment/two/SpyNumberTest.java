package com.yash.org.assignment.two;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.two.SpyNumber;

public class SpyNumberTest {
	
	@Rule
	public ExpectedException exception=ExpectedException.none();
	
	@Test
	public void shouldReturnTrueIfNumberisSpyNumber(){
		SpyNumber spyNumber=new SpyNumber();
		Boolean actual=spyNumber.checkSpyNumber(123);
		assertEquals(true,actual);
		
	}
	
	@Test
	public void shouldReturnFalseIfNumberisNotSpyNumber(){
		SpyNumber spyNumber=new SpyNumber();
		Boolean actual=spyNumber.checkSpyNumber(24);
		assertEquals(false,actual);	
	}
	
	@Test
	public void shouldReturnExceptionIfInputIsNotANumber(){
		SpyNumber spyNumber=new SpyNumber();
		exception.expect(RuntimeException.class);
		exception.expectMessage("Invalid number");
		spyNumber.checkSpyNumber(null);
		
		
	}

}
