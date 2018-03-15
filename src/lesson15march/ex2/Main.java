package lesson15march.ex2;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer(2400, 4, 4096, 1000);
        Notebook nb = new Notebook(1700, 2, 2000, 320);
        pc.toString();
        nb.toString();
        out.println(pc.givePrice() + "  " + pc.isValid());
        out.println(nb.givePrice() + "  " + nb.isValid());
        pc.isValid();
        pc.givePrice();
        nb.isValid();
        nb.givePrice();
        pc.toString();
        nb.toString();

    }
}
