package lesson13march;

import java.util.Scanner;

import static java.lang.System.arraycopy;

import static java.lang.System.out;

public class Employers {
    String lastName;
    String name;
    int yearMade;
    double salary;
    static int sum = 0;

    {
        sum++;
    }

    Employers(String lastName, String name, int yearMade, double salary) {
        this.lastName = lastName;
        this.name = name;
        this.yearMade = yearMade;
        this.salary = salary;
    }

    void giveWhoIsThere() {
        out.println(lastName + " " + name + " " + yearMade + " " + salary);
    }

    static void addNew(Employers[] obj) {
        out.println("У нас новый сотрудник. Введите фамилию, имя, дату рождения, ЗП");
        Scanner sc = new Scanner(System.in);
        obj[sum] = new Employers(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
    }

    static double giveMinSalaryEmployer(Employers[] obj) {
        double minimal = obj[0].salary;
        for (int i = 0; i < sum; i++) {
            if (obj[i].salary < minimal) {
                minimal = obj[i].salary;
            }
        }
        out.println(minimal);
        return minimal;
    }

}


