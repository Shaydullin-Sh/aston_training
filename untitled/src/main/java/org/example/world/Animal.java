package org.example.world;

import java.util.Objects;

public abstract class Animal {
    private boolean spine; //позвоночник есть/нет
    private String livingEnvironment; //среда обитания

    private boolean predator; //хищник да/нет

    private String family; //семейство животного

    private String genus; //род животного

    public Animal(boolean spine,
                  String livingEnvironment,
                  boolean predator,
                  String family,
                  String genus){
        this.spine = spine;
        this.livingEnvironment = livingEnvironment;
        this.predator = predator;
        this.family = family;
        this.genus = genus;
    }

    public boolean isSpine() {
        return spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //является ли объект один и тот же или нет
        if (o == null || getClass() != o.getClass()) return false; //равен ли объект null или тип классов у объектов не одинаковый

        // далее сравнение полей

        Animal animal = (Animal) o;

        if (spine != animal.spine) return false;
        if (predator != animal.predator) return false;
        if (!Objects.equals(livingEnvironment, animal.livingEnvironment))
            return false;
        if (!Objects.equals(family, animal.family)) return false;
        return Objects.equals(genus, animal.genus);
    }

    @Override
    public int hashCode() {
        int result = (spine ? 1 : 0);
        result = 31 * result + (livingEnvironment != null ? livingEnvironment.hashCode() : 0);
        result = 31 * result + (predator ? 1 : 0);
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (genus != null ? genus.hashCode() : 0);
        return result;
    }
}

