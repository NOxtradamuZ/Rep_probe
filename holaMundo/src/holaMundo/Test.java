package holaMundo;

public class Test {

	public static void main(String[] args) {
		
		Car car1 = new Car (
				"BMW",
				"i8",
				250
				);
		
		Car car2 = new Car (
				"Audi",
				"A8",
				236
				);
		
		Car car3 = new Car (
				"Ferrari",
				"Testarossa",
				329
				);
		
		Car car4 = new Car (
				"Lamborghini",
				"Veneno",
				35
				);
		
		Car car5 = new Car (
				"Bugatti",
				"Chiron",
				450
				);
		
		Car[] cars = {
				car1,
				car2,
				car3,
				car4,
				car5
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

		
		

