package lesson17march;

import static java.lang.System.out;

public abstract class Human {
    private String name;
    private int age;
    private int stage;

    Human(String name, int age, int stage) {
        this.name = name;
        this.age = age;
        this.stage = stage;
    }

    public int getAge() {
        return age;
    }

    public int getStage() {
        return stage;
    }

    public String getName() {
        return name;
    }

    abstract boolean shot();

    @Override
    public String toString() {
        return name;
    }
}


