package pattern.factory;

public class Hay extends Food {

    public Hay(int quantity) {
        super(quantity);
    }
    
    @Override
    public void consumed() {
        // TODO Auto-generated method stub
        System.out.println("Hay eaten: " + getQuantity());
    }

}
