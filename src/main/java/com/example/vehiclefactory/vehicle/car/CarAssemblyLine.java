package com.example.vehiclefactory.vehicle.car;

import com.example.vehiclefactory.factory.AssemblyLine;
import com.example.vehiclefactory.vehicle.parts.*;

public class CarAssemblyLine implements AssemblyLine {

    public Car build() {

        Body carBody = new CarBody("Black", 2, true);

        Chassis carChassis = new CarChassis("Front", "Shock Absorbers");

        Engine carEngine = new CarEngine(100, "Diesel", "Automatic", 6);

        ExtraFeatures carExtraFeatures = new CarExtraFeatures(true, "Neon", true,
                true);

        Wheel[] carWheel = {new CarWheel(34, "Black", 33, "Symmetric"),
                new CarWheel(34, "Black", 33, "Symmetric"),
                new CarWheel(34, "Black", 33, "Symmetric"),
                new CarWheel(34, "Black", 33, "Symmetric")};


        return new Car("Blue", "Audi", 3.0, 155, carBody, carChassis, carEngine,
                carExtraFeatures, carWheel);
    }
}
