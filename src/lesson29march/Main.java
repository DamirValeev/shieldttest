package lesson29march;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner cs = new Scanner(System.in);
//        String str = cs.nextLine();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\testfolder\\test.txt"))
        ) {
            String string = bufferedReader.readLine();
            for (int i = 0; i < 20 && string != null; i++) {
                stringLinkedList.add(string);
                string = bufferedReader.readLine();
            }
        } catch (IOException ob) {
            System.out.println("ERROR");
        }
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\testfolder\\test66.txt"))) {
            Iterator<String> stringIterator = stringLinkedList.iterator();
            while (stringIterator.hasNext()) {
                printWriter.println(stringIterator.next());
            }
        } catch (IOException obj) {
            System.out.println("Error");
        }
        System.out.println("-----------------------------------------");
        Iterator<String> stringIterator = stringLinkedList.iterator();
        for (int i = stringLinkedList.size() - 1; i >= 0; i--) {
            System.out.println(stringLinkedList.get(i));
        }
    }
}
