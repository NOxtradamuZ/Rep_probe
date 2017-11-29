package main;

import Carro.Car;
import Carro.models.FamilyCar;
import Carro.accesories.Wheel;

public class CarMover {
	
	public static void main (String[] args) {
		Car car = new Car(); 
		for (Wheel wheel : car.getWheels()) {
			wheel.rotate();
		}
		
		FamilyCar familyCar = new FamilyCar (10);
		for (Wheel wheel : familyCar.getWheels()) {
			wheel.rotate();
		}
		
		System.out.println("The familyCar trunk size is" + " " + familyCar.getTrunkSize());
		
		System.out.println(
				"The first speed is equal "
		+ familyCar.getVelocity() 
		+ " but in the end, the last speed is equal " 
		+ familyCar.setVelocity(150)
		);
	}

}
