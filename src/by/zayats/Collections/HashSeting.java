package by.zayats.Collections;

import java.util.HashSet;

public class HashSeting {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>();
        Animal cat = new Animal(2,"Мурыч");
        Animal dog = new Animal(5,"Барбос");
        boolean result = animals.add(cat);
        animals.add(cat);
        System.out.println(result);


    }
}
