package lesson13march;

import static java.lang.System.out;

public class Firma {
    Employers[] empl;
    static final int NOW = 2018;

    void addEmp(Employers e, int x) {
        empl[x] = e;
    }

    public Employers minSalary() {
        Employers temp;
        temp = empl[0];
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                if (temp.salary > empl[i].salary) {
                    temp = empl[i];
                }
            }
        }
        out.println("Минимальная ЗП у - " + temp.name);
        return temp;
    }

    public Employers maxSalary() {
        Employers temp;
        temp = empl[0];
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                if (temp.salary < empl[i].salary) {
                    temp = empl[i];
                }
            }
        }
        out.println("Максимальная ЗП у - " + temp.name);
        return temp;
    }

    void inFo() {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                out.println(empl[i].name + "\t " + empl[i].yearMake + "\t "
                        + empl[i].stage + "\t " + empl[i].salary);
            }
        }
    }

    static double midlSalary(Employers[] empl) {
        double temp = 0;
        int j = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                j++;
                temp += empl[i].salary;
            }
        }
        temp /= j;
        return temp;
    }

    static int midlYear(Employers[] empl) {
        int temp = 0;
        int j = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                j++;
                temp += (Firma.NOW - empl[i].yearMake);
            }
        }
        temp/=j;
        return temp;
    }


}




