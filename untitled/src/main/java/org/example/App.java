package org.example;

import org.example.vehicles.*;
import org.example.world.Bear;
import org.example.world.Cat;
import org.example.world.Fish;
import org.example.world.Whale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Fish fish = new Fish(true, "Карповые", "Сазан", true, true);
        Cat cat = new Cat("Барсик", 2, false, "Сфинкс");
        Bear bear = new Bear(true, "Белый медведь");
        Whale whale = new Whale(true, "Косатка");
        Boat boat = new Boat("Гольф-Стрим",
                "белый",
                "дизельное топливо",
                "Рыболовный катер",
                40.75,
                600.00);
        Airplane airplane = new Airplane("Айробус",
                "Синий",
                "Керосин авиационный",
                "Пассажирский",
                11000.00);
        Helicopter helicopter = new Helicopter("МИ-8",
                "Зелёный",
                "Керосин авиационный",
                "Многоцелевой",
                3,
                7000.00);
        Taxi taxi = new Taxi("Бугатти",
                "Жёлтый",
                "Бензин",
                4,
                2,
                400.00);
        Tanker tanker = new Tanker("SHI",
                "Красный",
                "ядерное топливо",
                "Нефтяной танкер",
                40,
                15000.00);

        Truck truck = new Truck("Вольво",
                "Синий",
                4,
                2,
                120,
                4000.00);
        System.out.println(fish.getGenus());
        fish.move();
        fish.eats();
        fish.sleep();
        System.out.println("********************");
        System.out.println(cat.getName());
        System.out.println("порода " + cat.getName() + "a: " + cat.getBreed());
        cat.sleep();
        cat.move();
        cat.eats();
        System.out.println("********************");
        System.out.println(bear.getKind());
        bear.eats();
        bear.move();
        bear.sleep();
        System.out.println("********************");
        System.out.println(whale.getGenus());
        whale.eats();
        whale.move();
        whale.sleep();
        System.out.println("********************");

        boat.move();
        System.out.println("**************************");
        helicopter.move();
        System.out.println("**************************");
        tanker.worth();
        System.out.println("**************************");
        taxi.move();
        System.out.println("**************************");
        airplane.move();

    }
}
