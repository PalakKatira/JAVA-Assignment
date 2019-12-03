package com.test.assignment_25nov;//creation of package

import java.util.Scanner;//1util class

public class HighestOfThree {//class
	int a, b, c;//member variables

	public static int highestNumber() {//static method to calculate the highest number
		System.out.println("Enter the value of a,b,c");

		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
			return a;
		} else if (b > c) {//b>a is already checked in the above condition
			System.out.println(b + " is the largest number");
			return c;
		} else {
			System.out.println(c + " is the largest number");
			return b;
		}

	}

	public static void main(String[] args) {
		highestNumber();//calling directly the method
	}

}
