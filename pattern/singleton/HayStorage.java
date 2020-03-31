package pattern.singleton;

public class HayStorage {
    private int quantity = 0;
    private HayStorage() {}
    
    private static final HayStorage instance = new HayStorage();
    
    
    public static HayStorage getInstance() {
        return instance;
    }
    
    public synchronized void addHay(int amountToAdd) {
        System.out.println("CurrentHay: " + quantity + " | Adding: " + amountToAdd);
        quantity += amountToAdd;
    }
    
    public synchronized boolean removeHay(int amountToRemove) {
        System.out.println("CurrentHay: " + quantity + " | Removing: " + amountToRemove);
        if(amountToRemove > quantity) return false;
        else quantity -= amountToRemove;
        return true;
    }
    
    public synchronized int getHayQuantity() {
        return quantity;
    }
}
