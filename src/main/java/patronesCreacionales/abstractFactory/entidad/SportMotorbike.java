package patronesCreacionales.abstractFactory.entidad;

import patronesCreacionales.abstractFactory.service.Motorbike;

//Producto Concreto
public class SportMotorbike implements Motorbike {

	public String getType() {
		return "Sport!";
	}

	public int getWheels() {
		return 2;
	}

	public int getSeats() {
		return 1;
	}
}
