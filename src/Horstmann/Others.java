package Horstmann;

import java.time.*;

import static java.lang.System.out;

class A {
    private String name;
    private int quantity;

    A() {
        name = "nothing";
        quantity = 0;
    }

    A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

class B extends A {
    private double price;

    B() {
        super();
    }

    B(String name, double price) {
        super(name);
        this.price = price;
    }

    void getInfo() {
        out.println(getName() + " " + price);
    }
}

public class Others {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2018, 4, 5);
        B b = new B("ds", 234);
        b.getInfo();
    }
}
