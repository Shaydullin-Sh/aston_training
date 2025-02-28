package org.example.vehicles;

import java.util.Objects;

public class Boat extends Transport implements Status {
    private String typeBoat; //тип катера
    private double maxSpeed; //максимальная скорость
    private double loadCapacity; //максимально допустимый груз

    public Boat(String brand,
                String color,
                String energySource,
                String typeBoat,
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
        this.typeBoat = typeBoat;
        this.maxSpeed = maxSpeed;
        this.loadCapacity = loadCapacity;
    }

    public String getTypeBoat() {
        return typeBoat;
    }

    public void setTypeBoat(String typeBoat) {
        this.typeBoat = typeBoat;
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

        Boat boat = (Boat) o;

        if (Double.compare(boat.maxSpeed, maxSpeed) != 0) return false;
        if (Double.compare(boat.loadCapacity, loadCapacity) != 0) return false;
        return Objects.equals(typeBoat, boat.typeBoat);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = typeBoat != null ? typeBoat.hashCode() : 0;
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(loadCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "typeBoat='" + typeBoat + '\'' +
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
