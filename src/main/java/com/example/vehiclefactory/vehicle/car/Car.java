package com.example.vehiclefactory.vehicle.car;

import com.example.vehiclefactory.vehicle.Vehicle;
import com.example.vehiclefactory.vehicle.parts.*;

public class Car extends Vehicle {

    private String colour;
    private String make;
    private double litre;
    private int topSpeed;


    public Car(String colour, String make, double litre, int topSpeed, Body body, Chassis chassis, Engine engine,
               ExtraFeatures extraFeatures, Wheel[] wheels) {
        super(body, chassis, engine, extraFeatures, wheels);
        this.colour = colour;
        this.make = make;
        this.litre = litre;
        this.topSpeed = topSpeed;


    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


}
