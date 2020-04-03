package collections;

import java.util.*;

public class SetImplementation { // Sets are for when duplicates are not allowed.
	public static void main(String [] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);	// returns if able to be added - true
		boolean b2 = set.add(10);	// returns if able to be added - true
		boolean b3 = set.add(66);	// returns if able to be added - false - is a duplicate
		boolean b4 = set.add(8);	// returns if able to be added - true
		
		for(Integer i:set)System.out.println(i);
		
		System.out.println("-----------------------");
		
		Set<Integer> set2 = new TreeSet<>(); // Same as HashSet, no dups, but will be ordered according to comparator based on implmenting Comparable interface.
		boolean b5 = set2.add(66);	// returns if able to be added - true
		boolean b6 = set2.add(10);	// returns if able to be added - true
		boolean b7 = set2.add(66);	// returns if able to be added - false - is a duplicate
		boolean b8 = set2.add(8);	// returns if able to be added - true
		
		for(Integer i:set2)System.out.println(i);
		
		System.out.println("-----------------------");
		
		// Key Set related methods.
		NavigableSet<Integer> set3 = new TreeSet<>(); // Use NavigableSet to see the methods. 
		
		for(int i=1;i<20;i++) {
			set3.add(i);
		}
		
		// 1. lower(E e) = gets the object 1 less than the given parameter object based on Comparator. returns object or null if none found
		System.out.println(set3.lower(6)); // returns 5
		
		// 2. floor(E e) = gets the object 1 less than or EQUAL to the given parameter object based on Comparator. returns object or null if none found
		System.out.println(set3.floor(8)); // returns 8
				
		// 3. ceiling(E e) = gets the object 1 greater than or EQUAL to the given parameter object based on Comparator. returns object or null if none found
		System.out.println(set3.ceiling(19)); // returns 19
		
		// 4. higher(E e) = gets the object 1 greater than the given parameter object based on Comparator. returns object or null if none found
		System.out.println(set3.higher(19)); // returns null
	}
}
