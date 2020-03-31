package pattern.builder;

import pattern.immutable.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalBuilder {
    private String species, gender;
    private int age;
    private List<String> favoriteFoods;
    
    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    
    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }
    
    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }
    
    public AnimalBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }
    
    public Animal build() {
        if(favoriteFoods == null)
            throw new RuntimeException("favoriteFoods is required!");
        
        if(gender == null)
            gender = "Female";

        return new Animal(species, age, favoriteFoods, gender);
    }
    
    public static void main(String[] args) {
        List<String> ZebraFavoriteFoods = new ArrayList<String>();
        ZebraFavoriteFoods.add("Pellets");
        ZebraFavoriteFoods.add("Carrots");
        Animal zebra = new AnimalBuilder().setAge(5).setFavoriteFoods(ZebraFavoriteFoods).setSpecies("zebra").build();
        //Animal zebra2 = new AnimalBuilder().setAge(5).build();
        Animal zebra3 = new AnimalBuilder().setFavoriteFoods(ZebraFavoriteFoods).setSpecies("zebra").build();
        
        System.out.println(zebra);
        //System.out.println(zebra2);
        System.out.println(zebra3);
        
    }
}
