package lesson15march.ex2;

import static java.lang.System.out;

public class Computer {
    double gGzProcessor;
    int coreInside;
    int memory;
    int hardDrive;
    double price;

    Computer(double gGzProcessor, int coreInside, int memory, int hardDrive) {
        this.gGzProcessor = gGzProcessor;
        this.coreInside = coreInside;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    double givePrice() {
        price = gGzProcessor * coreInside / 100 + memory / 0.8 + hardDrive / 20;
        return price;
    }

    boolean isValid() {
        if (gGzProcessor > 2000 && coreInside > 2 && memory > 2048 && hardDrive > 320) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        out.print(gGzProcessor + "\t\t\t" + coreInside + "\t\t\t" + memory + "\t\t\t" + hardDrive);
        return gGzProcessor + "\t\t\t" + coreInside + "\t\t\t" + memory + "\t\t\t" + hardDrive;
    }
}

class Notebook extends Computer {
    int avtoWorkInMinutes;

    Notebook(double gGzProcessor, int coreInside, int memory, int hardDrive) {
        super(gGzProcessor, coreInside, memory, hardDrive);
    }

    double givePrice() {
        price = super.givePrice() + avtoWorkInMinutes / 10;
        return price;
    }

    boolean isValid() {
        if (super.isValid() && avtoWorkInMinutes > 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        out.println();
        super.toString();
        out.print("\t\t\t" + avtoWorkInMinutes + "\n");
        return gGzProcessor + "\t\t\t" + coreInside + "\t\t\t" + memory + "\t\t\t" + hardDrive;
    }
}
