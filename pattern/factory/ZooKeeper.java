package pattern.factory;

import java.util.Arrays;

public class ZooKeeper {
    public static void main(String[] reader) {
        if(reader.length > 0) {
            String input = reader[0]; 
            try {
                final Food food = FoodFactory.getFood(input);
                food.consumed();
            }
            catch(UnsupportedOperationException e) {
                System.out.println(e);
                System.out.println("The entered animal: " + input + " does NOT exist in this zoo, please try again");
                FoodFactory.printAvailableAnimals();
            }
        }
    }
}
