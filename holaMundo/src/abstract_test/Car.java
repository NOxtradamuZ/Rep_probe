package abstract_test;

public class Car extends Vehicle{
    private String brand;
    private String type;
    private float speed;

    public Car() {
    }

    public Car(String brand, String type, float speed) {
        this.brand = brand;
        this.type = type;
        this.speed = speed;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getType() {
        return this.type;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void start() {
        System.out.println("Start in Car class");
    }

    @Override
    public void forward() {
        System.out.println("Forward in the Car Class");
    }
}
