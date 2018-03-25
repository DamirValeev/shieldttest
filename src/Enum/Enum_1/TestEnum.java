package Enum.Enum_1;

enum Transport {
    CAR(170), BUS(110), TRAIN(230), AIRPLANE(350);
    private int speed;

    public int getSpeed() {
        return speed;
    }

    Transport(int speed) {
        this.speed = speed;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Transport tsenum[] = Transport.values();
        for (Transport t1 : tsenum
                ) {
            System.out.println(t1 + " " + t1.getSpeed());
        }

        Transport tp, tp2, tp3;
        for (Transport temp : Transport.values()
                ) {
            System.out.println(temp + " " + temp.ordinal());
        }
        tp = Transport.BUS;
        tp2 = Transport.TRAIN;
        tp3 = Transport.BUS;

        System.out.println();
        if (tp.compareTo(tp2) == 0) {
            System.out.println("1111");
        }


    }
}
