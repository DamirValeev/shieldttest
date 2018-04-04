package lesson03April;


import java.io.File;

public class Ex3 {
    public static void main(String[] args) {
        File file = new File("testDir");
        if (file.exists()) {
            File[] filew = file.listFiles();
            for (int i = 0; i < filew.length; i++) {
                System.out.println(filew[i].getName());
            }
        }
    }
}
