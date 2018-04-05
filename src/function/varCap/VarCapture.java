package function.varCap;

import java.io.IOException;


public class VarCapture {
    public static void main(String[] args) {
        final int num = 10;
        MyFunc2 myFunc2 = (int n) -> {
            int v = num + n;
            int t = num;
            return v + t;
        };
        try { System.out.println(myFunc2.func(4)); }
        catch (IOException e) { e.printStackTrace(); }
        try { myFunc2.func(4); }
        catch (IOException e) { e.printStackTrace(); }
    }
}
