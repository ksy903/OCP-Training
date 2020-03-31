package bounds.wildcard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("test");
        
        printList(keywords);
        
        List<?> items = new ArrayList<>(); // List of Wildcards are IMMUTABLE, cannot add
        // items.add(new Integer(4)); // Compiler Error
        // items.add(new Main()); // Compiler Error
        
        List<Object> items2 = new ArrayList<>();
        items2.add("TEST");
        items2.add(4);
        
        List<?> items3 = items2; // Can assign but can't change, now immutable.
        // items3.add(new Main()); // Compiler Error
        
        
    }
    
    public static void printList(List<?> list) {
        for(Object x:list) System.out.println(x);
    }
}
