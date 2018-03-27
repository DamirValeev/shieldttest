package lesson24march.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class HumanForCircle {
    private int numberMan;

    HumanForCircle(int num) {
        numberMan = num;
    }
    public int getHumansNumber() {
        return numberMan;
    }

    public void setHumansNumber(int num) {
        this.numberMan = num;
    }

//    public static int getIndex(ArrayList<HumanForCircle> ob) {
//        ob.indexOf();
//    }
}

class numberComporator implements Comparator<HumanForCircle> {
    @Override
    public int compare(HumanForCircle o1, HumanForCircle o2) {
        return 0;
    }
}


