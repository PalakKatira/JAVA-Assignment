package com.test.assignment_26nov;

import java.io.BufferedReader;
import java.io.InputStreamReader;;

public class Fibonacci {
	static int n1, n2, n3, n4, n5;

	public static void printFibonacciSeries(int p) {
		n1 = 0;
		n2 = 1;
		n3 = 1;
		n4 = 2;
		System.out.println("Fibonacci Series");
		System.out.print(n1 + " " + n2 + " " + n3 + " " + n4);

		for (int i = 4; i < p; i++) {
			n5 = n1 + n2 + n3 + n4;
			System.out.print(" " + n5);
			n1 = n2;
			n2 = n3;
			n3 = n4;
			n4 = n5;
		}

	}

	public static void main(String[] args) throws Exception {
		int n;
		System.out.println("Enter the value of n");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());//chances of exception throw
		 
		printFibonacciSeries(n);//invoking static method
	}

}
