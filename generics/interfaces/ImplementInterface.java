package generics.interfaces;

import generics.classes.Robot;

public class ImplementInterface implements Shippable<Robot>{
    public void ship(Robot t) {
        t.printNoise();
    }
}


// class ImeplementMoreInterface implements ShippableMore<Robot>{ // This throws a compiler error for wrong number of arguments

class ImeplementMoreInterface implements ShippableMore<Robot, Integer>{

    // public void setContent(Integer t) {} // It knows the order of classes provided, and will get compiler error when wrong
    @Override
    public void setContent(Robot z) { // Can name the param anything
    }

    @Override
    public void setTitle(Integer r) { // Can name the param to anything
    }

    @Override
    // public void combineContentAndTitle(Robot t) { // knows when wrong number of parameters
    public void combineContentAndTitle(Robot t, Integer p) { // Can set param name to anything
    } 
}