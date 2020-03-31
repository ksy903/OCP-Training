package generics.classes;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Zebra zebra = new Zebra();
        Robot robot = new Robot();
        
        Crate<Elephant> crateforElephant = new Crate<>();
        crateforElephant.packCrate(elephant);
        
        Elephant newElephant = crateforElephant.emptyCrate();
        
        // crateforElephant.packCrate(Zebra); // Gets a compiler error!
        
        Crate<Zebra> zebraCrates = new Crate<>();
        zebraCrates.packCrate(zebra);
        Zebra newZebra = zebraCrates.emptyCrate();
        
        Crate<Animal> animalCrates = new Crate<>();
        animalCrates.packCrate(zebra);      // Ok, since Zebra extend Animal
        animalCrates.packCrate(elephant);   // Ok, since Elephant extend Animal
        // animalCrates.packCrate(robot);  // Gets a compiler error!
        
        // SizeLimitedCrate<Elephant> elephantSizeLimitedCrate; // Wrong number of arguments gets a compiler error!
        SizeLimitedCrate<Elephant, Integer> elephantSizeLimitedCrate = new SizeLimitedCrate<>(elephant, new Integer(15_000)); // Accepts whatever is defined as the constructor
        
        
        Z zObj = new Z();                                   // Z is now assumed to be the generic type, not the class - compiler error
        ClassWithGenericZ<Z> z = new ClassWithGenericZ<>(); // Z is again assumed to be the generic type, can't pass generic to a generic - compiler error
        
        generics.classes.Z zObjs = new generics.classes.Z();                    // referencing via the classpath removes the confusion
        ClassWithGenericZ<generics.classes.Z> zs = new ClassWithGenericZ<>();   // 
        zs.doSomething(zObjs);
    }
}
