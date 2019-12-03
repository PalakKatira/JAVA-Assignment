package com.assignment_28;//Creating package for logical grouping,letters in lower case

import java.util.Scanner;//importing util class to invoke Scanner

public class ReversingNumber {//craeting a public class
	public static void main(String args[]) {//main method to invoke method by craeting the object of the class

		ReversingNumber rn=new ReversingNumber();//object creation
		rn.reversingNumber();//invoking method by dot operator
		
	}

	public void reversingNumber() {//instance method
		
	int Reminder,Rev=0;
	System.out.println("Enter the number to be reversed");//print purpose
	
	Scanner sc=new Scanner(System.in);//taking input from the user
	int num=sc.nextInt();
	
	while(num>0) {//the loop will run till the time the number entered is greater then 0
	/**last number is obtained by dividing by 10 */	
	 Reminder=num%10;
	 Rev=Rev*10+Reminder;
	 num=num/10;
	 
	}
	
	System.out.println("The reverse of the number is:" +Rev);//prints the reversed number
}
}
