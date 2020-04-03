package collections;

import java.util.*;

public class ListImplementation {
	public static void main(String[] args) {
		List <String> aryList = new ArrayList<String>(); // Best for lists, with duplicates, can be sorted, more searches than adding new elements. 
		aryList.add("SD");
		aryList.add(0, "NY");
		aryList.set(1,  "FL");
		aryList.remove("NY");
		aryList.remove(0);
		
		// Looping a List
		for(String s: aryList) { // Method 1: for loops, advanced or normal
			System.out.println(s);
		}
		
		Iterator iter = aryList.iterator(); // Method 2: Old iterator without generics
		while(iter.hasNext()) {
			String string = (String) iter.next(); // <-- MUST cast, or keep it Object
			System.out.println(string);
		}
		
		Iterator<String> iter2 = aryList.iterator(); // Method 3: Iterator with generics allows you to use without assuming Object
		while(iter2.hasNext()) {
			String string = iter2.next(); // No need to cast, it has to be a String
			System.out.println(string);
		}
	}
}
