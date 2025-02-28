package org.example.vehicles;

public class Taxi extends Transport implements Status{
    private int wheels;  //кол-во колес
    private int doors; //кол-во дверей
    private double maxSpeed; //максимальная скорость

    public Taxi(String brand,
                String color,
                String energySource,
                int wheels,
                int doors,
                double maxSpeed) {
        super(brand,
                color,
                true,
                false,
                false,
                false,
                "По земле",
                "Руль",
                energySource);
        this.wheels = wheels;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taxi taxi = (Taxi) o;

        if (wheels != taxi.wheels) return false;
        if (doors != taxi.doors) return false;
        return Double.compare(taxi.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = wheels;
        result = 31 * result + doors;
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", maxSpeed=" + maxSpeed +
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
