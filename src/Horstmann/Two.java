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
        salary = 2000;
    }

    Employee(String str) {
        this();
        this.name = str;
    }

    Employee(String str, double salary) {
        this.name = str;
        this.salary = salary;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public static void swap(Employee x, Employee y) { //метод содержит ссылки и не
        Employee temp = x;                            //не поменяет местами ссылки на объекты
        x = y;
        y = temp;
    }
}

class Manager extends Employee {
    private double bonus;
    private int year;

    Manager(String name, double salary, int year) {
        super(name);
        super.setSalary(salary);
        this.year = year;
    }

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
        Manager boss = new Manager("ВАСЯбля", 100500, 6666);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("lox1");
        staff[2] = new Employee("lox2");
        for (Employee x:staff
             ) {
            out.println(x.getSalary() + " " + x.getName());
        }


    }
}
