package generics.interfaces;

public class ImplementRawType implements Shippable{ // Ignore the generic
    public void ship(Object t) {    // Just use an Object to catch all possible objects.
        // do something
    }
}
