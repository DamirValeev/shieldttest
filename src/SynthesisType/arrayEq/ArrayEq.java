package SynthesisType.arrayEq;

class TestesArrayEq {
    static <T extends Comparable<T>, V extends T> boolean arrayEq(T[] arr1, V[] arr2) {
        if (arr1.length == arr2.length) {
            return true;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}

public class ArrayEq {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5};
        Integer[] num1 = {1, 2, 3, 4, 5, 5};
        Integer[] num2 = {1, 2, 3, 4, 5};
        Integer[] num3 = {1, 2, 3, 4, 2};
        if (TestesArrayEq.arrayEq(num, num2)) {
            System.out.println("YES");
        }
//        int[] num6 = {1,2,3,4,5};
//        int[] num7 = {1,2,3,4,5};
//        if (TestesArrayEq.arrayEq(num6, num7)) {
//            System.out.println("YES");
//        }

    }
}
