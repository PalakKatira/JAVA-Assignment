package pattern;//creating package

import java.util.Scanner;//importing util class 

public class NumberPrinting {//class
	int r;
	 
	public static void main(String[] args) {//main method
	 
		System.out.println("Enter the value of rows to be printed(odd values only)");
		
		Scanner sc=new Scanner(System.in);//taking input from the user
		int r=sc.nextInt();
		
		int mid=(r+1)/2;//calculating the mid value
		
		for(int i=1;i<=mid;i++) {//printing the number of rows till middle row
			for(int j=1;j<=(mid-i);j++) {//printing the spaces
				System.out.println(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {//printing the stars
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=(mid-1);i++){//prints rows
			for(int j=1;j<=i;j++) {//prints spaces
				System.out.println(" ");
			}
			for(int k=1;k<=(2*(mid-i)-1);k++) {//prints star
				System.out.print(mid-i);
			}
		}
	}

}
