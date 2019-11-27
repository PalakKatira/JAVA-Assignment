package com.test.assignment_25nov;

import java.util.Scanner;

public class ElectricityBill {
	int units;
	double amount;

	public void electricityBillCalculation() {

		System.out.println("Enter the amount of units consumed");

		Scanner bill = new Scanner(System.in);
		units = bill.nextInt();

		if (units > 0 && units <= 200) {
			System.out.println("Amount to be paid:" + ((100 * 5) + ((units - 100) * 20)));
		}
		if (units > 200 && units <= 300) {
			System.out.println("Amount to be paid:" + ((100 * 5) + ((100) * 10) + ((units - 200) * 20)));
		}

		if (units > 300 && units <= 400) {
			System.out.println("Amount to be paid:" + ((100 * 5) + ((200) * 10) + (units - 300) * 20));
		}
	}

	public static void main(String[] args) {
		ElectricityBill el = new ElectricityBill();
		el.electricityBillCalculation();
	}
}
