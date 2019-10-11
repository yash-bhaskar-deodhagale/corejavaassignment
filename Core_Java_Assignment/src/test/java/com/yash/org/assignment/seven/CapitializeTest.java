package com.yash.org.assignment.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.seven.Capitalize;

public class CapitializeTest {
	
	@Rule
	public ExpectedException expect=ExpectedException.none();
	
	@Test
	public void shouldReturnStringWithCapitalizeFirstAndLastLetterOfEachWordGivenInputString(){
		Capitalize capital=new Capitalize();
		String actual=capital.getCapitalized("yash pune office");
		String expected="YasH PunE OfficE";
		assertEquals(expected,actual);	
	}
	
	@Test
	public void shouldReturnExpectionGivenInvalidInputNull(){
		Capitalize capital=new Capitalize();
		expect.expect(RuntimeException.class);
		expect.expectMessage("Invalid input string");
		capital.getCapitalized(null);
		
	}
	
	@Test
	public void shouldReturnExpectionGivenInvalidInputEmpty(){
		Capitalize capital=new Capitalize();
		expect.expect(RuntimeException.class);
		expect.expectMessage("Invalid input string");
		capital.getCapitalized("");
		
	}

}
