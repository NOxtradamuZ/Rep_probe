package abstract_test;

public class Crossover extends Car {
    private boolean fourByFour;
    private boolean extraWheel;

    public Crossover(String brand,
                     String type,
                     float speed) {
        super(brand, type, speed);
    }

    @Override
    public void start() {
//        super.start();
        System.out.println("Start in Crossover class");
    }

    public boolean isFourByFour() {
        return this.fourByFour;
    }

    public boolean isExtraWheel() {
        return this.extraWheel;
    }
}
