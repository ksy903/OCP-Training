package pattern.immutable;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;
    private final String gender;
    
    public Animal(String species, int age, List<String> favoriteFoods, String gender) {
        this.species = species;
        this.age = age;
        if(favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required!");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
        this.gender = gender;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
    
    public static void main(String[] args) {
        List<String> ZebraFavoriteFoods = new ArrayList<String>();
        ZebraFavoriteFoods.add("Pellets");
        ZebraFavoriteFoods.add("Carrots");
        Animal zebra = new Animal("Zebra", 5, ZebraFavoriteFoods, "Male");
        Animal zebraOlder = new Animal(zebra.getSpecies(), zebra.getAge(), ZebraFavoriteFoods, "Female");
    }
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
