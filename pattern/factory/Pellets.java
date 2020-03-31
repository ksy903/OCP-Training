package pattern.factory;

public class Pellets extends Food {

    public Pellets(int quantity) {
        super(quantity);
    }
    
    @Override
    public void consumed() {
        // TODO Auto-generated method stub
        System.out.println("Pellets eaten: " + getQuantity());
    }

}
