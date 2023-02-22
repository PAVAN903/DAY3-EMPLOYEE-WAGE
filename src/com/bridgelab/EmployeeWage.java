package com.bridgelab;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		Random ran = new Random();
		int attendance = ran.nextInt(2);
		int WageperHour=20;
		int FullDayHour=8;
		if (attendance == 0) {
			System.out.println("employee is absent");
		} else {
			System.out.println("employee is present");
			int DailyWage=FullDayHour*WageperHour;
			System.out.println("Daily employee wage is:: "+DailyWage);
		}

	}

}
