package lesson13march;

import java.util.*;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        int[] array = new int[5];
        for (int y = 0; y < array.length; y++) {
            array[y] = scx.nextInt();
        }
        out.println(" Ваш массив ");
        for (int y : array
                ) {
            out.println(y);
        }

        out.println(" Удалены одиннаковые элементы ");

        int[] arrayEquals;
        arrayEquals = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = (arrayEquals.length-1); j>=0; j--) {
            }
        }


    }
}
