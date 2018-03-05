package ShieldtFlows;

import static java.lang.System.out;

class Flow extends Thread {
    Flow(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        super.run();
        out.println(getName() + " стартовала");
        try {
            for(int i = 0; i<20; i++) {
                Thread.sleep(500);
                out.println("В " + getName() + " значение " + i);
            }
        }
        catch (InterruptedException obj) {
            out.println(getName() + " прерван из-за ошибки ");
        }
        out.println(getName() + " ЗАВЕРШЕН");
    }
}

public class main {
    public static void main(String args[]) {
        out.println("Запуск основного потока");
        Flow FL = new Flow("Ebosh");
        Flow FL2 = new Flow("Ebosh2.0");
        try {
            for (int i = 0; i < 200; i++) {
                Thread.sleep(50);
                out.print("#");
            }
        }
        catch (InterruptedException obj) {
            out.println("Поток прерван из-за ошибки ");
        }
    }
}
