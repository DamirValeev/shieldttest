package march22Home;


class Tw1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println(1111111111);
            }
        }catch (InterruptedException ob) {
            System.out.println("error");
        }
    }
}

class Tw2 implements Runnable {
    String str;
    Tw2(String s) {
        this.str = s;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
                Thread.sleep(150);
            }
        }catch (InterruptedException obj) {
            System.out.println("Error");
        }
    }
}

public class TsF {
    public static void main(String[] args) {
        Tw1 r = new Tw1();
        r.start();
        Tw2 t = new Tw2("хуевпоток");
        Thread gf = new Thread(t);
        gf.start();
    }
}
