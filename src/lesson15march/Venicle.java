package lesson15march;
import static java.lang.System.out;
public class Venicle {
    String name;
    double maxSpeed;
    double price;

    Venicle(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    double price() {
        price = maxSpeed*100;
        return price;
    }

    double upgradeModel() {
        maxSpeed = maxSpeed+(maxSpeed*0.1);
        return maxSpeed;
    }

    @Override
    public String toString() {
        return name + "\t\t\t " + maxSpeed + "\t\t\t " + price;
    }
}

class BusinessCar extends Venicle {
    BusinessCar(String name, double maxSpeed) {
        super(name, maxSpeed);
    }

    double price() {
        price = maxSpeed*250;
        return price;
    }

    double upgradeModel() {
        maxSpeed += 5;
        return maxSpeed;
    }

    @Override
    public String toString() {
        return name + "\t\t\t " + maxSpeed + " \t\t\t" + price;
    }
}
