package SynthesisType;

import lesson15march.Venicle;

class Gen<T> {
    T ob;
    Gen(T object) {
        ob = object;
    }

    public T getOb() {
        return ob;
    }

   void showType() {
       System.out.println(ob.getClass().getName());
   }
}

public class SynthesisTypeMain {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(400);
        Gen<String> strOb;
        Gen<Venicle> vehicleOb = new Gen<Venicle>(new Venicle("323",232));
        strOb = new Gen<String>("sddfs");
        iOb.showType();
        strOb.showType();
        vehicleOb.showType();
    }
}
