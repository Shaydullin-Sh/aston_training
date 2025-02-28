package org.example.vehicles;

import java.util.Objects;

public class Helicopter extends Transport implements Status{
    private String typeHelicopter; //тип вертолёта
    private int wheels;  //кол-во колес
    private double maxHeight; //максимальная высота

    public Helicopter(String brand,
                      String color,
                      String energySource,
                      String typeHelicopter,
                      int wheels,
                      double maxHeight) {
        super(brand,
                color,
                true,
                true,
                true,
                true,
                "По воздуху",
                "Рычаг",
                energySource);
        this.typeHelicopter = typeHelicopter;
        this.wheels = wheels;
        this.maxHeight = maxHeight;
    }

    public String getTypeHelicopter() {
        return typeHelicopter;
    }

    public void setTypeHelicopter(String typeHelicopter) {
        this.typeHelicopter = typeHelicopter;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Helicopter that = (Helicopter) o;

        if (wheels != that.wheels) return false;
        if (Double.compare(that.maxHeight, maxHeight) != 0) return false;
        return Objects.equals(typeHelicopter, that.typeHelicopter);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = typeHelicopter != null ? typeHelicopter.hashCode() : 0;
        result = 31 * result + wheels;
        temp = Double.doubleToLongBits(maxHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "typeHelicopter='" + typeHelicopter + '\'' +
                ", wheels=" + wheels +
                ", maxHeight=" + maxHeight +
                '}';
    }

    @Override
    public void worth() {
        System.out.println(getBrand() + " стоит!");
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " летит!");
    }
}
