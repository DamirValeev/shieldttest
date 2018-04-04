package lesson03April;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class OperationFile {
    File file;

    //    Scanner sc = new Scanner(System.in);
//    String str = sc.nextLine();  //делал для ввода с консоли
    OperationFile(String str) {
        file = new File(str);
    }

    void addFile(String string) {
        file = new File(string);
        try {
            if (file.exists()) {
                System.out.println("file.exists():: " + string + " " + file.exists() + " Такой файл уже существует");
            } else {
                System.out.println("file.createNewFile():: " + string + " " + file.createNewFile());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void deleteFile(String string) {
        File f = new File(string);
        System.out.println("f.delete()::" + " " + string + " " + f.delete());
    }

    void renameOrReplace(String string, String string2) {
        File temp = new File(string);
        System.out.println("temp.renameTo(new File(string2)):: " + "In - " + string + " Out - " + string2 + " " + temp.renameTo(new File(string2)));
    }

//    void copyFile(String string) {
//        File temp = new File(string);
//        temp.
//    }

    void testFile() {
        if (file.exists()) {
            System.out.println("file.exists()::" + file.exists());
        }
    }
}

class OperationPath {
    Path path;

    OperationPath(String dest) {
        path = Paths.get(dest);
    }

    void addFile(String string) {
        Path path = Paths.get(string);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void deleteFile(String str) {
        Path path = Paths.get(str);
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void replaceFile(String str, String str2) {
        Path path = Paths.get(str);
        Path path2 = Paths.get(str2);
        if (!(Files.exists(path2))) {
            try {
                Files.copy(path, path2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void copyFile(String str, String str2) {
        Path path = Paths.get(str);
        Path path2 = Paths.get(str2);
        if (!(Files.exists(path2))) {
            try {
                Files.copy(path, path2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EX4 {
    public static void main(String[] args) {
//        OperationFile operationFile = new OperationFile("testDir");
////        operationFile.testFile();
//        operationFile.addFile("testDir/test2.txt");
//        operationFile.addFile("testDir/test3.txt");
////        operationFile.deleteFile("testDir/test2.txt");   //удаляет файлы
//        operationFile.deleteFile("testDir/test3.txt");
//        operationFile.renameOrReplace("testDir/test2.txt", "testDir/test737.txt");
        OperationPath operationPath = new OperationPath("testDir/test77.txt");
//        operationPath.addFile("testDir/test73437.txt");
//        operationPath.deleteFile("testDir/test73437.txt");
        operationPath.replaceFile("testDir/test77.txt", "test77.txt");
        operationPath.copyFile("test77.txt","test88.txt");
    }
}
