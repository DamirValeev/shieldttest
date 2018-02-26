import java.io.IOException;
import static java.lang.System.out;

class MyThread implements Runnable {
    String thrdName;
    MyThread(String name) {
        thrdName = name;
    }

    @Override
    public void run() {
        out.println(thrdName + "запуск");
        try{
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                out.println("В " + thrdName + " , счетчик: " + count);
            }
        }
        catch (InterruptedException obj) {
            out.println(thrdName + "- STOPED");
        }
        out.println(thrdName + "- FINISHED");
    }
}

public class manyFlow {
    public static void main(String[] args) throws IOException{
        MyThread mT = new MyThread("Child #1");
        Thread newThrd = new Thread(mT);
        newThrd.start();
        for(int i=0; i<50; i++) {
            out.print(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException obj) {
                out.println("Прерывание основного потока");
            }
        }
        out.println("ЗАВЕРШЕНИЕ ОСНОВНОГО ПОТОКА");
    }
}

