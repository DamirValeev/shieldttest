import java.util.Scanner;

import static java.lang.System.out;

public class march1lessonJava2 {
    public static void main(String args[]) {
        /*
        //1.	Найти все числа некратные пяти и кратные 3, и сумма цифр которых также некратные пяти и кратна 3.
//        int ar[] = new int[50];
        for(int i=0; i<20; i++) {
            for(int j=0; j<20; j++) {
//                if (i % 5 != 0 && i % 3 == 0)
                    if(i+j!=5 && i+j==3)
                    out.println(i + " число ");
//                }
            }
        }

        //2.	Найти все числа кратные пяти для чисел от 1 до N.

        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for(int i=0; i<z; i++) {
            if(i%5==0) {
                out.println("число кратное 5 " + i);
            }
        }


//        3.	Является ли заданное натуральное число степенью двойки?
        while(true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            while (num != 1 && num % 2 == 0) {
                num /= 2;
            }
            System.out.println(num == 1 ? "YES" : "NO");
            if(num==1){
                break;
            }
        }

//        1.	Даны два целых числа A и B (A < B). Найти все целые числа, расположенные между данными числами (включая сами эти числа), в порядке их возрастания, а также количество N этих чисел.
        int a = 2, b = 30;
        int lock=0;
        while (a < b) {
            out.println(a);
            a++;
            lock++;
        }
        out.println(lock + " количество");

//        ..2.	Даны два целых числа A и B (A < B). Найти все целые числа, расположенные между данными числами (не включая сами эти числа), в порядке их убывания, а также количество N этих чисел.
        int a = 2, b = 30;
        int lock = 0;
        while (a+1 < b) {
            b--;
            out.println(b);
            lock++;
        }
        out.println(lock + " количество");
        */
        //1.	Ввести с клавиатуры два числа. Определить, что больше, сумма квадратов или квадрат суммы этих чисел. Ответ вывести в виде сообщения.Sc
        Scanner sc = new Scanner(System.in);
        out.println("Vvedite A");
        int a = sc.nextInt();
        out.println("Vvedite B");
        int b = sc.nextInt();
        double z, x;
        z = Math.pow(a, 2) + Math.pow(b, 2);
        x = (int)Math.pow(a + b, 2);
        if (z<x){
            out.println("SUUMA KV ");
        }else{

            out.println("KVADRAT ");
        }

    }
}

