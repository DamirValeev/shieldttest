package lesson15march.ex3;
import static java.lang.System.out;

public class MainStud {
    public static void main(String[] args) {
        Student stud1 = new Student("Ivanov", "Ivan", "Ivanovich",
                "Ivanovskiy", 2, 4);
        StudentContract stContr1 = new StudentContract("Petrov","Petr", "petrovich",
                "Petrovskaya", 2, 4, true);
        StudentContract stContr2 = new StudentContract("Petrov","Petr", "petrovich",
                "Petrovskaya", 2, 4, false);
        stud1.toString();
        stContr1.toString();
        stContr2.toString();
        stud1.upCourse();
        stContr1.upCourse();
        stContr2.upCourse();
        out.println();
        stud1.toString();
        stContr1.toString();
        stContr2.toString();
    }
}
