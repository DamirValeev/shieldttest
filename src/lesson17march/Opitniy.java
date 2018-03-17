package lesson17march;

public class Opitniy extends Human{
    Opitniy(String name, int age, int stage){
        super(name, age, stage);
    }

    @Override
    boolean shot() {
        if (0.05 * getStage() > Math.random()) {
            return true;
        }
        else return false;
    }
}
