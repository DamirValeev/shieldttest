package lesson24march.ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        MenuRestaurant menuRestaurant = new MenuRestaurant();
        menuRestaurant.addDish("Плов", 10000);
        menuRestaurant.addDish("Суп", 5000);
        menuRestaurant.addDish("Жаркое", 4000);
        menuRestaurant.giveMenu();

        String stopWord = "все";
        Scanner sc = new Scanner(System.in);

        do {
//            dishMenu.printMenu();
            System.out.println(menuRestaurant.giveMenu());
            String dishEnter = sc.nextLine();
            if(dishEnter.equalsIgnoreCase(stopWord)) {
                break;
            }
            if(menuRestaurant.contain(dishEnter)) {
                System.out.println("Такое блюдо есть!");
            } else {
                System.out.println("Такого блюда Нету!");
            }
//            dishMenu.choiseYourDish();
        } while(true);

    }
}
