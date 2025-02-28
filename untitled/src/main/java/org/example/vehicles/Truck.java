package org.example.vehicles;

public class Truck extends Transport implements Status{
    private int wheels;  //кол-во колес
    private int doors; //кол-во дверей
    private double maxSpeed; //максимальная скорость
    private double loadCapacity; //максимально допустимый вес груза

    public Truck(String brand,
                 String color,
                 int wheels,
                 int doors,
                 double maxSpeed,
                 double loadCapacity) {
        super(brand,
                color,
                true,
                false,
                false,
                true,
                "По земле",
                "Руль",
                "Дизельное топливо");
        this.wheels = wheels;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
        this.loadCapacity = loadCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
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

        Truck truck = (Truck) o;

        if (wheels != truck.wheels) return false;
        if (doors != truck.doors) return false;
        if (Double.compare(truck.maxSpeed, maxSpeed) != 0) return false;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = wheels;
        result = 31 * result + doors;
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(loadCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheels=" + wheels +
                ", doors=" + doors +
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
        System.out.println(getBrand() + " едет!");
    }
}
