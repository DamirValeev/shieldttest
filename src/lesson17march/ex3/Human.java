package lesson17march.ex3;
import static java.lang.System.out;

public abstract class Human {
    String name;
    int age;
    int num = (0 + (int) (Math.random() * 9));
    String[] str = {"Александр","Андрей","Анастасия","Ирина","Наталья","Павел","Роман", "Светлана", "Сергей", "Татьяна"};
    Human(){
        this.name = this.str[num];
        this.age = (int)(20 + (int) (Math.random() * 20));
    }

    abstract void sayHello();
    abstract void ello();

    void aboutME() {
        out.print("Меня зовут " + name + " и мне " + age + " лет, и я ");
    }
}

class Formal extends Human{

    void sayHello() {
        out.println(" Здравствуй, " + super.name);
    }

    void ello() {
        out.println(" Формал ");
    }
}
class Neformal extends Human {

    void sayHello() {
        out.println(" Привет, " + super.name + "!");
    }

    void ello() {
        out.println(" Неформал ");
    }
}
class Realist extends Human {

    void sayHello() {
        out.println(" Здравствуй " + super.name);
    }

    void ello() {
        out.println(" Реалист ");
    }
}
