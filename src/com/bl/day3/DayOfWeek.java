package com.bl.day3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeek {

	static int method(int year, int month, int day) {
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year > 0 && (month > 0 && month <= 12)) {
			if ((year % 4 == 0 || year % 400 == 0) && month == 2 && (day > 0 && day <= 29)) {
				Calendar calendar = new GregorianCalendar(year, month - 1, day);
				return calendar.get(Calendar.DAY_OF_WEEK);
			} else {
				if (day > 0 && day <= arr[month - 1]) {
					Calendar calendar = new GregorianCalendar(year, month - 1, day);
					return calendar.get(Calendar.DAY_OF_WEEK);
				} else
					return 0;
			}
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] dayofweek = { "Invalid", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday" };

		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		sc.close();
		System.out.println("Day of The Week  is : " + dayofweek[method(year, month, day)]);
	}

}
