import static java.lang.System.out;

        import java.io.*;

class tryWithResource {
    public static void main(String args[]) throws IOException {
        int i;

        try (FileReader fin = new FileReader("C://testDir//tst.txt");
             FileWriter fout = new FileWriter("C://testDir//tst3232.txt")) {
            do {
                i = fin.read();
                if((char)i==' ') {
                    i = '-';
                }
                if(i != -1) {
                    fout.write(i);
                }
                } while (i != -1);
        } catch (IOException ob) {
            out.println("Ошибка IO");
        }

    }
}
