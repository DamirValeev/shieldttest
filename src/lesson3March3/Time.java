package lesson3March3;
import static java.lang.System.out;

public class Time {
    int seconds;
    int minutes;
    int hours;
    Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    int getSecondsInTime() {
        int gvSec;
        gvSec = seconds + (minutes * 60) + (hours * 3600);
        out.println(gvSec);
        return gvSec;
    }
    void getSecondsInTime2() {
        out.println(seconds + ((minutes * 60) + (hours * 3600)));
    }
    void giveTimeNow() {
        out.println(hours + ":" + minutes + ":" + seconds);
    }

    int plus5Sec() {
        seconds+=5;
        if(seconds>=60) {
            minutes++;
            seconds-=60;
        }
        return seconds;
    }
}
