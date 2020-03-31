package generics.interfaces;

public class GenericClass<U> implements Shippable<U>{ //Make the class have same amount of generic as the interface implementing, and use the method's Generic on the interface method needing the generic
    public void ship(U t) { // Method in interface to implement that is generic must also have generic
        
    }
}
