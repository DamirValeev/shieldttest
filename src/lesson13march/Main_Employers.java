package lesson13march;

import static java.lang.System.out;

public class Main_Employers {
    public static void main(String[] args) {
        Employers[] emp = new Employers[10];
        emp[0] = new Employers("Petrov", "Petr", 1990, 15000);
        emp[1] = new Employers("Vasilev", "Vas9", 1981, 16000);
        emp[2] = new Employers("Maksimov", "Maksim", 1972, 17000);
        emp[3] = new Employers("Alexandrov", "Alexanrd", 1963, 18000);
        emp[4] = new Employers("Genadyev", "Genadiy", 1964, 19000);

        for (Employers obj : emp
                ) {
            if (obj != null) {
                obj.giveWhoIsThere();
            }
        }


        Employers.giveMinSalaryEmployer(emp);


//        Employers.addNew(emp);
//
//        out.println(" Вместе с новым сотрудником ");
//
//        for (Employers obj : emp
//                ) {
//            if (obj != null) {
//                obj.giveWhoIsThere();
//            }
//        }


    }
}
