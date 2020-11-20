package com.example.vehiclefactory;

import com.example.vehiclefactory.factory.VehicleFactory;
import com.example.vehiclefactory.factory.VehicleType;
import org.junit.jupiter.api.Test;

class VehicleFactoryApplicationTests {

	@Test
	void shouldReturnCarInstance() {

		VehicleFactory vehicleFactory = new VehicleFactory();

		vehicleFactory.build(VehicleType.CAR);





	}

}
