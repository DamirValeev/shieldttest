package lesson7march;

import static java.lang.System.out;

public class Product {
    String name;
    int priceInRuble;
    int price;
    int yearMake;
    int quantity;
    String makeR;
    static final int NOW_YEAR = 2018;
    static final int DOLLAR = 58;

    Product() {
        name = "Неопределен";
        price = 177;
        yearMake = 1970;
        quantity = 0;
        makeR = "НЕИЗВЕСТНЫЙ СОЗДАТЕЛЬ";
    }

    Product(String name, int priceInRuble, int quantity, String makeR) {
        this.name = name;
        this.priceInRuble = priceInRuble;
        this.quantity = quantity;
        this.makeR = makeR;
    }

    Product(String name, int price, int yearMake) {
        this.name = name;
        this.price = price;
        this.yearMake = yearMake;
        if (yearMake == NOW_YEAR) {
            this.price = (int) (price + (price * 0.2));
        }
    }

    int yearsAgoOfMake() {
        out.println(NOW_YEAR - yearMake);
        return NOW_YEAR - yearMake;
    }

    void getProductInfo() {
        out.println(name + " " + price + " " + yearMake);
    }

    int toCountInDollar() {
        out.println(priceInRuble * quantity / DOLLAR + " DOLLARS");
        return priceInRuble * quantity / DOLLAR;
    }

    int sumPrice(Product HUY) {
        out.println(priceInRuble * quantity + " Общая стоимость товара ");
        return priceInRuble * quantity;
    }
}
