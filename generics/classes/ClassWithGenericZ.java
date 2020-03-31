package generics.classes;

public class ClassWithGenericZ <Z>{
    public void doSomething(Z z) {
        System.out.println(z);
    }
    
    public static void main(String[] args) {
        // Z zObj = new Z();                                   // Z is now assumed to be the generic type, not the class - compiler error
        // ClassWithGenericZ<Z> z = new ClassWithGenericZ<>(); // Z is again assumed to be the generic type, can't pass generic to a generic - compiler error
        
        generics.classes.Z zObjs = new generics.classes.Z();                    // referencing via the classpath removes the confusion
        ClassWithGenericZ<generics.classes.Z> zs = new ClassWithGenericZ<>();   // 
        zs.doSomething(zObjs);
        
        // ClassWithGenericZ<int> test = new ClassWithGenericZ<>(); // compiler error
        
        int[] test = {5, 2};
        // Z[] zAry = {new Z(), new Z()}; // Cannot make reference to Z
        // boolean t = new Z() instanceof Object; // Cannot make reference to Z
    }
}
