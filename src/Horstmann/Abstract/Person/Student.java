package Horstmann.Abstract.Person;

import java.time.LocalDate;

import static java.lang.System.out;

public class Student extends Person {
    private String masjor;

    Student(String name, String masjor) {
        super(name);
        this.masjor = masjor;
    }

    public String getDescription() {
        return " является абитуриентом - " + masjor;
    }
}


class Employer extends Person {
    private double salary;
    private LocalDate hireday;

    public Employer(String name, double salary, int year, int mounth, int day) {
        super(name);
        this.salary = salary;
        hireday = LocalDate.of(year, mounth, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    @Override
    String getDescription() {
        return String.format(" получает - $%.2f", salary);
    }

}
