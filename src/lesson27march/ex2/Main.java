package lesson27march.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Comand> hashCommand= new HashSet<>();
        hashCommand.add(new Comand("com1", "usa", "winter", 100));
        hashCommand.add(new Comand("com2", "sssr", "summer", 200));
        hashCommand.add(new Comand("com3", "canada", "winter", 300));
        hashCommand.add(new Comand("com4", "russia", "summer", 400));
        hashCommand.add(new Comand("com5", "italy", "outhem", 500));
        hashCommand.add(new Comand("com1", "usa", "winter", 100));

        Iterator<Comand> iterator = hashCommand.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        System.out.println("------------------");
        TreeSet<Comand> comandsSortName = new TreeSet<>();
        comandsSortName.addAll(hashCommand);
        iterator = comandsSortName.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }


    }
}
