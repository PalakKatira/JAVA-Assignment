package com.palak.collections;

import java.util.*;

public class ListDemo {
	
	/**
	 * Collection operations
	 */

	private static void arrayList() {
		//
		// Collection<Integer> list1 = new ArrayList<>();
		// // Adding elements to ArrayList since it can store duplicates as well
		// as
		// // null
		// list1.add(1);
		// list1.add(2);
		// list1.add(3);
		// list1.add(3);
		// list1.add(null);
		// System.out.println(list1);
		// list1.remove(3);
		// System.out.println(list1);
		// list1.remove(3);
		// System.out.println(list1);
		// }
		
		/**
		 * List Operations
		 */

		List<Integer> list1 = new ArrayList<>();
		// Adding elements to ArrayList since it can store duplicates as well as
		// null
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		System.out.println(list1);

		list1.remove(3);
		System.out.println(list1);
		list1.remove(3);
		System.out.println(list1);

		// Position specific methods
		list1.add(0, 10);//adding 10 at zeroth position
		System.out.println(list1);
		
		list1.set(0,9);//set method replaces previous zeroth element with new zeroth element
		System.out.println(list1);
		
		
		/**
		 * Creating new list
		 */
		//Bulk operations
		
		Collection<Integer> list2=new ArrayList<>();
		list2.add(9);
		list2.add(3);
		
		list1.removeAll(list2);//removes list2 elements from list 1
		System.out.println(list1);
		
		list2.add(1);
		
		list1.retainAll(list2);//output is the only elements present in list2.
		System.out.println(list1);
		
		list1.addAll(list2);//output is elements of both the list
		System.out.println(list1);
		
	}
	
	

	public static void main(String[] args) {
		arrayList();
	}
}
