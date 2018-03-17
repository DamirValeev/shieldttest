package lesson17march;

public class Veteran extends Human {
    Veteran(String name, int age, int stage) {
        super(name, age, stage);
    }

    @Override
    boolean shot() {
        if (0.9 - 0.01 * getAge() > Math.random()) {
            return true;
        } else return false;
    }
}
