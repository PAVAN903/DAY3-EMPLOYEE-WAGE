package com.bridgelab;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		Random ran = new Random();
		int attendance = ran.nextInt(2 + 1);
		int WageperHour = 20;
		int FullDayHour = 8;
		int PartTimeHour = 4;
		int empHr = 0;
		int TotalWorkingDay = 20;
		int TotalWorkingHour=100;
		if (attendance == 0) {

			System.out.println("employee is absent");
		} else if (attendance == 1) {
			System.out.println("employee is present but part time");
			int PartTimeWage = PartTimeHour * WageperHour;
			System.out.println("Employee part time wage is:: " + PartTimeWage);
		} else {
			System.out.println("employee is present");
			int DailyWage = FullDayHour * WageperHour;
			System.out.println("Daily employee wage is:: " + DailyWage);
            int wageMonth = DailyWage * TotalWorkingDay;
			System.out.println("Wage for month is::: " + wageMonth);
			int TotalWageMonth=TotalWorkingHour*DailyWage;
			System.out.println("Totalwage for month of 100 working hours  "+TotalWageMonth);

		}
		switch (attendance) {
		case 1:
			empHr = 4;
			System.out.println("employee is present but part time");
			break;
		case 2:
			empHr = 8;
			System.out.println("employee is present ");
			break;
		default:
			empHr = 0;
			System.out.println("employee is absent");

		}
		
	
	}

}
