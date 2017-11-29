package Carro.models;
import Carro.Car;

public class FamilyCar extends Car {
	
	private int trunkSize;
	
	public FamilyCar(int trunkSize) {
		this.trunkSize = trunkSize;
	}
	
	public int getTrunkSize() {
		return this.trunkSize;
	}
}
