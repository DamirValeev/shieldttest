package lesson24march.ex1;

import java.util.LinkedList;

public class MenuDish {
    public static void main(String[] args) {
        LinkedList<Dish> menuDish = new LinkedList<>();
        menuDish.add(new Dish("Кальмары в сметане"));
        menuDish.add(new Dish("Рагу из лосося"));
        menuDish.add(new Dish("суп из залуп"));
        menuDish.get(0).setDishPrice(7600);
        menuDish.get(1).setDishPrice(5600);
        menuDish.get(2).setDishPrice(10000000);

        for (int i = 0; i < menuDish.size(); i++) {
            System.out.print(menuDish.get(i).toString() + " ");
        }
    }
}
