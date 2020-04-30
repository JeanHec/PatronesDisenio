package patronesCreacionales.abstractFactory.entidad;

import patronesCreacionales.abstractFactory.service.Motorbike;

//Producto Concreto
public class CruiseMotorbike implements Motorbike {

	public String getType() {
		return "Cruise!";
	}

	public int getWheels() {
		return 2;
	}

	public int getSeats() {
		return 2;
	}
}