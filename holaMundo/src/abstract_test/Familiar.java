package abstract_test;

public class Familiar extends Car {
    float trunkSize;
    int seats;

    public Familiar(String brand, String type, float speed) {
        super(brand, type, speed);
    }

    public float getTrunkSize() {
        return trunkSize;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void start() {
        super.start();
//        System.out.println("Start in Familiar class");
    }

    @Override
    public void stop() {
//        super.stop();
        System.out.println("Stop in Familiar class");
    }

    @Override
    public void forward() {
        System.out.println("Forward in the Familiar class");
    }
}
