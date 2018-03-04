package Horstmann;
import static java.lang.System.out;

public class main {
    public static void main(String args[]) {
        String str0 = "Rere";
        String str1 = "rere";
        boolean bl;
        bl = str0.equalsIgnoreCase(str1);
        out.println(bl);
    }
}
