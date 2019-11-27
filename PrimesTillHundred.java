package com.test.assignment_25nov;

import java.util.Scanner;

public class PrimesTillHundred {
	int p;

	public void printingPrimes() {
		System.out.println("Enter the value of p");
		Scanner primes = new Scanner(System.in);
		p = primes.nextInt();

		for (int i = 2; i < p; i++) {
			boolean flag=false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (flag==false) {
				System.out.print(" " + i);
			}
		}
	}

	public static void main(String[] args) {
		PrimesTillHundred pr = new PrimesTillHundred();
		pr.printingPrimes();
	}
}