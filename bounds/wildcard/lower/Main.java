package bounds.wildcard.lower;

import java.util.*;
import java.io.*;
import javax.swing.text.ChangedCharSetException;

public class Main <U> {
    U reference;
    
    public Main(List<?> u){
    //    reference = u; // Can't convert from wildcard to Type U
        for(Object o:u)System.out.println(o);
    }
    
    public static void main(String[] args) {
        // testestetest
        List<? super IOException> list = new ArrayList<Object>(); // This means the list can be of IOException, Exception, or Object
        // list.add(new Exception()); // Fails if List is of IOException, so compile error
        list.add(new IOException()); // The object of the lower bounded class works
        list.add(new FileNotFoundException()); // All subclass of the lower bounded class works
        list.add(new ChangedCharSetException("aaa", false)); // All subclass of the lower bounded class works
        // list.add(new Object()); // Fails if List is of IOException or Exception, so compile error
        
        
    }
    
    public static <X> void mixTypeAndWildcard(List<X> list) {
        // referencing the type generic is okay. 
    }
    
    // public static <X> void mixTypeAndWildcard2(List<X extends Main> list) {
        // Mixing type and wildcard is NOT. 
    // }
}
