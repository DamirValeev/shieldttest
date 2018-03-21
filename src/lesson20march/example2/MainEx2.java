package lesson20march.example2;

import java.util.Scanner;

import static java.lang.System.out;

class TwoNumbers {
    int result = 0;

    int takeTwoNum(int x, int y) {
        this.result = x / y;
        return this.result;
    }
}

public class MainEx2 {
    public static void main(String[] args) {
        TwoNumbers tn = new TwoNumbers();
        Scanner sc = new Scanner(System.in);
        int x, y;
        while (true) {
            try {

                x = sc.nextInt();
                y = sc.nextInt();
                tn.takeTwoNum(x, y);
                out.print(tn.takeTwoNum(x, y));
            } catch (ArithmeticException obj) {
                out.println("Вы поделили на ноль");
            }
        }
    }
}
