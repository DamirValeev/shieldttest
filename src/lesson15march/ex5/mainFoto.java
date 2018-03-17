package lesson15march.ex5;
import static java.lang.System.out;
public class mainFoto {
    public static void main(String[] args) {
        Foto ft1 = new Foto("samsung", 4, "пластиковый");
        DigitalFoto df = new DigitalFoto("Sony", 15, "металл", 4);
        ft1.toString();
        df.toString();
    }
}
