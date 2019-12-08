package com.palak.reverse;

public class ReversingString {
	public static void main(String[] args) {

		String str = "I love My Country";
		String[] s=str.split(" ");
		int n = s.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(" "+s[i]);
			
		}
	}
}
