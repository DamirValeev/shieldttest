package lesson22march;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainLess9 {
    public static void main(String[] args) {
        /*
        String str = "Напишите программу, которая принимает строку и удаляет из этой строки все пробелы";
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(str);
        System.out.println(m.replaceAll(""));

        String str = "Напишите программу, которая принимает строку и удаляет из этой строки все пробелы";

        String[] split = str.split(" ");
        System.out.println("слов  = " + split.length);
        int j = 0;
        int k = 0;
        int q = 0;
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(Character.isDigit(str.charAt(i)));
            if (Character.isDigit(str.charAt(i))) {
                j++;
            }
            if (!(Character.isDigit(str.charAt(i)))) {
                k++;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                q++;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                q++;
            }
        }
        System.out.println("цифр "  + j);
        System.out.println("знаков " + k);
        System.out.println("заглавный " + q);

//------------------
        String str2 = "123+74854-45+12";
        Pattern p = Pattern.compile("[-+]?\\d+");
        Matcher matcher = p.matcher(str2);
//        String[] split = str2.split("\\d");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split.length);
//            Integer.parseInt(split[i]);
//        }
        int perForSum = 0;
        while (matcher.find()) {
            String date = matcher.group();
            System.out.println(date);
            int[] t = new int[4];
            int num = 0;
            num = Integer.parseInt(date);
            perForSum += num;
        }
        System.out.println(perForSum);

        ------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String strLong = null;
        String strShort = null;
        while (1 > 0) {
            String temp = sc.nextLine();
            String stop = "stop";
            if (temp.equals(stop)) {
                break;
            }
            if (strLong == null || strLong.length() < temp.length()){
                strLong = temp;
            }
            if (strShort == null || strShort.length() > temp.length()){
                strShort = temp;
            }
            i++;
        }
        System.out.println(strLong + " " + strShort);
*/




    }
}
