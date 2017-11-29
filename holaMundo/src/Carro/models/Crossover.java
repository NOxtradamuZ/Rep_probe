package Carro.models;
import Carro.Car;;


public class Crossover extends Car {
	
	private int suspensionHeight;
	
	public Crossover(int velocity, int suspensionHeight) {
		super(velocity);
		this.suspensionHeight = suspensionHeight;
		}
	
	public int getSuspensionHeight() {
		return this.suspensionHeight;
	}
}
