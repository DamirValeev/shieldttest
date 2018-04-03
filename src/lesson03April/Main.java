package lesson03April;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("textTest.txt"))) {
            File file = new File("textTestWrite.txt");
            file.createNewFile();
            List<String> stringList = new ArrayList<>();
            String str = bufferedReader.readLine();
            while (str != null) {
                if (str.length() > 30) {
                    stringList.add(str);
                }
                str = bufferedReader.readLine();
            }

            try (PrintWriter printWriter = new PrintWriter(new FileWriter("textTestWrite.txt"))) {
                Iterator<String> stringIterator = stringList.iterator();
                while (stringIterator.hasNext()) {
                    String str2 = stringIterator.next();
                    printWriter.write(str2 + "\n");
//                    stringIterator.next();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
