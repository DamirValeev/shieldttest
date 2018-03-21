package lesson20march;

import static java.lang.System.out;

class TsExcep1 extends Exception {
    private String ex;

    public TsExcep1(String string) {
        ex = string;
    }
}

class TsExcep2 extends TsExcep1 {
    private String ex;

    public TsExcep2(String string, String string2) {
        super(string);
        ex = string2;
    }
}

class TsExcep3 extends TsExcep2 {
    private String ex;

    public TsExcep3(String string, String string2, String string3) {
        super(string, string2);
        ex = string3;
    }
}


public class ex1_9_exception {
    public static void main(String[] args) {
        C c = new C();
        A a1 = c;
        try {
            c.meTod();
        }
        catch (TsExcep3 ob) {
//            ob.printStackTrace();
            out.print("NEWNEWN");
        }
    }
}

    class A {
        void meTod() throws TsExcep1 {
            throw new TsExcep1("1");
        }
    }

    class B extends A {
        void meTod() throws TsExcep2 {
            throw new TsExcep2("1", "2");
        }
    }

    class C extends B {
        void meTod() throws TsExcep3 {
            throw new TsExcep3("1", "2", "3");
        }
    }

