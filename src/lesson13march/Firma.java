package lesson13march;

import static java.lang.System.out;

public class Firma {
    Employers[] empl;
    static Employers[] yearTen;
    static final int NOW = 2018;

    void addEmp(Employers e, int x) {
        empl[x] = e;
    }

    Employers[] removeEmpl(int index) {
        for (int i = index; i < empl.length - 1; i++) {
            empl[i] = empl[i + 1];
        }
        Employers[] temp = new Employers[empl.length - 1];
        System.arraycopy(empl, 0, temp, 0, empl.length - 1);
        return temp;
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

    void inFo(Employers[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                out.println(obj[i].name + "\t " + obj[i].yearMake + "\t "
                        + obj[i].stage + "\t " + obj[i].salary);
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
        temp /= j;
        return temp;
    }

    static Employers[] giveMeTen(Employers[] obj) {
        int k = 0;
        yearTen = new Employers[obj.length];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                if (obj[i].stage > 10) {
                    yearTen[k] = obj[i];
                    k++;
                }
            }
        }
        return yearTen;
    }


}




