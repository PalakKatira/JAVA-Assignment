package com.test.assignment_25nov;

import java.util.Scanner;

public class HighestOfThree {
	int a, b, c;

	public static int highestNumber() {
		System.out.println("Enter the value of a,b,c");

		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
			return a;
		} else if (b > c) {
			System.out.println(b + " is the largest number");
			return c;
		} else {
			System.out.println(c + " is the largest number");
			return b;
		}

	}

	public static void main(String[] args) {
		highestNumber();
	}

}
