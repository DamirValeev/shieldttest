package lesson24march.ex1;

import java.util.LinkedList;
import java.util.Scanner;

public class MenuRestaurant {
    LinkedList<Dish> menuDich = new LinkedList<>();

    void addDish(String name, double price) {
        menuDich.add(new Dish(name, price));
    }

    String giveMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наше меню: \n");
        for (Dish m: menuDich) {
            stringBuilder.append(m.toString() + "\n");
        }
        stringBuilder.append("Что желаете?\n");
        return stringBuilder.toString();
    }

    void printMenu() {
        System.out.println("Наше меню: ");
        for (Dish m: menuDich) {
            System.out.println(m.toString());
        }
        System.out.println("Что желаете?");
    }

    boolean contain(String dishEnter) {
        System.out.println("Dish::contain(); -- dishEnter:'" + dishEnter + "'");
        for(Dish dish : menuDich) {
            System.out.println("dish.toString():'" + dish.toString() + "'");
            if(dishEnter.equalsIgnoreCase(dish.getName())) {
                return true;
            }
        }
        return false;
    }

    void choiseYourDish(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        switch (str) {
            case "пловец":
                System.out.println("ЗАКАЗАНО");
                break;
            case "Суп":
                System.out.println("ЗАКАЗАНО");
                break;
        }
    }
}
