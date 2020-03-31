package pattern.factory;

public class Fish extends Food {

    public Fish(int quantity) {
        super(quantity);
    }
    
    @Override
    public void consumed() {
        // TODO Auto-generated method stub
        System.out.println("Fishes eaten: " + getQuantity());
    }

}
