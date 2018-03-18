package Horstmann.Polimorfizm;

import java.io.FileWriter;
import static java.lang.System.out;
class Car {
    String size;
    Car(String size) {
        this.size = size;
    }
}
class FamilyCar extends Car{
    int members;
    FamilyCar(String size, int members) {
        super(size);
        this.members = members;
    }
}
class SportCar extends Car{
    int speed;
    SportCar(String size, int speed) {
        super(size);
        this.speed = speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Small");
        cars[1] = new FamilyCar("VeryBig", 8);
        cars[2] = new SportCar("Medium", 270);
        for (int i = 0; i < cars.length; i++) {
            Car temp = cars[i];
            if (temp instanceof FamilyCar) {
                FamilyCar familyCar = (FamilyCar) temp;
                out.println(familyCar.members);
            }

        }
    }
}
