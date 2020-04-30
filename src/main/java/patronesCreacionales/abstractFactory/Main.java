package patronesCreacionales.abstractFactory;

import java.util.Scanner;

import patronesCreacionales.abstractFactory.factory.VehicleAbstractFactory;
import patronesCreacionales.abstractFactory.service.Vehicle;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite el tipo de Fábrica: ");
		int typeAbstract = sc.nextInt();
		VehicleAbstractFactory abstractFactory = VehicleAbstractFactory.getFactory(typeAbstract);

		System.out.print("Digite el tipo de vehículo: ");
		int typeVehicle = sc.nextInt();

		Vehicle vehicle = abstractFactory.getVehicle(typeVehicle);
		System.out.println("Llantas: " + vehicle.getWheels());
		System.out.println("Asientos: " + vehicle.getSeats());
	}
}
