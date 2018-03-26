package lesson24march.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MainCircleHumans {
    public static void main(String[] args) {
        ArrayList<HumanForCircle> circles = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            circles.add(new HumanForCircle(i + 1));
        }

//        for (int i = 0; i < circles.size(); i++) {
//            System.out.println(circles.get(i).getHumansNumber());
//        }
/** РАБОЧИЙ КОД
 for (int i = 0; i < circles.size(); i++) {
 System.out.println(i);
 if (i==2) {
 circles.remove(i);
 }
 if (i == circles.size() - 1) {
 i = 0;
 }
 }
 */

//        Iterator<HumanForCircle> iterator = circles.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().getHumansNumber()==2) {
//                circles.indexOf(2);
//                System.out.println("2323232323232");
//            }
//        }



        for (Iterator<HumanForCircle> iterator = circles.iterator(); iterator.hasNext();) {
            if (iterator.next().getHumansNumber()==2)
            iterator.remove();
        }



//        for (int i = 0; i < circles.size(); i++) {
//            System.out.println(circles.get(i).getHumansNumber());
//        }

//        for (int i = 0; i < circles.size(); i++) {
//            System.out.println(i);
//            if (i==2) {
//                circles.remove(i);
//            }
//            if (i == circles.size() - 1) {
//                i = 0;
//            }
//        }



//        Comparator<HumanForCircle> circleComparator = new Comparator<HumanForCircle>() {
//            @Override
//            public int compare(HumanForCircle o1, HumanForCircle o2) {
//                if (o1 < o2) {
//
//                }
//                return 0;
//            }
//        }

    }
}
