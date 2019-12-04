package com.palak.wrapperclass_example1;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args){
	
	//primitives-int(Integer),double(Double),float(Float),char(Character)-stores values in a variable
	
	//wrapper -for storing the integer value in the object,we use wrapper classes saY Integer.
	//Also wrapper classes are used in collection and generics

	
	int i=5;//Primitive data type
	
	Integer ii=new Integer(5);//Wrapper class
	Integer jj=new Integer(i);//Boxing/wrapping-putting a primitive variable inside a object
	
	Integer k=i;//Auto boxing
	
	int j=jj.intValue();//Unboxing/Unwrapping-intValue is a method which returns the integer value
	
	int j1=jj;//Auto unboxing
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(1);
	//arr.add("palak"); throws an error because only integer onject is passed
	}

}
