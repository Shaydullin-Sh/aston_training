package org.example.lessonCollection;


import org.example.world.*;


import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        Cat cat = new Cat("Пушок", 1, true, "Персидский кот");
        Cat cat1 = new Cat("Барсик", 2, true,"Кот с помойки");
        Fish fish = new Fish(true, "Щуковые", "Щука", true, true);
        Bear bear = new Bear(true, "Бурый медведь");
        Whale whale = new Whale(false, "Синий кит");
        Fish fish1 = new Fish(true, "Китовые акулы", "Китовая акула",false, false);

        listAnimal.add(cat);
        listAnimal.add(cat1);
        listAnimal.add(fish);
        listAnimal.add(fish1);
        listAnimal.add(bear);
        listAnimal.add(whale);

        for(Animal animal:listAnimal){
            System.out.println(animal.toString());
        }
        listAnimal.remove(0);
        listAnimal.remove(listAnimal.size() - 1);
        System.out.println("**********************************");

        List<Animal> newListAnimal = new ArrayList<>();
        newListAnimal.addAll(listAnimal);
        System.out.println("**********************************");
        for(Animal animal:newListAnimal){
            System.out.println(animal.toString());
        }
        System.out.println("**********************************");
        newListAnimal.add(newListAnimal.size() /2, cat);
        for(Animal animal:newListAnimal){
            System.out.println(animal.toString());
        }
    }
}
