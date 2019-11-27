package com.test.assignment_25nov;

import java.util.Scanner;

public class PrintingStars {//class formation
	public  void printPattern() {//instance method declaration
		int n;

		System.out.println("Enter the value of n");//printing and hence asking the user to enter the value of n

		Scanner in = new Scanner(System.in);//Taking input from the user on how many rows to print
		n = in.nextInt();

		for (int i = 0; i < n; i++) {//loop for traversing the rows
			for (int j = 0; j <= i; j++) {//loop for Printing the stars that is equivalent to the number of rows
				System.out.print(" *");
			}

			System.out.println("\n");//Jumping to the next line once the star in one row has been printed
		}
	}

	public static void main(String[] args) {
		PrintingStars star = new PrintingStars();//Invoking the instance method by creating the object of the class
		star.printPattern();//invoking by star operator
	}
}
