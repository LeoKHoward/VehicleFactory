package com.example.vehiclefactory.factory;

import com.example.vehiclefactory.vehicle.Vehicle;
import com.example.vehiclefactory.vehicle.bike.BikeAssemblyLine;
import com.example.vehiclefactory.vehicle.car.CarAssemblyLine;
import com.example.vehiclefactory.vehicle.truck.TruckAssemblyLine;

public class VehicleFactory {

    public Vehicle build(VehicleType vehicleType) {


        switch (vehicleType) {
            case CAR:
                return new CarAssemblyLine().build();
            case BIKE:
                return new BikeAssemblyLine().build();
            case TRUCK:
                return new TruckAssemblyLine().build();
            default:
                throw new IllegalArgumentException("Incorrect type of vehicle!");
        }

    }

}
