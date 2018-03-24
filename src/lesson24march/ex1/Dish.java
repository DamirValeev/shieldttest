package lesson24march.ex1;

public class Dish {
    private String name;
    private double price;

    Dish(String name) {
        this.name = name;
        price = 0;
    }

    void setDishPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }


}
