package com.assignment_28;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String args[]) {

		ReversingNumber rn=new ReversingNumber();
		rn.reversingNumber();
		
	}

	public void reversingNumber() {
		
	int Reminder,Rev=0;
	System.out.println("Enter the number to be reversed");
	
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	while(num>0) {
		
	 Reminder=num%10;
	 Rev=Rev*10+Reminder;
	 num=num/10;
	 
	}
	
	System.out.println("The reverse of the number is:" +Rev);
}
}
