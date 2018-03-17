package lesson17march;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Novice("Novice", 19, 2);
        humans[1] = new Opitniy("Opitniy", 28, 8);
        humans[2] = new Veteran("Veteran", 40, 23);
        humans[3] = new Opitniy("Opitniy - 2", 25, 6);
        humans[4] = new Novice("Novice - 2", 20, 5);
        for (int i = 0; i < humans.length; i++) {
            out.print(humans[i] + " выстрелил ");
            if (humans[i].shot()==true) {
                out.println("И ПОПАЛ В ЦЕЛЬ !!!");
                break;
            }
            out.println();
        }
    }
}
