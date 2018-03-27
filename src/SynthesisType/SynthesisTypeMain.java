package SynthesisType;

import lesson15march.Venicle;
import lesson20march.example3.Number;

class Gen<T, V> {
    T ob1;
    V ob2;
    Gen(T obj1, V obj2) {
        ob1 = obj1;
        ob2 = obj2;
    }

    public T getOb1() {
        return ob1;
    }
    V getOb2() {
        return ob2;
    }
   void showType() {
       System.out.println(ob1.getClass().getName() + "\t\t" + ob2.getClass().getName());
   }
}
class Pair<H, V extends H> {
    H first;
    V second;
    Pair(H a, V b) {
        first = a;
        second = b;
    }
}

public class SynthesisTypeMain {
    public static void main(String[] args) {
//        Gen<Integer> iOb;
//        iOb = new Gen<Integer>(400);
//        Gen<String> strOb;
//        Gen<Venicle> vehicleOb = new Gen<Venicle>(new Venicle("323",232));
//        strOb = new Gen<String>("sddfs");
//        iOb.showType();
//        strOb.showType();
//        vehicleOb.showType();
        Gen<String, Integer> strAndInt = new Gen<>("строка", 34);
        strAndInt.showType();

//        Pair<Number, Number> x = new Pair<Number, Number>();
    }
}
