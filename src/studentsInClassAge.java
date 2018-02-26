import java.io.*;
import static java.lang.System.out;


class years {
    static BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
    static int getYears() {
        int back = 0;
        try {
            String str1 = bf1.readLine();
            back = Integer.parseInt(str1);
        }
        catch (NumberFormatException ob) {
            out.println(" ввели НЕ правильный формат ");
        }
        catch (IOException ob) {
            out.println(" ошибка ВВОДА вывода ");
        }
        return back;
    }
    static int fuckYear(){
        return 0;
    }
    static void errOfEnter() {
        out.println(" Была ошибка введения данных студента ");
    }
}

public class studentsInClassAge {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        out.println("Сколлько человек в классе?? ");
        String str = bf.readLine();
        int i = Integer.parseInt(str);
        int array[] = new int[i];
        for(i=0; i<array.length; i++) {
            out.println(" введите возвраст " + (i+1) + " студента ");
            array[i] = years.getYears();
            if(array[i]>100 || array[i]<15){
                out.println(" это точно не студент ");
                array[i] = years.fuckYear();
            }
        }
        for(i=0; i<array.length; i++) {
            out.println(" возвраст " + (i+1) + " студента " + " : " + array[i]);
            if(array[i]==0) {
                years.errOfEnter();
            }
        }
    }
}
