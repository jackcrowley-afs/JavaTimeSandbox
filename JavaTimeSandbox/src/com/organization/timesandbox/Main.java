package com.organization.timesandbox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;


public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("Date Object:");	
		LocalDate ld = LocalDate.now();
		TimeDisplayMethods.displayLocalDate(ld);
		
		
		System.out.println("\nTime Object:");		
		LocalTime lt = LocalTime.now();
		TimeDisplayMethods.displayLocalTime(lt);
		
		
		System.out.println("\nDateTime Object:");				
		LocalDateTime ldt = LocalDateTime.now();	
		TimeDisplayMethods.displayLocalDateTime(ldt);
	}
	
	


}
