package generics.classes;

public class UnusedGenericClass <T>{
    // Don't have to use the generic
    public void doSomething() {
        
    }
    
    public static void main(String[] args) {
        UnusedGenericClass c = new UnusedGenericClass(); //Don't have to use the generic.
        UnusedGenericClass<Integer> d = new UnusedGenericClass<>();
        d.doSomething(); // Can just ignore generics
        UnusedGenericClass<Integer> e = new UnusedGenericClass(); // Don't have to assign it an object with a generic defined.
    }
}
