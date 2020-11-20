package com.example.vehiclefactory.vehicle.bike;

import com.example.vehiclefactory.factory.AssemblyLine;

public class BikeAssemblyLine implements AssemblyLine {

    public Bike build() {

        BikeBody bikeBody = new BikeBody("Yellow", 1, false);

        BikeChassis bikeChassis = new BikeChassis("Bake", "Spring Loaded");

        BikeEngine bikeEngine = new BikeEngine(5000, "Petrol", "Manual", 4);

        BikeExtraFeatures bikeExtraFeatures = new BikeExtraFeatures(true, "Strobe", false,
                false);

        BikeWheel[] bikeWheel = {new BikeWheel(22, "Black", 24, "Zig Zag"),
                new BikeWheel(22, "Yellow", 24, "Zig Zag")};


        return new Bike("Black", "Suzuki", 1.0, 180,
                bikeBody, bikeChassis, bikeEngine, bikeExtraFeatures, bikeWheel);
    }
}
