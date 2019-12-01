package com.assignment_28;

import java.util.Scanner;

public class ReversingString {

	public static void main(String args[]) {
		
		ReversingString rs = new ReversingString();
		rs.reversingString();

	}

	public void reversingString() {
		System.out.println("Enter the string");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The reverse of the input string is: "+reverse);
	}
}
