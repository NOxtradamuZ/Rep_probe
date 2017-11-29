package abstract_test;

public class TestsAbstract {
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
        landRover.stop();
        landRover.forward();
        opelZafira.start();
        opelZafira.forward();
        ferrariEnzo.start();
    }
}
