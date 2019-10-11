package com.yash.org.assignment.ten;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.org.assignment.ten.NextNumberSeries;

public class NextNumberSeriesTest {
	
	@Test
	public void shouldReturnNextNumberOfSeriesProvidedSeries(){
		List<Integer> series=new ArrayList<>();
		series.add(7);
		series.add(10);
		series.add(8);
		series.add(11);
		series.add(9);
		series.add(12);
		NextNumberSeries numSeries=new NextNumberSeries();
		Integer expectedNumber=10;
		Integer actualNumber=numSeries.getNextNumber(series);
		assertEquals(expectedNumber,actualNumber);

	}

}
