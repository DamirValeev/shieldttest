package lesson13march;

import static java.lang.System.out;

public class Main_Employers {
    public static void main(String[] args) {
        Firma venik = new Firma();
        venik.empl = new Employers[5];
        venik.addEmp(new Employers("Гена",1990,10,32000), 0);
        venik.addEmp(new Employers("Валера",1985,15,45000), 1);
        venik.addEmp(new Employers("Петя",1980,20,15000), 2);
        venik.addEmp(new Employers("Ебеня",1966,6,150000), 3);
        venik.inFo(venik.empl);
//        venik.minSalary();
//        venik.maxSalary();
//        venik.removeEmpl(3);
//        venik.inFo();
//        venik.minSalary();
//        venik.maxSalary();
//        out.println(Firma.giveMeTen(venik.empl));
        Firma.giveMeTen(venik.empl);
        venik.inFo(Firma.yearTen);



    }
}
