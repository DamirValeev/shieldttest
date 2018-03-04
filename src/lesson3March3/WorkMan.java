package lesson3March3;

import static java.lang.System.out;

public class WorkMan {
    String lastName;
    double salary;
    int yearOfStartWork;
    int mounthOfStartWork;
    static int thisMounth;
    static int thisYear;
    int expYear = 0;
    int expMounth = 0;
    static int dayOfExperience;

    WorkMan(String lastName, double salary, int yearOfStartWork, int mounthOfStartWork) {
        this.lastName = lastName;
        this.salary = salary;
        this.yearOfStartWork = yearOfStartWork;
        this.mounthOfStartWork = mounthOfStartWork;
    }

    void experience() {
        expYear = thisYear - yearOfStartWork;
        expMounth = thisMounth - mounthOfStartWork;
    }

    void getInfoByMan() {
        out.println(expMounth + " месяцев " + expYear + " лет ");
    }
    void dDay() {
        dayOfExperience = (expMounth * 30) + (expYear * 365);
    }
}

