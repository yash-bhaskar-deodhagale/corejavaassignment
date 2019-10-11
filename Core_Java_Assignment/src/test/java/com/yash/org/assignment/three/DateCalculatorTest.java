package com.yash.org.assignment.three;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import com.yash.org.assignment.three.DateCalculator;

public class DateCalculatorTest {
	
	@Test
	public void shouldReturnDateOfDayFromCurrentDateGivenNumberOfDays(){
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime today=LocalDateTime.now().plusDays(10);
	    String expectedDate=format.format(today);
		DateCalculator dateCal=new DateCalculator();
		String actualDate=dateCal.calculateDate(10);
		assertEquals(expectedDate,actualDate);
		
	}
	
	@Test
	public void shouldReturnSameDateIfGivenNumberOfDaysIsZero(){
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime today=LocalDateTime.now().plusDays(0);
	    String expectedDate=format.format(today);
		DateCalculator dateCal=new DateCalculator();
		String actualDate=dateCal.calculateDate(0);
		assertEquals(expectedDate,actualDate);
		
	}

}
