package collections;

import java.util.*;

public class MapImplementation {
	public static void main(String[] arg) {
		// Maps use dual generic types defined
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		
		String food = map.get("koala");
		for(String key:map.keySet()) System.out.println(key + " | " + key.hashCode()); // hashCode of the key is used to determine the order. Decreasing order.
		for(String values:map.values()) System.out.println(values); // Values order follows the order of keys. Same ordered list 
		
		// System.out.println(map.contains("koala")); // Map does NOT implement Collections, and therefore does not have a "contains()" method
		System.out.println(map.containsKey("koala")); // returns true
		System.out.println(map.containsValue("koala")); // returns false
		System.out.println(map.size()); // returns the number of mappings
	}
	
	@Override
	public int hashCode() {
		return 8;
	}
}
