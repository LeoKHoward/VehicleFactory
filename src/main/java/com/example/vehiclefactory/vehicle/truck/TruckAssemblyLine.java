package com.example.vehiclefactory.vehicle.truck;

import com.example.vehiclefactory.factory.AssemblyLine;

public class TruckAssemblyLine implements AssemblyLine {

    public Truck build() {

        TruckBody truckBody = new TruckBody("Red", 5, true);

        TruckChassis truckChassis = new TruckChassis("Middle", "Shock Absorbers");

        TruckEngine truckEngine = new TruckEngine(0, "Diesel", "Automatic", 12);

        TruckExtraFeatures truckExtraFeatures = new TruckExtraFeatures(true, "Mega", true,
                true);

        TruckWheel[] truckWheel = {new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road"),
                new TruckWheel(52, "Green", 60, "Off Road")};

        return new Truck("Yellow", "Ford", 8.0, 100, truckBody, truckChassis, truckEngine,
                truckExtraFeatures, truckWheel);
    }
}
