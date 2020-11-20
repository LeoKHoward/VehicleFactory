package com.example.vehiclefactory.vehicle;

import com.example.vehiclefactory.vehicle.parts.*;

public abstract class Vehicle {

    private Body body;
    private Chassis chassis;
    private Engine engine;
    private ExtraFeatures extraFeatures;
    private Wheel[] wheels;


    public Vehicle(Body body, Chassis chassis, Engine engine, ExtraFeatures extraFeatures, Wheel[] wheels) {
        this.body = body;
        this.chassis = chassis;
        this.engine = engine;
        this.extraFeatures = extraFeatures;
        this.wheels = wheels;


    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }


    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public ExtraFeatures getExtraFeatures() {
        return extraFeatures;
    }

    public void setExtraFeatures(ExtraFeatures extraFeatures) {
        this.extraFeatures = extraFeatures;
    }



    public void built() {
        System.out.println(this.getClass().getSimpleName() + " has been built and is ready to go!");

    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!\n");
    }

}


