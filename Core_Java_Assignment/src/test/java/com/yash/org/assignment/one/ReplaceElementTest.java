package com.yash.org.assignment.one;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.one.ElementNotFoundException;
import com.yash.org.assignment.one.ReplaceElement;

public class ReplaceElementTest {
	
	@Rule
	public ExpectedException exception=ExpectedException.none();
	
	@Test
	public void shouldReplaceNumberInArraylistProvidedNumberToBeReplacedIsPresentWithReplacementNumber(){
		List<Integer> expectedList=new ArrayList<Integer>();
		ReplaceElement replaceElement=new ReplaceElement();
		expectedList.add(55);
		expectedList.add(6);
		expectedList.add(6);
		expectedList.add(368);
		List<Integer> actualOutputList=replaceElement.replaceNumber(25,6);
		assertEquals(expectedList,actualOutputList);
	}
	
	@Test
	public void shouldThrowElementNotFoundExceptionInArraylistProvidedNumberToBeReplacedIsNotPresent(){
		List<Integer> actualOutputList=new ArrayList<Integer>();
		ReplaceElement replaceElement=new ReplaceElement();
		actualOutputList.add(55);
		actualOutputList.add(6);
		actualOutputList.add(368);
		exception.expect(ElementNotFoundException.class);
		exception.expectMessage("Element to be replaced not found");
		replaceElement.replaceNumber(12,6);
		
	}

}
