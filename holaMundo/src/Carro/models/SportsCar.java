package Carro.models;
import Carro.Car;

public class SportsCar extends Car {
	
	private int aerodinamicalCoef;
	
	public SportsCar(int velocity, int aerodinamicalCoef) {
		super(velocity);
		this.aerodinamicalCoef = aerodinamicalCoef;
	}
	
	public int getAerodinamicalCoef() {
		return this.aerodinamicalCoef;
	}
}
