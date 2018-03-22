package lesson20march.example3.ex3_3;

public class MounthException extends Exception {
    Mounth mn;

    MounthException(String s) {
        s = "ошибка введения месяца";
    }

    public Mounth getMn() {
        return mn;
    }
}

class DayExceprion extends Exception {
    public void giveMessage(){
        System.out.println(" Не верный формат даты ");
    }
}


