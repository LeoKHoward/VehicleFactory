package com.example.vehiclefactory.vehicle.parts;

public abstract class Wheel {

    public int pressure;
    public String colour;
    public int diameter;
    public String tread;


    public Wheel(int pressure, String colour, int diameter, String tread) {
        this.pressure = pressure;
        this.colour = colour;
        this.diameter = diameter;
        this.tread = tread;
    }

}
