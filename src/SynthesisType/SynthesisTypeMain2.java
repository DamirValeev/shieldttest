package SynthesisType;

//import static java.lang.Math.*;
class Vehicle {
    private String str="2222";

    public String getStr() {
        System.out.println(str);
        return str;
    }
}

class Car extends Vehicle {
}

class SportCar extends Car {
}

class WarShip {

}

class Vehicle2<T> {
    T ob;

    Vehicle2(T ob) {
        this.ob = ob;
    }
    static void test(Vehicle2<? extends Vehicle> object) {

    }
}


public class SynthesisTypeMain2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        SportCar sc = new SportCar();
        WarShip ws = new WarShip();

        Vehicle2<Vehicle> vS = new Vehicle2<Vehicle>(v);
        Vehicle2<Vehicle> cS = new Vehicle2<>(c);
        Vehicle2<Vehicle> scS = new Vehicle2<Vehicle>(sc);
//        Vehicle2<Vehicle> wsS = new Vehicle2<Vehicle>(ws); //.......НЕ СРАБОТАЕТ

//        Integer ob1 = 45;
//        Vehicle2<Integer> strTest = new Vehicle2<>(ob1);
//        strTest.ob.
    }
}
