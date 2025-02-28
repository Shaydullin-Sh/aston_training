package org.example.world;

import java.util.Objects;

public abstract class Mammal extends Animal{
    private String name;  //имя животного
    private int age;  //возраст животного
    private boolean wool; //шерсть есть/нет

    //конструктор для животных с именем и возрастом
    public Mammal(String livingEnvironment,
                  boolean predator,
                  String family,
                  String genus,
                  String name,
                  int age,
                  boolean wool) {
        super(true, livingEnvironment, predator, family, genus);
        this.name = name;
        this.age = age;
        this.wool = wool;
    }
    //конструктор для животных без имени и возраста
    public Mammal(String livingEnvironment,
                  boolean predator,
                  String family,
                  String genus,
                  boolean wool) {
        super(true, livingEnvironment, predator, family, genus);
        this.wool = wool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Mammal mammal = (Mammal) o;

        if (age != mammal.age) return false;
        if (wool != mammal.wool) return false;
        return Objects.equals(name, mammal.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (wool ? 1 : 0);
        return result;
    }
}
