package com.organization.timesandbox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDisplayMethods {

	
	public static void displayLocalTime(LocalTime lt)
	{
		System.out.println(lt);
		
		
		System.out.println("Hour: " + lt.getHour());
		
		
		System.out.println("Minute " + lt.getMinute());
		
		System.out.println("Second " + lt.getSecond());
		
		
		
	}
	
	
	public static void displayLocalDateTime(LocalDateTime ldt)
	{
		
		System.out.println(ldt);
		
		System.out.println("Year: " + ldt.getYear());
		
		System.out.println("Month: " + ldt.getMonth());
		
		System.out.println("Day of Year: " + ldt.getDayOfYear());
		
		System.out.println("Day of Week: " + ldt.getDayOfWeek());
		
		System.out.println("Day of Month: " + ldt.getDayOfMonth());
		
		
		System.out.println("Hour: " + ldt.getHour());
		
		
		System.out.println("Minute " + ldt.getMinute());
		
		System.out.println("Second " + ldt.getSecond());
		
		
		
	}
	
	public static void displayLocalDate(LocalDate ld)
	{
		
		System.out.println(ld);
		
		System.out.println("Year: " + ld.getYear());
		
		System.out.println("Month: " + ld.getMonth());
		
		System.out.println("Day of Year: " + ld.getDayOfYear());
		
		System.out.println("Day of Week: " + ld.getDayOfWeek());
		
		System.out.println("Day of Month: " + ld.getDayOfMonth());
	}
}
