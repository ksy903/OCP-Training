package bounds.wildcard.upper;

import java.util.*;

public class Main {
    public static long total(List<? extends Number> list) {
        long total = 0;
        
        for(Number number: list) total+=number.longValue();
        
        return total;
    }
    
    public static void main(String[] args) {
        List<Number> values = new ArrayList<>();
        values.add(new Integer(5));
        values.add(new Long(50000000000l));
        System.out.println(total(values));
        
        List<Flyer> flyerList = new ArrayList<>();
        flyerList.add(new Goose());
        flyerList.add(new HangGlider());
        
        List<Goose> gooseList = new ArrayList<>();
        gooseList.add(new Goose());
        gooseList.add(new Goose());
        
        List<HangGlider> HGList = new ArrayList<>();
        HGList.add(new HangGlider());
        HGList.add(new HangGlider());
        
        anyFlyer(flyerList);
        // anyFlyer(gooseList); // Subclass, but can't superclass - compiler error
        // anyFlyer(HGList); // Subclass, but can't superclass - compiler error
        
        groupOfFlyers(flyerList); // upper bound wild card allows Flyer and all subclasses
        groupOfFlyers(gooseList); // upper bound wild card allows Flyer and all subclasses
        groupOfFlyers(HGList); // upper bound wild card allows Flyer and all subclasses
        
    }
    
    private static void anyFlyer(List<Flyer> flyer) {
        System.out.println("Only <Flyer> here!");
        for(Flyer f: flyer) {
            f.fly();
        }
    }
    
    private static void groupOfFlyers(List<? extends Flyer> flyer) { // ! using extends on an Interface !
        System.out.println("Flyer and all subclasses here!");
        for(Flyer f: flyer) {
            f.fly();
        }
    }
}
