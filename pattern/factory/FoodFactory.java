package pattern.factory;

public class FoodFactory {
    public static Food getFood(String animalName) {
        switch(animalName) {
            case "zebra": return new Hay(100);
            case "rabbit": return new Pellets(5);
            case "goat": return new Pellets(30);
            case "polar bear": return new Fish(10);
        }
        throw new UnsupportedOperationException("Unexpected Animal Received!: " + animalName);
    }
    
    public static void printAvailableAnimals() {
        System.out.println("This zoo has zebra, rabbit, goat, and polar bear");
    }
}
