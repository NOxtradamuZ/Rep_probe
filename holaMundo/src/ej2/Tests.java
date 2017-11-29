package ej2;

public class Tests {
    public static void main(String[] args) {

        Crossover landRover = new Crossover(
                    "Land Rover",
                    "Cruiser",
                    10
                );

        Familiar opelZafira = new Familiar(
                    "Opel",
                    "Zafira",
                    40
                );

        Sports ferrariEnzo = new Sports(
                    "Ferrari",
                    "Enzo",
                    400
                );

        // Test methods.
        landRover.start();
        opelZafira.stop();
        ferrariEnzo.start();


        Car[] cars = {
            landRover,
            opelZafira,
            ferrariEnzo
        };

        Car veryFastCar = compareCarSpeeds(cars);
        System.out.println("The fastest car is " +
                 veryFastCar.getBrand() +
                 " " +
                 veryFastCar.getType() +
                 " with " +
                 veryFastCar.getSpeed() +
                 " km/h"
        );
    }

    public static Car compareCarSpeeds(Car[] cars) {
        double minTime = Double.MAX_VALUE;
        int distance = 100;
        Car fastestCar = new Car();

        for (Car car : cars) {

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
