package com.test.assignment_25nov;

import java.util.Scanner;

public class PrimeOrNot {
	int n;

	public void primeNumber() {//instance method 
		System.out.println("Enter the value of n");
		Scanner prime = new Scanner(System.in);//selecting the value from user
		n = prime.nextInt();
		boolean flag = false;
		
		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {//condition for non prime that it should not give remainder as zero
				flag = true;
				break;//to come out of the loop 
			}
		}
		if (flag==false) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n+ " is not a prime number.");
		}
	}

	public static void main(String[] args) {
		PrimeOrNot pon = new PrimeOrNot();//invocation of method by creating an object of it
		pon.primeNumber();//calling method by dot operator
	}
}
