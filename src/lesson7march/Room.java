package lesson7march;

import static java.lang.System.out;

public class Room {
    double lengthDLINA;
    double weigthSHIRINA;
    double heigthVISOTA;
    static double area;
    static double aLLarea;

    static final double sOneWindow = 30.0;
    static final double sOneDoor = 16.0;

    Room(double lengthDLINA, double weigthSHIRINA, double heigthVISOTA) {
        this.lengthDLINA = lengthDLINA;
        this.weigthSHIRINA = weigthSHIRINA;
        this.heigthVISOTA = heigthVISOTA;
    }

    double allAREA() {
        area = lengthDLINA * weigthSHIRINA;
        aLLarea = area + area + (area / 2);
        out.println(aLLarea);
        return aLLarea;
    }

    double allAREAWithOutDoorAndWindow() {
        allAREA();
        aLLarea = aLLarea - (sOneDoor + sOneWindow);
        return aLLarea;
    }

}
