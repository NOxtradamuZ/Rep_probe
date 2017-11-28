package holaMundo;

public class NewTest {
	
	public static void main(String[] args) {
		
		Car car1 = new SportsCar (
				"Bugatti",
				"Chiron",
				450,
				0,
				1500
				);
		
		Car car2 = new FamilyCar (
				"Peugeot",
				"308",
				193,
				166,
				105
				);
		
		Car car3 = new AllTerrain (
				"Mitsubishi",
				"Pajero",
				180,
				663,
				247
				);
		
		//Test Methods;
		car1.run();
		car2.stop();
		car3.run();
		
		//Create an array of the different cars
		Car[] cars = {
				car1,
				car2,
				car3,
				};
				
		Car veryFastCar = compareCarSpeeds(cars);
		
		System.out.println("The fastest car is "
				+ veryFastCar.getBrand()
				+ " "
				+  veryFastCar.getType()
				+ " with "
				+ veryFastCar.getSpeed()
				+ " km/h"
		);	
	}
	
	public static Car compareCarSpeeds(Car[] cars) {
		double minTime = Double.MAX_VALUE;
		int distance = 100;
		Car fastestCar = new Car();
		
		for (Car car : cars) { //Car es la clase, car es el nombre que le damos a la nueva variable que guarda el array, y luego cars sería el array definido con anterioridad, se iría iterando.
			
			double carTimeForDistance = 
					(double)distance / (double)car.getSpeed();
			
			if (carTimeForDistance < minTime) {
				minTime = carTimeForDistance;
				fastestCar = car;
			}
		}
		return fastestCar;
	}
	
}
