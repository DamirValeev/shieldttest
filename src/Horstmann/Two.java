package Horstmann;

import static java.lang.System.out;

/**
 * @author Damir Valeev R.
 */

class Employee {
    private double salary;
    private String name;
    static int cool = 0;

    {
        cool++;
    }

    static {
        out.println("Класс использовался впервые ");
    }

    Employee() {
        salary = 200;
    }

    Employee(String str) {
        this();
        this.name = str;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public static void tripSal(Employee x) {
        x.raiseSalary(200);
    }

    public double getSalary() {
        return (double)(salary);
    }

    public void getInfo(Employee obj) {
        out.println(obj.salary + " " + obj.name);
    }

    public static void swap(Employee x, Employee y) { //метод содержит ссылки и не
        Employee temp = x;                              //не поменяет местами ссылки на объекты
        x = y;
        y = temp;
    }
}

class Manager extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        bonus += super.getSalary();
        return bonus;
    }
}

public class Two {
    public static void main(String[] args) {
        Employee harry = new Employee("ds");
        Employee baddy = new Employee("строка");
        baddy.getInfo(harry);
        out.println(Employee.cool);
        out.println();
        Manager mark = new Manager();
        out.println(mark.getSalary());
        mark.setBonus(2000);
        out.println(mark.getSalary());
    }
}
