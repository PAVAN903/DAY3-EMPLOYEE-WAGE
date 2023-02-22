package com.bridgelab;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		Random ran = new Random();
		int attendance = ran.nextInt(2);
		if (attendance == 0) {
			System.out.println("employee is absent");
		} else {
			System.out.println("employee is present");
		}

	}

}
