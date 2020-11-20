package com.example.vehiclefactory;


import com.example.vehiclefactory.factory.VehicleFactory;
import com.example.vehiclefactory.vehicle.Vehicle;

import static com.example.vehiclefactory.factory.VehicleType.*;

public class VehicleFactoryApplication {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();


        Vehicle vehicleCar = vehicleFactory.build(CAR);

        vehicleCar.built();

        vehicleCar.drive();



        Vehicle vehicleBike = vehicleFactory.build(BIKE);

        vehicleBike.built();

        vehicleBike.drive();



        Vehicle vehicleTruck = vehicleFactory.build(TRUCK);

        vehicleTruck.built();

        vehicleTruck.drive();


    }

}
