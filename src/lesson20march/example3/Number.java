package lesson20march.example3;

import static java.lang.System.out;

public class Number {
    private int num;

    Number(int num) {
        this.num = num;
    }

    Number() {
        num = 0;
    }

    public int getNum() {
        out.println(num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class EasyFraction extends Number {
    private int znamenatel;

    EasyFraction(int chislitel, int znamenatel) {
        super(chislitel);
        this.znamenatel = znamenatel;
    }

    EasyFraction() {
        super();
        znamenatel = 0;
    }

    void setFraction(int a, int b) {
        setNum(a);
        znamenatel = b;
    }

    int del() throws BadDelitel {
        if (znamenatel == 0) {
            throw new BadDelitel(this, "нельзя делить на ноль");
        } else
            return getNum() / znamenatel;
    }


}

class BadDelitel extends IllegalArgumentException {
    private Number number;

    BadDelitel(Number n, String message) {
        super(message);
        this.number = n;
    }

    public Number getNumber() {
        return number;
    }
}


class RunEx extends Exception {

}
