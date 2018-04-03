package lesson03April;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2017.3.2\\lib\\");
        Iterator<Path> pathIterator = path.iterator();
        Path pth = Paths.get("JetBrains");
        Path pth2 = Paths.get("C:/");
        while (pathIterator.hasNext()) {
            Path eq = pathIterator.next();
            pth2 = pth2.resolve(eq);
            if (eq.equals(pth)) {
                File file = pth2.toFile();
                String[] fileList = file.list();
                for (int i = 0; i < fileList.length; i++) {
                    System.out.println(fileList[i].toString());
                }
            }
        }
    }
}
