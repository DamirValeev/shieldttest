package Horstmann.Abstract;

import static java.lang.System.out;

public abstract class Abs {
    abstract void kuku();
}

class TestAbs extends Abs {
    @Override
    void kuku() {
        out.println("KU-KU");
    }
}
