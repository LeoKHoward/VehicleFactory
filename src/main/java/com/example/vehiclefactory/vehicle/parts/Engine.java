package com.example.vehiclefactory.vehicle.parts;

public abstract class Engine {

    private int mileage;
    private String fuelType;
    private String transmissionType;
    private int cylinders;


    public Engine(int mileage, String fuelType, String transmissionType, int cylinders) {
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.cylinders = cylinders;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }


    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


}
