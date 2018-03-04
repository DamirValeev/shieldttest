package lesson3March3;
import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        Datee dt = new Datee(1,12,2018);
//        dt.minusDate();
        dt.giveMeMyDate();
        dt.plusYear();
        dt.giveMeMyDate();
//        dt.rav();
//        dt.plusDateOneMounth();
//        dt.giveMeMyDate();
        out.println();
        Time tm = new Time(59,5,14);
//        tm.getSecondsInTime2();
//        tm.giveTimeNow();
        tm.giveTimeNow();
        tm.plus5Sec();
        tm.giveTimeNow();
    }
}
