package lesson13march;

import java.util.Scanner;
import static java.lang.System.arraycopy;

import static java.lang.System.out;

public class Employers {
    String name;
    int yearMake;
    int stage;
    double salary;

    Employers(String name, int yearMake, int stage, double salary) {
        this.name = name;
        this.yearMake = yearMake;
        this.stage = stage;
        this.salary = salary;
    }

    @Override
    public String toString() {
        out.print(name + " " + salary);
        return name + " " + salary;
    }
}
