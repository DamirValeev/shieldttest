package lesson15march.ex4;
import static java.lang.System.out;

public class MainTaburet {
    public static void main(String[] args) {
        Taburetka tb = new Taburetka(0.52, 2);
        Chair ch = new Chair(0.65, 1, 0.57);
        out.println("Табуретка ");
        tb.toString();
        out.println("\nСтул ");
        ch.toString();
    }
}
