package Horstmann.Abstract.Person;

import static java.lang.System.out;

public class TestPerson {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Student("Student", " tech and technology ");
        person[1] = new Employer("Emp1", 20000, 1990, 12, 24);
        person[2] = new Student("Stud-2", "VT&PO");
        person[3] = new Student("Student", " tech and technology ");
        for (Person p:person
             ) {
            out.println(p.getName() + " " + p.getDescription());
        }
        Object obj = new Employer("dsd",32,1932,2,3);
        Employer e = (Employer)obj;
        Employer[] staff = new Employer[1];
        obj = staff;
        Employer ee = new Employer("Emp1", 20000, 1990, 12, 24);
        out.println(obj.hashCode());
        out.println(obj.hashCode());
        String str1 = "f";
        String str2 = "OKAY";
        String str3 = new String("OKAY");
        out.println(str1.hashCode());
        out.println(str2.hashCode());
        out.println(str3.hashCode());

    }
}

abstract class Person {
    protected String name;

    abstract String getDescription();

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
