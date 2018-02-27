import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

class FirstMetod extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i=0; i<100; i++) {
                out.print("FirstMetod");
                Thread.sleep(400);
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
        out.print("SecondMetod");
        try {
            for (int i = 0; i < 100; i++) {
                out.println("SecondMetod");
                Thread.sleep(300);
            }
        }
        catch (InterruptedException object) {
            out.println("ErrorOnSecondFlow");
        }
    }
}


public class TwoMetodsForFlow {
    public static void main(String args[]) throws IOException {
        Thread fm = new FirstMetod();
        fm.start();

        SecondMetod sm = new SecondMetod();
        Thread forSM = new Thread(sm);
        forSM.start();

        for(int j=0; j<10; j++){
            out.println("Main METOD finish first");
            try {
                Thread.sleep(800);
            }
            catch (InterruptedException ob) {
                out.println("Error on MAIN Flow");
            }
        }
ВОТ ОРИГИНАЛ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}
