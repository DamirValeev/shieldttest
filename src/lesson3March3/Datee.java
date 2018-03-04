package lesson3March3;
import static java.lang.System.out;

public class Datee {
    int day;
    int mounth;
    int year;

    Datee() {
        day = 0;
        mounth = 0;
        year = 1970;
    }

    Datee(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    int plusYear() {
        year++;
        return year;
    }

    int minusDate() {
        day -=2;
        if(day<=0) {
            mounth--;
            if(mounth<=0) {
                year--;
                mounth+=12;
            }
            day+=30;
        }
        return day;
    }

    int plusDateOneMounth() {
        mounth++;
        if(mounth>12) {
            year++;
            mounth = 1;
        }
        return mounth;
    }

    boolean rav() {
        if(day==mounth) {
            out.println("ЧИСло и месяц совпадают");
            return true;
        } else {
            out.println("совпадений нет");
        return false;
        }
    }

    void giveMeMyDate(){
        out.println(day + " " + mounth + " " + year);
    }
}
