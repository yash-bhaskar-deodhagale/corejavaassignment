package com.yash.org.assignment.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class VowelCalculator {

	public Integer getVowelCount(String inputString) {
		List<String> listofVowels=new ArrayList<>();
		listofVowels.add("a");
		listofVowels.add("e");
		listofVowels.add("i");
		listofVowels.add("o");
		listofVowels.add("u");
		if(inputString==null){
			throw new RuntimeException("Invalid inputstring");
		}
		String[] splitInputString=inputString.split("");
		Predicate<String> checkVowel=inputChar->listofVowels.contains(inputChar.toLowerCase());
		Function<String[],Integer> vowelCount=inputArray->{
			List<String> list=Arrays.asList(inputArray);
			Long count=list.stream().filter(charValue->checkVowel.test(charValue)).count();
			System.out.println("Count"+count);
			return Integer.valueOf(count.intValue());
					
		};
		return vowelCount.apply(splitInputString);
	}

}
