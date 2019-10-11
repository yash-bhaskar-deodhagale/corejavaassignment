package com.yash.org.assignment.three;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateCalculator {

	public String calculateDate(int numberOfDays) {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime today=LocalDateTime.now().plusDays(numberOfDays);
	    String calculatedDate=format.format(today);
		return calculatedDate;
	}

}
