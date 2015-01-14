package com.example.SpringLearning;

import java.util.Calendar;

public class CustomCalendar {
	
	public static Calendar getInstance(int year, int month, int date) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, date);
		return calendar;
	}

}
