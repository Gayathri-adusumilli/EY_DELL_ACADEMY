package com.programming.class_10;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.*;

public class LocalDateTimeClassConcepts {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Current system data is: " + today);
		
		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current India Date is: " + indiaDate);
		
		LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("Current India Date is: " + usDate);
		
		LocalDate firstDay2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("First day of 2023 is: " + firstDay2023);
		
		LocalDate epochDay = LocalDate.ofEpochDay(1000);
		System.out.println("1000th Day from Epoch date is: " + epochDay);
		
		LocalDate hundredth_Day_of_2020 = LocalDate.ofYearDay(2020, 100);
		System.out.println("100th day from Epoch date is: " + hundredth_Day_of_2020 );

			


		
		

				
	}

}
