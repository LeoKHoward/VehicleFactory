package com.example.vehiclefactory.factory;


import com.example.vehiclefactory.vehicle.bike.Bike;
import com.example.vehiclefactory.vehicle.bike.BikeAssemblyLine;
import com.example.vehiclefactory.vehicle.car.Car;
import com.example.vehiclefactory.vehicle.car.CarAssemblyLine;
import com.example.vehiclefactory.vehicle.car.CarBody;
import com.example.vehiclefactory.vehicle.truck.Truck;
import com.example.vehiclefactory.vehicle.truck.TruckAssemblyLine;
import org.junit.jupiter.api.Test;

import static com.example.vehiclefactory.factory.VehicleType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



class VehicleFactoryTest {

    @Test
    void testReturnsFeaturesOfCarInstance() {

        VehicleFactory carVehicle = new VehicleFactory();

        Car car = (Car) carVehicle.build(CAR);

        assertEquals(car.getColour(), "Blue");
        assertEquals(car.getMake(), "Audi");
        assertEquals(car.getLitre(), 3.0);
        assertEquals(car.getTopSpeed(), 155);

    }

    @Test
    void testReturnsFeaturesOfBikeInstance() {

        VehicleFactory bikeVehicle = new VehicleFactory();

        Bike bike = (Bike) bikeVehicle.build(BIKE);

        assertEquals(bike.getColour(), "Black");
        assertEquals(bike.getMake(), "Suzuki");
        assertEquals(bike.getLitre(), 1.0);
        assertEquals(bike.getTopSpeed(), 180);
    }

    @Test
    void testReturnsFeaturesOfTruckInstance() {

        VehicleFactory truckVehicle = new VehicleFactory();

        Truck truck = (Truck) truckVehicle.build(TRUCK);

        assertEquals(truck.getColour(), "Yellow");
        assertEquals(truck.getMake(), "Ford");
        assertEquals(truck.getLitre(), 8.0);
        assertEquals(truck.getTopSpeed(), 100);

    }

//    @Test
//    void testThrowsIllegalArgumentException() {
//
//        VehicleFactory planeVehicle = new VehicleFactory();
//
//        assertEquals(planeVehicle.build(CAR), new CarAssemblyLine().build());
//
//        VehicleType planeVehicle = mock(VehicleType.class);
//
//        when(planeVehicle.ordinal()).thenReturn(CAR);
//
//
//
//    }
}