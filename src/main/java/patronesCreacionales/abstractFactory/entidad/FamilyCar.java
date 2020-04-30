package patronesCreacionales.abstractFactory.entidad;

import patronesCreacionales.abstractFactory.service.Car;

//Producto Concreto
public class FamilyCar implements Car {

	public int getDoors() {
		return 5;
	}

	public int getWheels() {
		return 4;
	}

	public int getSeats() {
		return 5;
	}
}
