package lesson17march;

public class Novice extends Human {

    Novice(String name, int age, int stage) {
        super(name, age, stage);
    }

    @Override
    boolean shot() {
        if (0.01 * getStage() > Math.random()) {
            return true;
        }
        else return false;
    }
}
