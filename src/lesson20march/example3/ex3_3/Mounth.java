package lesson20march.example3.ex3_3;

import static java.lang.System.out;

public class Mounth {
    int mounth;

    Mounth(int mo) throws MounthException {
        if (mo < 0 && mo > 13) {
            throw new MounthException("dsds");
        } else
            this.mounth = mo;
    }
}

class Day {
    int day;

    Day(int day) throws DayExceprion{
        if (day < 32 && day > 0) {
            this.day = day;
        }
        else throw new DayExceprion();
    }
}
