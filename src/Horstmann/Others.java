package Horstmann;

import static java.lang.System.out;

class A {
    String name;
    int quantity;
    A(){
        name = "nothing";
        quantity = 0;
    }
    A(String name) {
        this.name = name;
    }
}

class B extends A {
    double price;
    B(){
        super();
    }
    B(String name, double price) {
        super(name);
        this.price = price;

    }
}

public class Others {
    public static void main(String[] args) {
        B b = new B("privet", 777.0);
        out.println(b.name);
        out.println(b.price);
    }
}
