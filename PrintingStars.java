/*creating packages(lettes to be in lower case)
This is done for logical grouping*/

package com.test.assignment_25nov;

import java.util.Scanner;//importing util class to invoke Scanner 

public class PrintingStars {//class formation in pascal casing
	public void printPattern() {//instance method declaration
		int n;

		System.out.println("Enter the value of n that is number of rows to printed");//printing and hence asking the user to enter the value of n

		Scanner in = new Scanner(System.in);//Taking input from the user on how many rows to print
		n = in.nextInt();

		for (int i = 0; i < n; i++) {//loop for traversing the rows
			for (int j = 0; j <= i; j++) {//loop for Printing the stars that is equivalent to the number of rows
				System.out.print(" *");
			}

			System.out.println("\n");//Jumping to the next line once the star in one row has been printed
		}
	}

	public static void main(String[] args) {//main method to invoke methods- always static
		PrintingStars star = new PrintingStars();//Invoking the instance method by creating the object of the class
		star.printPattern();//invoking by star object and dot operator
	}
}
