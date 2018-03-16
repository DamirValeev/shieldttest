package lesson13march;

import java.util.*;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.in;
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
        array = remove(array);

        out.println(" Теперь ваш массив ");
        for (int y : array
                ) {
            out.println(y);
        }

    }

    public static int[] remove(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (current == numbers[j]) {
                    numbers = deleteItem(numbers, j);
                }
            }
        }
        return numbers;
    }

    static int[] deleteItem(int[] num, int index) {
        for (int i = index; i < num.length-1; i++) {
            num[i] = num[i + 1];
        }
        int[] newNum = new int[num.length - 1];
        System.arraycopy(num, 0, newNum, 0, newNum.length);
        return newNum;
    }
}

