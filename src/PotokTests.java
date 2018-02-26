import static java.lang.System.out;
import java.io.*;

class MyTed implements Runnable {
    String str;
    MyTed(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        try{
            out.println(str + " - запуск");
            for(int i=0; i<20; i++) {
                Thread.sleep(600);
                out.println(str + " ПЕРИОД " + i);
            }
        }catch (InterruptedException obj) {
            out.println(" Ошибка ");
        }
    }
}
class SeriesDemo {
    public static void main(String args[]) throws IOException {
        MyTed mhtr = new MyTed("ПОТОК 1");
        Thread flow = new Thread(mhtr);
        flow.start();
        for(int j=0; j<1;) {
            try {
                Thread.sleep(50);
                out.print("*");
            }
            catch (InterruptedException obj) {
                out.println("ошибка на внутреннем потоке");
            }
        }
    }
}

