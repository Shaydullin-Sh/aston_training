package org.example.world;

public class Whale extends Mammal implements Status{
    public Whale(boolean predator,
                 String genus) {
        super("Вода", predator, "Китообразные", genus, false);
    }

    @Override
    public String toString() { //указал вид кита
        return "Вид кита: " + getGenus();
    }

    @Override
    public void sleep() {
        System.out.println(getGenus() + " спит!");
    }

    @Override
    public void move() {
        System.out.println(getGenus() + " плывёт!");
    }

    @Override
    public void eats() {
        System.out.println(getGenus() + " ест!");
    }
}
