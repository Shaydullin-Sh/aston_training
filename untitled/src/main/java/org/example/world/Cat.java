package org.example.world;

import java.util.Objects;

public class Cat extends Mammal implements Status{
    private String breed; //порода кошки

    public Cat(String name,
               int age,
               boolean wool,
               String breed) {
        super("Суша", true, "Кошачьи", "Кошки", name, age, wool);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Имя кота: " + getName() + ", " + "Порода кота: " + getBreed();
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " идёт!");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " ест!");;
    }
}
