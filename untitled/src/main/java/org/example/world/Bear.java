package org.example.world;

import java.util.Objects;

public class Bear extends Mammal implements Status{
    private String kind; //вид медведей

    public Bear(boolean predator, String kind) {
        super("Суша", predator, "Медвежьи", "Медведи", true);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bear bear = (Bear) o;

        return Objects.equals(kind, bear.kind);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Вид медведя: " + getKind();
    }

    @Override
    public void sleep() {
        System.out.println(getKind() + " спит!");
    }

    @Override
    public void move() {
        System.out.println(getKind() + " идёт!");
    }

    @Override
    public void eats() {
        System.out.println(getKind() + " ест!");
    }
}
