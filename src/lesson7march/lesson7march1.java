package lesson7march;

import static java.lang.System.out;

public class lesson7march1 {
    public static void main(String args[]){
        Product prd = new Product("samovar", 60000, 2018);
        prd.getProductInfo();
        prd.yearsAgoOfMake();
        Product russianSHITProduct = new Product("owerCar", 450000,
                150, "ShitAvto");
        russianSHITProduct.toCountInDollar();
        russianSHITProduct.sumPrice(russianSHITProduct);

        Product SHitV2_0 = new Product("bla-bla", 50, 700, "BLABLA");
        SHitV2_0.sumPrice(SHitV2_0);

        out.println();
        Room MyRoom = new Room(30.0, 15.0, 2.5);
//        MyRoom.allAREA(MyRoom);
        MyRoom.allAREAWithOutDoorAndWindow();
        out.print(MyRoom.allAREAWithOutDoorAndWindow());
        out.println();

        WorkMan wm = new WorkMan("Valeev", "prog", 30000, 1990);
        wm.upSalary();
        wm.yearsWM();

        out.println();

        Fraction fr1 = new Fraction(8,25);
        fr1.fracInProc();
        fr1.fracSum();
    }
}
