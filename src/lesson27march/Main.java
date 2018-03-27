package lesson27march;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet.add(323);
        hashSet.add(32);
        hashSet.add(33);
        hashSet.add(23);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(3);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(6);
        hashSet2.add(6);
        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.addAll(hashSet2);
        hashSet3.addAll(hashSet);
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(7);
        Iterator<Integer> iterator2 = treeSet.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
