package lesson20march;

import lesson17march.ex2.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
//        String str = "привет";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            throw new Exception("message of error");
//        }
//        catch (Exception obj) {
//            out.println("Exeption");
//        }
//        finally {
//            out.println("конечный вывод");
//        }

//        try {
//            hz("123");
//        } catch (TestExeption obj) {
//            out.print(obj.getString());
//        }
//        String str3 = null;
//        str3.length();
//
//        FG fg = new FG();
//        fg.f();
////    }
//        int y = 10;
//        try {
//            if (y==10) {
//                throw new TestExeption("ex");
//            }
//            else if (y==5){
//                throw new TestExeption3("ex3");
//            }
//            else throw new TestExeption2("ex2");
//        }catch (TestExeption | TestExeption2 | TestExeption3 ob){
//            out.println("Шляпа какаято");
//        }
//
//        int[] arr = new int[5];
//        try{
//            arr[5] = 576;
//        }
//        catch (ArrayIndexOutOfBoundsException obj) {
//            out.println("Выход за границы массива");
//        }

        int x=0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                String st = bf.readLine();
                x = Integer.parseInt(st);
            } catch (NumberFormatException ob) {
                out.println("ввели не верное число");
            }
        }while (x<100);

    }
}

class FG {
    public void g() throws TestExeption {
        throw new TestExeption("EX в g()");
    }

    public void f() {
        try {
            g();
        } catch (TestExeption obj) {
            out.println("Новое исключение с метода f()");
        }
    }

}


class TestExeption extends Exception {
    private String string;

    public TestExeption(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }
}

class TestExeption2 extends Exception {
    private String string;

    public TestExeption2(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }
}

class TestExeption3 extends Exception {
    private String string;

    public TestExeption3(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }
}


