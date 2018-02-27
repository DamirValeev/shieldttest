import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

class FirstMetod extends Thread{
    @Override
    public void run() {
        super.run();
        out.println("FirstMetod");
        try {
            for (int i=0; i<100; i++) {
                out.print("FirstMetod");
                Thread.sleep(150);
            }
        }
        catch (InterruptedException object) {
            out.println("ErrorOnFirstFlow");
        }
    }
}

class SecondMetod implements Runnable {
    @Override
    public void run() {
        out.print("FirstMetod");
        try {
            Thread.sleep(150);
        }
        catch (InterruptedException object) {
            out.println("ErrorOnFirstFlow");
        }
    }

}

public class TwoMetodsForFlow {
    static FirstMetod firstMetod;
    public static void main(String args[]) throws IOException {
        firstMetod = new FirstMetod();
        firstMetod.start();
    }
}
