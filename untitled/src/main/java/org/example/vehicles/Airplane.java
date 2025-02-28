package org.example.vehicles;

import java.util.Objects;

public class Airplane extends Transport implements Status{
    private String typeAirplane; //тип самолёта
    private double maxFlightLength; //максимальная длина полёта

    public Airplane(String brand,
                    String color,
                    String energySource,
                    String typeAirplane,
                    double maxFlightLength) {
        super(brand,
                color,
                true,
                true,
                true,
                true,
                "По воздуху",
                "Штурвал",
                energySource);
        this.typeAirplane = typeAirplane;
        this.maxFlightLength = maxFlightLength;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public double getMaxFlightLength() {
        return maxFlightLength;
    }

    public void setMaxFlightLength(double maxFlightLength) {
        this.maxFlightLength = maxFlightLength;
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
