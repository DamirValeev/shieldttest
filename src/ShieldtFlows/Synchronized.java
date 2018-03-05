package ShieldtFlows;

import static java.lang.System.out;

class SumArray {
    private int sum;

    int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Teкyщee значение сум для " + Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException obj) {
                out.println("ER");
            }
        }
        return sum;
    }
}

class MyThread2 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread2(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    @Override
    public void run() {
        int sum;
        out.println(thrd.getName() + " - запуск");
        synchronized (sa) {                     //синхронизированный блок
            answer = sa.sumArray(a);
        }
        out.println("СУММА для " + thrd.getName() + " : " + answer);
        out.println(thrd.getName() + " - Завершение");
    }
}

public class Synchronized {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        MyThread2 mt1 = new MyThread2("ПОТОК #1 ", a);
        MyThread2 mt2 = new MyThread2("ПОТОК #2 ", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException obj) {
            out.println("ERROr");
        }
        out.println("Завершение основного потока");
    }
}
