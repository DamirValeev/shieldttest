package lesson7march;

import static java.lang.System.out;

public class Fraction {
    double shislitel;
    double znamenatel;
    static double fracProc;
    static double frSum;

    Fraction(double shislitel, double znamenatel) {
        this.shislitel = shislitel;
        this.znamenatel = znamenatel;
    }

    double fracInProc() {
        fracProc = (shislitel/znamenatel)*100;
        out.println(fracProc);
        return fracProc;
    }

    double fracSum() {
        frSum = shislitel + znamenatel;
        out.println(frSum);
        return frSum;
    }
}
