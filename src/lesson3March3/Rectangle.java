package lesson3March3;
import static java.lang.System.out;

public class Rectangle {
    int x1, x2;
    int y1, y2;


    Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    double area() {
        double a = x1 - x2;
        double b = y1 - y2;
        out.println(a*b);
        return a * b;
    }

    boolean square() {
        if(x1-x2==y1-y2) {
            out.println("SQUARE");
            return true;
        }
        else{
            out.println("RECTANGLE");
            return false;
        }
    }
}

