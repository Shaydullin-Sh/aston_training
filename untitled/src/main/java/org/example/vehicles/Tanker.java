package org.example.vehicles;

import java.util.Objects;

public class Tanker extends Transport implements Status{
    private String typeCargo; //тип перевозимого груза
    private double maxSpeed; //максимальная скорость
    private double loadCapacity; //максимально допустимый вес груза

    public Tanker(String brand,
                  String color,
                  String energySource,
                  String typeCargo,
                  double maxSpeed,
                  double loadCapacity) {
        super(brand,
                color,
                false,
                true,
                false,
                true,
                "По воде",
                "Штурвал",
                energySource);
        this.typeCargo = typeCargo;
        this.maxSpeed = maxSpeed;
        this.loadCapacity = loadCapacity;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public void setTypeCargo(String typeCargo) {
        this.typeCargo = typeCargo;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tanker tanker = (Tanker) o;

        if (Double.compare(tanker.maxSpeed, maxSpeed) != 0) return false;
        if (Double.compare(tanker.loadCapacity, loadCapacity) != 0) return false;
        return Objects.equals(typeCargo, tanker.typeCargo);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = typeCargo != null ? typeCargo.hashCode() : 0;
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(loadCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "typeCargo='" + typeCargo + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public void worth() {
        System.out.println(getBrand() + " стоит!");
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " плывёт!");
    }
}
