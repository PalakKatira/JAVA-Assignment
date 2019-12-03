package com.accessmodifier.oop.p1;

public class C1 extends A1 {
	public static void main(String args[]) {
		
		System.out.println("Private Member:"+privateMember);//private members cannot be inherited from the superclases within the same package also 
		System.out.println("Default Member:"+defaultMember);
		System.out.println("Public Member:"+publicMember);
		System.out.println("Protected Member:"+protectedMember);
		
	}

}
