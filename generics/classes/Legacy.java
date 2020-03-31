package generics.classes;

import java.util.*;

public class Legacy {
    public static void main(String[] args) {
        List<Elephant> elephants = new ArrayList<>();
        addToList(elephants);
        Elephant t = elephants.get(0);
        
        List list = new ArrayList();
        list.add(5); // Autoboxes to Integer
        // int get = list.get(0); // With Raw types, its assumed Object, Object can't autobox to int - compiler error
        
        List<String> list1 = new ArrayList<>();
        // List<Object> list2 = list1;
        
        
    }
    
    static void addToList(List list) {
        list.add(new Robot());
    }
}
