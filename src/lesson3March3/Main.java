package lesson3March3;

import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        Datee dt = new Datee(1, 12, 2018);
//        dt.minusDate();
        dt.giveMeMyDate();
        dt.plusYear();
        dt.giveMeMyDate();
//        dt.rav();
//        dt.plusDateOneMounth();
//        dt.giveMeMyDate();
        out.println();
        Time tm = new Time(59, 5, 14);
//        tm.getSecondsInTime2();
//        tm.giveTimeNow();
        tm.giveTimeNow();
        tm.plus5Sec();
        tm.giveTimeNow();
        out.println();
        Rectangle ragl = new Rectangle(78,45,99,66);
        ragl.area();
        ragl.square();
        out.println();
        Book book1 = new Book("Shieldt", 750, 1800.35, 2006);
        book1.priceOnePage();
        book1.giveInfoBook();
        book1.oneYearAgo();
        book1.oneYearAgo();
        book1.oneYearAgo();
        book1.giveInfoBook();
        out.println();
        WorkMan wm = new WorkMan("Valeev", 21000, 2017, 8);
        wm.getInfoByMan();
        WorkMan.thisYear = 2019;
        WorkMan.thisMounth = 12;
        wm.experience();
        wm.getInfoByMan();
        wm.dDay();
        out.println(WorkMan.dayOfExperience);
    }
}
