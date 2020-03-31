package main;

import java.util.function.Predicate;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main {
    int t = 4;
    
    public static void main(String[] args) {
        System.out.println(new Main());
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
    
    private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal)) {
            System.out.println(animal);
        }
    }
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species=speciesName;
        canHop=hopper;
        canSwim=swimmer;
    }
    
    public boolean canHop() {System.out.println("Can HOP CALLED");return canHop;}
    public boolean canSwim() {return canSwim;}
    public String toString() {return species;}
}