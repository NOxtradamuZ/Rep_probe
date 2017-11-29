package abstract_test;

public abstract class Vehicle implements Enginezable {

    @Override
    public void start() {
        System.out.println("Starting in the abstract class");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in the abstract class");
    }

    public abstract void forward();
}
