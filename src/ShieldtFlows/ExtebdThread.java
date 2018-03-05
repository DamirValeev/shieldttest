package ShieldtFlows;

import static java.lang.System.out;

class MyThread implements Runnable {
    Thread thrd;

    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
        thrd.setName(name);
    }

    @Override
    public void run() {
        try {
            out.println(thrd.getName() + " начал работу ");
            for (int i = 0; i < 100; i++) {
                Thread.sleep(50);
                out.print(".");
            }
        } catch (InterruptedException obj) {
            out.println("ERROR");
        }
        finally {
            out.println();
        }
    }
}

public class ExtebdThread {
    public static void main(String args[]) {
        MyThread MT1 = new MyThread("MT111");
        MyThread MT2 = new MyThread("MT222");
        MyThread MT3 = new MyThread("MT333");
        try {
            MT1.thrd.join();
            MT2.thrd.join();
            MT3.thrd.join();
            MT1.thrd.getPriority();
        } catch (InterruptedException obj) {
            out.println("ERROR");
        }
        out.println("КОНЕЦ ОСНОВНОГО ПОТОКА");
    }
}
