package lesson15march.ex4;

import static java.lang.System.out;

public class Taburetka {
    double height;
    int quality;

    Taburetka(double height, int quality) {
        this.height = height;
        this.quality = quality;
    }

    double quantityTab() {
        if (quality == 3) {
            return (4 * height + 12);
        } else return 5 * height + 14;
    }

    double price() {
        if (quality == 3) {
            return quantityTab() * 2;
        } else if (quality == 2) {
            return quantityTab() * 3;
        } else return quantityTab() * 4;
    }

    @Override
    public String toString() {
        out.print(height + " " + quality + " " + quantityTab() + " " + price());
        return super.toString();
    }
}

class Chair extends Taburetka {
    double heightBack;

    Chair(double height, int quality, double heightBack) {
        super(height, quality);
        this.heightBack = heightBack;
    }

    double quantityTab() {
        return super.quantityTab()+2*super.height*2+5;
    }

    @Override
    public String toString() {
        out.print(height + " " + quality + " " + quantityTab() + " " + price() + " " + heightBack);
        return height + " " + quality + " " + quantityTab() + " " + price() + " " + heightBack;
    }
}
