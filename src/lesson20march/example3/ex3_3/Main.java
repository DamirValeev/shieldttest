package lesson20march.example3.ex3_3;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try {
            Mounth m1 = new Mounth(45);
        }
        catch (MounthException d){
            out.println("ошибка введения месяца");
            d = new MounthException("1");
        }
     }
}
