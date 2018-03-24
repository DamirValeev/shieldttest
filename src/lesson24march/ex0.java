package lesson24march;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ex0 {
    public static void main(String[] args) {
        LinkedList<Integer> testlist = new LinkedList<>();
        for (int i = 0; i < 101; i++) {
            testlist.add(i);
        }

//        Iterator<Integer> testIterator = testlist.listIterator();

        for (int i = 0; i < testlist.size(); i++) {
            if (testlist.get(i) <= 5) {
                testlist.remove();
                i--;
            }
        }

//        for (int i = 0; i < testlist.size(); i++) {
//            int temp = testlist.get(i);
//            System.out.println(temp);
//        }
        System.out.println("--------------------------");

        int sumOfFiveteen = 0;
        for (int i = 0; i < testlist.size(); i++) {
            if (testlist.get(i) >= 15) {
                sumOfFiveteen += testlist.get(i);
            }
        }
        System.out.println(sumOfFiveteen);

        System.out.println("-----------------------------");

        for (int i = 0; i < testlist.size(); i++) {
            if (testlist.get(i) == 9) {
                testlist.add(i + 1, 11);
            }
        }

//        for (int i = 0; i < testlist.size(); i++) {
//            int temp = testlist.get(i);
//            System.out.println(temp);
//        }

        System.out.println("-----------------------------");

        int midl = testlist.size() / 2;
        int sumMid = 0;
        for (int i = midl; i < testlist.size(); i++) {
            sumMid += testlist.get(i);
        }
        sumMid /= midl;
        System.out.println(sumMid);

        System.out.println("----------------------------------");

        for (int i = 0; i < testlist.size(); i++) {
            if (testlist.get(i)<15 && testlist.get(i)>13) {
                testlist.remove(i);
            }
        }

        for (int i = 0; i < testlist.size(); i++) {
            int temp = testlist.get(i);
            System.out.println(temp);
        }
    }
}
