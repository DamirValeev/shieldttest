package Legasy;
 import static  java.lang.System.out;

class A {
    int x;
    A(int x) {
          this.x = x;
    }

    void hi(){
        out.println("Metod class A");            
    }                                                  
}

class B extends A {
    double d;
    B(int x, double d) {
        super(x);
        this.d = d;
    }
     void hi(){
         out.println("Metod class B");
}    }

public class TestLegacy {
    public static void main(String args[]) {
        A a = new A(10);
        B b = new B(20,20.0);
        B b2;
        A a2;
        a2 = b;
        a2.hi();


    }
}
