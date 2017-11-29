package abstract_test;

public class Sports extends Car {
    boolean convertible;
    int shifts;

    public Sports(String brand, String type, float speed) {
        super(brand, type, speed);
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getShifts() {
        return shifts;
    }

    @Override
    public void start() {
//        super.start();
        System.out.println("Start in Sports class");
    }

    @Override
    public void stop() {
//        super.stop();
        System.out.println("Stop in Sports class");
    }
}
