import static java.lang.System.out;

import java.io.*;
public class TestClass {
    public static void main(String[] args) throws IOException{
        int i;
        FileInputStream fin = new FileInputStream("C://testDir//tst.txt");
        FileOutputStream fout = new FileOutputStream("C://testDir//test232121212121.txt");
        try {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != 1);
        }
        catch (FileNotFoundException ob) {
            out.println("FILE NOT FOUND");
        }
        finally {
            try{
                if(fin != null){
                    fin.close();
                }
            }catch (IOException ov) {
                out.println("FILE DONT CLOSE");
            }
            try{
                if(fout != null){
                    fout.close();
                }
            }catch (IOException ov) {
                out.println("FILE DONT CLOSE");
            }
        }
    }
}