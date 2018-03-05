package ShieldtFlows;

import static java.lang.System.out;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        out.print("TICK");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
                wait();
        } catch (InterruptedException obj) {
            out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // остановить часы
            state = "tocked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked"))
                wait();
        } catch (InterruptedException ехс) {
            out.println("Пpepывaниe потока");
        }
    }
}

class MyThread3 implements Runnable {
    Thread thrd;
    TickTock ttob;

    MyThread3(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttob = tt;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 15; i++) ttob.tick(true);
            ttob.tick(false);
        } else {
            for (int i = 0; i < 15; i++) ttob.tock(true);
            ttob.tock(false);
        }
    }
}

public class SyncBlocks {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread3 rtl = new MyThread3("Tick", tt);
        MyThread3 rt2 = new MyThread3("Tock", tt);
        try {
            rtl.thrd.join();
            rt2.thrd.join();
        } catch (InterruptedException ехс) {
            out.println("Пpepывaниe основного потока");
        }
    }
}
