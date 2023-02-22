package com.bridgelab;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		Random ran = new Random();
		int attendance = ran.nextInt(3);
		int WageperHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;
		if (attendance == 0) {
			System.out.println("employee is absent");
		}else if(attendance==1) {
			System.out.println("employee is present but part time");
			int PartTimeWage=PartTimeHour*WageperHour;
			System.out.println("Employee part time wage is:: "+PartTimeWage);
		} else {
			System.out.println("employee is present");
			int DailyWage=FullDayHour*WageperHour;
			System.out.println("Daily employee wage is:: "+DailyWage);
		}

	}

}
