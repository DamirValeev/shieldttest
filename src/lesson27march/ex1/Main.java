package lesson27march.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rose> all = new ArrayList<>();
        Rose flower = new Rose("Анжелика");
        Rose flower1 = new Rose("Виктория");
        Rose flower2 = new Rose("Гагарин");
        Rose flower3 = new Rose("AveMaria");
        Rose flower4 = new Rose("Катерина");
        Rose flower5 = new Rose("Юбилейная");

        all.add(flower);
        all.add(flower1);
        all.add(flower2);
        all.add(flower3);
        all.add(flower4);
        all.add(flower5);

        HashSet<Rose> flow_man = new HashSet<>();
        HashSet<Rose> flow_man1 = new HashSet<>();
        HashSet<Rose> flow_man2 = new HashSet<>();

        flow_man1.add(flower);
        flow_man1.add(flower4);
        flow_man1.add(flower5);

        flow_man2.add(flower3);
        flow_man2.add(flower4);
        flow_man2.add(flower);

        flow_man.add(flower3);
        flow_man.add(flower1);
        flow_man.add(flower);
        flow_man.add(flower3);
        flow_man.add(flower5);

//        HashSet<Rose> all_man = new HashSet<>();
//        all_man.addAll(flow_man);
//        all_man.addAll(flow_man1);
//        all_man.addAll(flow_man2);
//        Iterator<Rose> iterator = all_man.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        all_man.remove(flow_man1);
//        all_man.remove(flow_man2);
//
//        System.out.println("------------------");
//        iterator = all_man.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        HashSet<Rose> all_man = new HashSet<>();
        all_man.addAll(flow_man);
        all_man.retainAll(flow_man1);
        all_man.retainAll(flow_man2);
        Iterator<Rose> iterator = all_man.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------");
        all.removeAll(flow_man);
        all.removeAll(flow_man1);
        all.removeAll(flow_man2);
        iterator = all.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
