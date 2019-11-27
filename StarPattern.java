package pattern;

import java.util.Scanner;

public class StarPattern {
	int r;
	 
	public static void main(String[] args) {
	 
		System.out.println("Enter the value of rows to be printed(odd values only)");
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		
		int mid=(r+1)/2;
		
		for(int i=1;i<=mid;i++) {
			for(int j=1;j<=(mid-i);j++) {
				System.out.println(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=(mid-1);i++){
			for(int j=1;j<=i;j++) {
				System.out.println(" ");
			}
			for(int k=1;k<=(2*(mid-i)-1);k++) {
				System.out.print("*");
			}
		}
	}

}
