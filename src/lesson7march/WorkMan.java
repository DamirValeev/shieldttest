package lesson7march;
import static java.lang.System.out;

public class WorkMan {
    String lastName;
    String hisWork;
    double salary;
    int birthDay;
    static final int NOW_YEAR = 2018;

    WorkMan(String lastName, String hisWork, double salary, int birthDay) {
        this.lastName = lastName;
        this.hisWork = hisWork;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    double upSalary() {
        salary+=salary*0.15;
        out.println(salary);
        return salary;
    }

    void yearsWM() {
        out.println(NOW_YEAR - birthDay);
    }
}
