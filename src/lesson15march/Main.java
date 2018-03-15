package lesson15march;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Venicle car1 = new Venicle("Avto1", 140);
        BusinessCar bCar = new BusinessCar("Mercedes", 160);
        out.println(car1.toString());
        out.println(bCar.toString());
        car1.price();
        car1.upgradeModel();
        bCar.price();
        bCar.upgradeModel();
        out.println(car1.toString());
        out.println(bCar.toString());
    }
}
