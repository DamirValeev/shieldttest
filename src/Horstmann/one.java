package Horstmann;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class one {
    public static void main(String[] args) {
      int b;
        BigInteger bgInt = BigInteger.valueOf(433243433);
        BigInteger bg2 = bgInt.divide(BigInteger.valueOf(3556632));
        out.println(bg2);
        int[] array = new int[15];
        for (int x=0; x<array.length; x++) {
            array[x] = x*2;
        }
        out.println(Arrays.toString(array));

        int[] ar1 = {145,24,36546,445,544,24,65,25,8,3,1,0};
//        int[] ar2 = new int[ar1.length];
//        ar1[2] = ar2[2];
        out.println(ar1[2]);
//        ar2[2] = 999;
        out.println(ar1[2]);
        Arrays.sort(ar1);
        out.println(Arrays.toString(ar1));

    }
}
