package march23;

public class RunableClassTest implements Runnable{
    Thread nameFlow;
    RunableClassTest(String name) {
        nameFlow = new Thread(this, name);
        nameFlow.start();
    }
    @Override
    synchronized public void run() {
        try{
            for (int i = 0; i < 50; i++) {
                System.out.println(nameFlow.getName() + "...");
                Thread.sleep(45);
            }
        }
        catch (InterruptedException ob) {
            System.out.println("Error");
        }
    }
}

class Main {
    public static void main(String[] args) {
        RunableClassTest renable = new RunableClassTest("First");
        RunableClassTest renable2 = new RunableClassTest("Second");

    }
}
