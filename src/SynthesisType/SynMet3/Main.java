package SynthesisType.SynMet3;

class MyClass<T extends Number> implements Comtaiment<T> {
    T[] arrayRef;
    MyClass(T[] o) {
        arrayRef = o;
    }
    @Override
    public boolean contains(T o) {
        for (T x: arrayRef) {
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }
}

//class TestCl implements Comtaiment<TestCl> {
//
////class TestCl implements Comtaiment<Double> {///   Обобщенный интерфейс включающий в себя сам клаасс
//                                                // ИЛИ УКАЗЫВАТЬ КОНКРЕТНЫЙ ТИП оболочки(Double, Integer, Short и тд)
//                                             //      Если что то другое то и сам класс должен быть обобщенным
//                                                //
////    @Override
////    public boolean contains(Double o) {
////        return false;
////    }
//
//    @Override
//    public boolean contains(TestCl o) {
//        return false;
//    }
//}

public class Main {
    public static void main(String[] args) {
        Integer[] arrIntov = {1,4,5,7};
        MyClass<Integer> synIntov = new MyClass<>(arrIntov);
        int f = (int)(1.456);
        if (synIntov.contains(f)) {
            System.out.println("DA");
        }
    }
}
