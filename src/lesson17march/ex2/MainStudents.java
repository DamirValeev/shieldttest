package lesson17march.ex2;


public class MainStudents {
    public static void main(String[] args) {
        Student[] stud = new Student[10];
        stud[0] = new Typical("Typ1", 3);
        stud[1] = new Typical("Typ2", 3);
        stud[2] = new Typical("Typ3", 7);
        stud[3] = new Typical("Typ4", 20);
        stud[4] = new Typical("Typ5", 18);
        stud[5] = new Clever("Clev1", 16);
        stud[6] = new Clever("Clev2", 13);
        stud[7] = new Clever("Clev3", 19);
        stud[8] = new Clever("Clev4", 7);
        stud[9] = new Genius("GENIY", 1);

        for (int i = 0; i < stud.length; i++) {
            System.out.print(stud[i] + " сдает экзамен ");
            if (stud[i].exams() == true) {
                System.out.println(stud[i] + " СДАЛ ЭКЗАМЕН");
            }
            else System.out.println(stud[i] + " и В АРМИЮ!!!");

            System.out.println();
        }
    }
}
