package com.string_demo1;

public class StringDemo {
	public static void main(String[] args) {
		
		//Multiple line Comment
		
		/*String s=new String();//empty string
		System.out.println("The value of entered string is:"+s.isEmpty());//isEmpty returns true since the string is empty
		
		String s1=new String("Hello!!");//Text passed to string object
		System.out.println("The value of entered string is:"+s1);
		
		char[] cArray={'H','e','l','l','o','!'};//String in the form of character array
		String s2=new String(cArray);
		System.out.println("The value of entered character array is:"+s2);
		
		String s3="Hello!";//String literal
		System.out.println("The value of string literal:"+s3);//best practice as this saves memory*/
		
		stringExample();
		stringPool();
		stringBuilderDemo();
	}
	public static void stringExample(){//method to demonstrate common operations
		/*System.out.println("Inside string:");
		String str=" Good"+ " morning  ";//concatenation of 2 strings
		System.out.println("String:"+str);*/
		
		/*System.out.println("str.length():"+str.length());//displays the length of the string.
		System.out.println("str.isEmpty():"+str.isEmpty());//returns a boolean value i.e returns true if empty or else returns false
		
		//Comparison
		System.out.println("str.equals(\"GOOD MORNING\"):"+str.equals("HELLO WORLD"));//Compare the 2 strings taking into account the lower and upper case
		System.out.println("str.equalsIgnoreCase(\"GOOD MORNING\"):"+str.equalsIgnoreCase("HELLO WORLD"));//compare the 2 strings ignoring the case in which it is written
		System.out.println("str.compareTo(\"GOOD MORNING\"):"+str.compareTo("HELLO WORLD"));//*/
		
		
		//Searching
		/*System.out.println("str.contains(\"good morning\"):"+str.contains("good morning"));
		System.out.println("str.contains(\"Good\"):"+str.contains("Good"));//current string contains the input string
		System.out.println("str.contains(\" morning\"):"+str.contains(" morning"));
		System.out.println("str.startsWith(\"good\"):"+str.startsWith("good "));
		System.out.println("str.endsWith(\"good morning\"):"+str.endsWith("rning"));
		System.out.println("str.indexOf(\"Good\"):"+str.indexOf("Good"));
		System.out.println("str.indexOf(\" \"):"+str.indexOf(" "));
		System.out.println("str.lastIndexOf(\"good morning\"):"+str.lastIndexOf("h"));//character is not present so it returns  a negative value*/
		
		//Examining individual characters
		/*System.out.println("str.charAt(4):"+str.charAt(4));// since character at 4th index is a space
		
		//Extracting substrings
		System.out.println("str.substring(5):"+str.substring(5));
		System.out.println("str.substring(5,9):"+str.substring(5,9));
		
		//Case conversions
		System.out.println("str.toUpperCase():"+str.toUpperCase());//converts the whole string into upper case
		System.out.println("str.toLowerCase():"+str.toLowerCase());//converts the whole string into lower case
		System.out.println("str.trim():"+str.trim());//removes white spaces either at the beginning of the string or at the end
		
		//replace
		System.out.println("str.replaceAll(\"o\",\"r\"):"+str.replaceAll("o","e"));
		
		//Split method
		System.out.println("str.split(\" \")");//wont be working because it leads to many strings and hence needs to be stored in different array
		String[] str1=str.split(" ");
		for(String temp:str1){//Advanced for loop
			System.out.println(temp);
		}
		
		//Static method
		System.out.println("String.valueOf(1.3):"+String.valueOf(1.3));*/
		
	}
	
	//Demo for String Pool
	static void stringPool(){
		System.out.println("Inside String Pool:");
		String s1="hello";//string literal created in the string pool
		String s2="hello";//String literal created again in the string pool
		String s3="hello".intern();//invoke an intern method i.e this is a double interning
		String s4=new String("hello");//String via new outside the string pool
		final String s5="lo";
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));
		System.out.println("s1==s4 "+(s1==s4));
		System.out.println("s1==s4.intern():"+(s1==s4.intern()));
		System.out.println("s1==\"hel\"+\"lo\":"+(s1=="hel"+"lo"));
		System.out.println("s1==\"hel\"+s5:"+(s1=="hel"+s5));
	}
	
	//Demo for String Builder which is equivalent to string buffer but builder has been given more importance
	static void stringBuilderDemo(){
		StringBuilder sb=new StringBuilder();
		sb.append("This is");
		sb.append(" Palak Katira.");
		String 	bf=sb.append(" Good Morning").append(" People!!").toString();	
		System.out.println(bf);
		System.out.println(bf.length());
		System.out.println(sb.insert(1,"thfjkhg").toString());//insertion performed using object of string Builder.
	}

}
