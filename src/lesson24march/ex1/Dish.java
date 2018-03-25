package lesson24march.ex1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Dish {
    private String name;
    private double price;

    Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setDishPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
