package org.example.vehicles;

public abstract class Transport {
    private String brand; //марка
    private String color; //цвет
    private boolean hasWheels;    //имеет колёса?
    private boolean hasPropeller; //имеет винт?
    private boolean hasWings;     //имеет крылья?
    private boolean carriesCargo; //возит груз?
    private String methodOfTransportation; //способ передвижения
    private String controlDevice; //устройство управления
    private String energySource; //источник энергии

    public Transport(String brand,
                     String color,
                     boolean hasWheels,
                     boolean hasPropeller,
                     boolean hasWings,
                     boolean carriesCargo,
                     String methodOfTransportation,
                     String controlDevice,
                     String energySource) {
        this.brand = brand;
        this.color = color;
        this.hasWheels = hasWheels;
        this.hasPropeller = hasPropeller;
        this.hasWings = hasWings;
        this.carriesCargo = carriesCargo;
        this.methodOfTransportation = methodOfTransportation;
        this.controlDevice = controlDevice;
        this.energySource = energySource;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isHasPropeller() {
        return hasPropeller;
    }

    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean isCarriesCargo() {
        return carriesCargo;
    }

    public void setCarriesCargo(boolean carriesCargo) {
        this.carriesCargo = carriesCargo;
    }

    public String getMethodOfTransportation() {
        return methodOfTransportation;
    }

    public void setMethodOfTransportation(String methodOfTransportation) {
        this.methodOfTransportation = methodOfTransportation;
    }

    public String getControlDevice() {
        return controlDevice;
    }

    public void setControlDevice(String controlDevice) {
        this.controlDevice = controlDevice;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }
}
