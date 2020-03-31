package pattern.singleton;

public class LlamaTrainer {
    private static int LlamaFoodIntakeAmount = 5;
    
    // HayStorage hayS = new HayStorage();
    
    public static void main(String[] args) {
        LlamaTrainer.feedLlamas(25);
    }
    
    public static boolean feedLlamas(int numberOfLlamas) {
        int amountNeeded = LlamaFoodIntakeAmount * numberOfLlamas;
        HayStorage hayStorage = HayStorage.getInstance();
        while(hayStorage.getHayQuantity() < amountNeeded) {
            System.out.println("Not enough hay for the llamas! Ordering more");
            hayStorage.addHay(100);
        }
        return hayStorage.removeHay(amountNeeded);
    }
    
    
}
