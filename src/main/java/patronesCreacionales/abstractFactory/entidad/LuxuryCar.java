package patronesCreacionales.abstractFactory.entidad;

import patronesCreacionales.abstractFactory.service.Car;

//Producto Concreto
public class LuxuryCar implements Car {

	public int getDoors() {
		return 2;
	}

	public int getWheels() {
		return 4;
	}

	public int getSeats() {
		return 2;
	}
}