package lesson15march.ex3;

import static java.lang.System.out;

public class Student {
    String firstName;
    String lastName;
    String patrName;
    String facultative;
    int course;
    float minimalRateLast;

    Student(String f, String l, String p, String fac, int c, float min) {
        this.firstName = f;
        this.lastName = l;
        this.patrName = p;
        this.facultative = fac;
        this.course = c;
        this.minimalRateLast = min;
    }

    int upCourse() {
        if (minimalRateLast > 3) {
            course++;
        }
        return course;
    }

    double stipendia() {
        if (minimalRateLast == 4) {
            return 1200;
        } else if (minimalRateLast == 5) {
            return 1300;
        } else return 0;
    }

    @Override
    public String toString() {
        out.print(firstName + "\t\t\t" + lastName
                + "\t\t\t" + patrName + "\t\t\t" + facultative + "\t\t\t"
                + course + "\t\t\t" + minimalRateLast + "\t\t\t");
        out.println();
        return super.toString();
    }
}

class StudentContract extends Student {
    boolean paymentOrNot;

    StudentContract(String f, String l, String p,
                    String fac, int c, float min, boolean pay) {
        super(f, l, p, fac, c, min);
        this.paymentOrNot = pay;
    }

    int upCourse() {
        if (minimalRateLast > 3 && paymentOrNot == true) {
            course++;
        }
        return course;
    }

    double stipendia() {
        return 0;
    }

    @Override
    public String toString() {
        out.print(paymentOrNot + "\t\t\t");
        return super.toString();
    }
}
