package org.example.world;

public class Fish extends Animal implements Status{
    private boolean freshwater; //пресноводная или нет
    private boolean scales; //чешуя есть или нет

    public Fish(boolean predator,
                String family,
                String genus,
                boolean freshwater,
                boolean scales) {
        super(true, "Вода", predator, family, genus);
        this.freshwater = freshwater;
        this.scales = scales;
    }

    public boolean isFreshwater() {
        return freshwater;
    }

    public void setFreshwater(boolean freshwater) {
        this.freshwater = freshwater;
    }

    public boolean isScales() {
        return scales;
    }

    public void setScales(boolean scales) {
        this.scales = scales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Fish fish = (Fish) o;

        if (freshwater != fish.freshwater) return false;
        return scales == fish.scales;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (freshwater ? 1 : 0);
        result = 31 * result + (scales ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Вид рыбы: " + getGenus();
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
