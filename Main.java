package com.test.assignment_22nov; 

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
   
   //To print whether a number is even or odd.
   
int num;
System.out.println("Enter the number");

Scanner s=new Scanner(System.in);
num=s.nextInt();

if(num%2==0)
{
   System.out.println("Num is an even number");
}
else{
   System.out.println("Num is an odd number");
}

//To print a fibonacci series.

int n1=0,n2=1,n3,i,count;

System.out.println("Enter the number of digits to be printed");

Scanner s1=new Scanner(System.in);
count=s1.nextInt();

System.out.print(n1+" "+n2);

   for(i=2;i<count;i++)
{
   n3=n1+n2;
   System.out.print(" "+n3);
   n1=n2;
   n2=n3;
}

//To write table of any number.

int n,a,count1=10;

System.out.println("\nEnter the number whose table needs to printed");

Scanner table=new Scanner(System.in);
n=table.nextInt();

for(a=1;a<=count1;a++)
{
   System.out.println(n+"*"+a+"="+(n*a));
}

//To calculate electricity bill.

int units;
double amount;

System.out.println("Enter the amount of units consumed");

Scanner bill=new Scanner(System.in);
units=bill.nextInt();


if(units>0 &&  units<=100)
{
   System.out.println("Amount to be paid:"+(units*5));
}
if(units>100 &&  units<=200)
{
   System.out.println("Amount to be paid:"+((100*5)+((units-100)*7)));
}
if(units>200 &&  units<=300)
{
   System.out.println("Amount to be paid:"+((100*5)+(100*7)+((units-200)*9)));
}

}
}
