package com.yash.org.assignment.seven;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capitalize {

	public String getCapitalized(String inputString) {
		
		if(inputString==null||inputString.isEmpty()){
			throw new RuntimeException("Invalid input string");
		}
		String[] splitString=inputString.split(" ");
		Function<String, String> capitalizeFirstLast = word -> word.substring(0, 1).toUpperCase()
				+ word.substring(1, word.length() - 1) + word.substring(word.length() - 1).toUpperCase();
		
		String capitalizedString=Arrays.asList(splitString).stream().map(input->capitalizeFirstLast.apply(input)).collect(Collectors.joining(" "));
		return capitalizedString;
	}

}
