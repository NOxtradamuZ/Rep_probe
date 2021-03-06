package ej2;

public class Car {
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

    public void stop() {
        System.out.println();
    }
}
