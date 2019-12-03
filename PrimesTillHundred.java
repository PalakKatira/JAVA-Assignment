package com.test.assignment_25nov;//creating package for logical grouping

import java.util.Scanner;//importing util class to invoke scanner

public class PrimesTillHundred {//declaration of class
	int p;

	public void printingPrimes() {//instance method
		System.out.println("Enter the value of p");
		
		Scanner primes = new Scanner(System.in);//taking input from the user
		p = primes.nextInt();

		for (int i = 2; i < p; i++) {//loop that runs from 2 to 100 since prime number starts from 2
			boolean flag=false;//initialising flag to false  
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;//for non prime numbers returns a true value
					break;//break statement leads to jumping out of the loop
				}
			}

			if (flag==false) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {//main method for invoking method
		PrimesTillHundred pr = new PrimesTillHundred();
		pr.printingPrimes();
	}
}
